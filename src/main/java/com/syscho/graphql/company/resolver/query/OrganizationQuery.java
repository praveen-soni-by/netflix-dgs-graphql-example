package com.syscho.graphql.company.resolver.query;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException;
import com.syscho.graphql.company.domain.Organization;
import com.syscho.graphql.company.repository.OrganizationRepository;

@DgsComponent
public class OrganizationQuery {

    private OrganizationRepository repository;

    OrganizationQuery(OrganizationRepository repository) {
        this.repository = repository;
    }

    @DgsData(parentType = "QueryResolver", field = "organizations")
    public Iterable<Organization> findAll() {
        return repository.findAll();
    }

    @DgsData(parentType = "QueryResolver", field = "organization")
    public Organization findById(@InputArgument("id") Integer id) {
        return repository.findById(id).orElseThrow(DgsEntityNotFoundException::new);
    }
}
