package com.syscho.graphql.jsonplaceholder;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.syscho.graphql.generated.types.Album;
import com.syscho.graphql.generated.types.MasterData;
import com.syscho.graphql.generated.types.Post;
import com.syscho.graphql.jsonplaceholder.client.JsonPlaceHolderClient;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@DgsComponent
@RequiredArgsConstructor
@Slf4j
public class UserQueryResolver {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;
    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


    @DgsData(parentType = "QueryResolver", field = "posts")
    public CompletableFuture<List<Post>> getPosts() {
        return CompletableFuture.supplyAsync(() -> {
            return jsonPlaceHolderClient.getPosts().block();
        }, executorService);

    }

    @DgsData(parentType = "QueryResolver", field = "albums")
    public CompletableFuture<List<Album>> getAlbums() {
        return jsonPlaceHolderClient.getAlbums().toFuture();
    }

    @DgsData(parentType = "QueryResolver", field = "users")
    public CompletableFuture<List<com.syscho.graphql.generated.types.UserInfo>> getUsers() {
        return jsonPlaceHolderClient.getUsers().toFuture();
    }

    @DgsData(parentType = "QueryResolver", field = "masterData")
    public MasterData fetchAll(DataFetchingEnvironment environment) {
        MasterData masterData = new MasterData();
        return masterData;
    }

    @DgsData(parentType = "MasterData", field = "users")
    public CompletableFuture<List<com.syscho.graphql.generated.types.UserInfo>> postsUserFetcher() {
        log.info("executing ::postsUserFetcher::");
        return jsonPlaceHolderClient.getUsers().toFuture();
    }

    @DgsData(parentType = "MasterData", field = "posts")
    public CompletableFuture<List<com.syscho.graphql.generated.types.Post>> postsNestedFetcher() {
        log.info("executing ::postsNestedFetcher::");
        return jsonPlaceHolderClient.getPosts().toFuture();
    }

    @DgsData(parentType = "MasterData", field = "albums")
    public CompletableFuture<List<com.syscho.graphql.generated.types.Album>> albumNestedFetcher() {
        log.info("executing ::albumNestedFetcher::");
        return jsonPlaceHolderClient.getAlbums().toFuture();
    }

}

