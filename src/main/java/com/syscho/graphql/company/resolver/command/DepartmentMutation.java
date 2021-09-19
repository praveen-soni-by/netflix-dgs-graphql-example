package com.syscho.graphql.company.resolver.command;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.syscho.graphql.company.domain.Department;
import com.syscho.graphql.company.domain.Organization;
import com.syscho.graphql.company.repository.DepartmentRepository;
import com.syscho.graphql.company.repository.OrganizationRepository;
import com.syscho.graphql.generated.types.DepartmentInput;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class DepartmentMutation {

    private final DepartmentRepository departmentRepository;
    private final OrganizationRepository organizationRepository;

    @DgsData(parentType = "MutationResolver", field = "newDepartment")
    public Department newDepartment(DepartmentInput departmentInput) {
        Organization organization = organizationRepository.findById(departmentInput.getOrganizationId()).orElseThrow();
        return departmentRepository.save(new Department(null, departmentInput.getName(), null, organization));
    }

}
