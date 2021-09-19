package com.syscho.graphql.jsonplaceholder;

import com.syscho.graphql.jsonplaceholder.jsonPlaceholder.Album;
import com.syscho.graphql.jsonplaceholder.jsonPlaceholder.MasterData;
import com.syscho.graphql.jsonplaceholder.jsonPlaceholder.Post;
import com.syscho.graphql.jsonplaceholder.jsonPlaceholder.UserInfo;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;
import java.util.concurrent.CompletableFuture;

interface IUserQuery {
    List<UserInfo> findAllUsers();

    CompletableFuture<List<Post>> findAllPosts();

    List<Album> findAllAlbums();

    MasterData findAll() throws InterruptedException;

    MasterData findAllWithFilter(DataFetchingEnvironment environment);
}
