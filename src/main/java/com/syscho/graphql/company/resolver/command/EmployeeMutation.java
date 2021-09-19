package com.syscho.graphql.company.resolver.command;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.syscho.graphql.company.domain.Department;
import com.syscho.graphql.company.domain.Employee;
import com.syscho.graphql.company.domain.Organization;
import com.syscho.graphql.company.repository.DepartmentRepository;
import com.syscho.graphql.company.repository.EmployeeRepository;
import com.syscho.graphql.company.repository.OrganizationRepository;
import com.syscho.graphql.generated.types.EmployeeInput;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class EmployeeMutation {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final OrganizationRepository organizationRepository;

    @DgsData(parentType = "MutationResolver", field = "newEmployee")
    public Employee addEmployee(@InputArgument("input") EmployeeInput employeeInput, DataFetchingEnvironment environment) {
        Department department = departmentRepository.findById(employeeInput.getDepartmentId()).orElseThrow();
        Organization organization = organizationRepository.findById(employeeInput.getOrganizationId()).orElseThrow();
        return employeeRepository.save(new Employee(null, employeeInput.getFirstName(), employeeInput.getLastName(),
                employeeInput.getPosition(), employeeInput.getAge(), employeeInput.getSalary(),
                department, organization));
    }

}
