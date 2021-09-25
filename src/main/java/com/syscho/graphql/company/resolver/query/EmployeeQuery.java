package com.syscho.graphql.company.resolver.query;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.syscho.graphql.company.repository.filter.FilterField;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import com.syscho.graphql.company.context.EmployeeContext;
import com.syscho.graphql.company.context.EmployeeContextBuilder;
import com.syscho.graphql.company.domain.Employee;
import com.syscho.graphql.company.repository.filter.EmployeeFilter;
import com.syscho.graphql.company.repository.EmployeeRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
@Slf4j
public class EmployeeQuery {

    private EmployeeRepository repository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public EmployeeQuery(EmployeeRepository repository, EmployeeContextBuilder contextBuilder) {
        this.repository = repository;
    }

    @DgsData(parentType = "QueryResolver", field = "employees")
    public List<Employee> findAll(DataFetchingEnvironment environment) {
        log.info(environment.getSelectionSet().getImmediateFields().toString());
        return (List<Employee>) repository.findAll();
    }

    private String extractSelectedFields(DataFetchingEnvironment env) {
        return env.getSelectionSet().getImmediateFields().stream().map(selectedField ->
                selectedField.getName()).collect(Collectors.joining(","));
    }


    @DgsData(parentType = "QueryResolver", field = "employee")
    public Employee findById(@InputArgument("id") String id, DataFetchingEnvironment env) {
        String query = "SELECT " + extractSelectedFields(env) + " FROM EMPLOYEE WHERE ID = " + id;
        return jdbcTemplate.queryForObject(query, Employee.class);
    }

    @DgsData(parentType = "QueryResolver", field = "employeesWithFilter")
    public Iterable<Employee> findWithFilter(@InputArgument("filter") EmployeeFilter filter) {
        Specification<Employee> spec = null;
        if (filter.getSalary() != null)
            spec = bySalary(filter.getSalary());
        if (filter.getAge() != null)
            spec = (spec == null ? byAge(filter.getAge()) : spec.and(byAge(filter.getAge())));
        if (filter.getPosition() != null)
            spec = (spec == null ? byPosition(filter.getPosition()) :
                    spec.and(byPosition(filter.getPosition())));
        if (spec != null)
            return repository.findAll(spec);
        else
            return repository.findAll();
    }

    private Specification<Employee> bySalary(FilterField filterField) {
        return (root, query, builder) -> filterField.generateCriteria(builder, root.get("salary"));
    }

    private Specification<Employee> byAge(FilterField filterField) {
        return (root, query, builder) -> filterField.generateCriteria(builder, root.get("age"));
    }

    private Specification<Employee> byPosition(FilterField filterField) {
        return (root, query, builder) -> filterField.generateCriteria(builder, root.get("position"));
    }
}
