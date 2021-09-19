package com.syscho.graphql.jsonplaceholder.jsonPlaceholder;

import lombok.Data;

import java.util.List;

@Data
public class MasterData {
    private List<UserInfo> users;
    private List<Post> posts;
    private List<Album> albums;
}
