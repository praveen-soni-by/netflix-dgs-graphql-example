package com.syscho.graphql.company.resolver.command;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.syscho.graphql.company.domain.Department;
import com.syscho.graphql.company.domain.Organization;
import com.syscho.graphql.company.model.DepartmentInput;
import com.syscho.graphql.company.repository.DepartmentRepository;
import com.syscho.graphql.company.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@DgsComponent
public class DepartmentMutation {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    DepartmentRepository departmentRepository;
    OrganizationRepository organizationRepository;

    DepartmentMutation(DepartmentRepository departmentRepository, OrganizationRepository organizationRepository) {
        this.departmentRepository = departmentRepository;
        this.organizationRepository = organizationRepository;
    }

    @DgsData(parentType = "MutationResolver", field = "newDepartment")
    public Department newDepartment(DepartmentInput departmentInput) {
        Organization organization = organizationRepository.findById(departmentInput.getOrganizationId()).orElseThrow();
        return departmentRepository.save(new Department(null, departmentInput.getName(), null, organization));
    }

}
