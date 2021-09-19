package com.syscho.graphql.jsonplaceholder.jsonPlaceholder;

import lombok.Data;

@Data
public class UserInfo {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}