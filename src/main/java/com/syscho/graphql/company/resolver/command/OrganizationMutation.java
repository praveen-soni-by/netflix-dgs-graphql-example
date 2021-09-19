package com.syscho.graphql.company.resolver.command;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.syscho.graphql.company.domain.Organization;
import com.syscho.graphql.company.repository.OrganizationRepository;
import com.syscho.graphql.generated.types.OrganizationInput;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class OrganizationMutation {

    private final OrganizationRepository repository;

    @DgsData(parentType = "MutationResolver", field = "newOrganization")
    public Organization newOrganization(OrganizationInput organizationInput) {
        return repository.save(new Organization(null, organizationInput.getName(), null, null));
    }

}
