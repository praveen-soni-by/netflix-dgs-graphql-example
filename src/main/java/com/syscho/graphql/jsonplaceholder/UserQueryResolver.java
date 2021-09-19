package com.syscho.graphql.jsonplaceholder;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.syscho.graphql.generated.types.Album;
import com.syscho.graphql.generated.types.MasterData;
import com.syscho.graphql.generated.types.Post;
import com.syscho.graphql.generated.types.UserInfo;
import com.syscho.graphql.jsonplaceholder.client.JsonPlaceHolderClient;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@DgsComponent
@RequiredArgsConstructor
public class UserQueryResolver {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;
    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    @DgsData(parentType = "QueryResolver", field = "findAllUsers")

    public List<UserInfo> findAllUsers() {
        return jsonPlaceHolderClient.getUsers().block();
    }

    @DgsData(parentType = "QueryResolver", field = "findAllPosts")
    public CompletableFuture<List<Post>> findAllPosts() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return jsonPlaceHolderClient.getPosts().block();
            } catch (WebClientRequestException exception) {
                throw new RuntimeException("Service is down , try after some time");
            }
        }, executorService);

    }

    @DgsData(parentType = "QueryResolver", field = "findAllAlbums")
    public List<Album> findAllAlbums() {
        return jsonPlaceHolderClient.getAlbums().block();
    }

    @DgsData(parentType = "QueryResolver", field = "findAll")
    public MasterData findAll() {
        MasterData masterData = new MasterData();
        Mono<List<UserInfo>> users = jsonPlaceHolderClient.getUsers();
        Mono<List<Album>> albums = jsonPlaceHolderClient.getAlbums();
        Mono<List<Post>> posts = jsonPlaceHolderClient.getPosts();
        return Mono.zip(users, albums, posts)
                .map(objects -> {
                    masterData.setUsers(objects.getT1());
                    masterData.setAlbums(objects.getT2());
                    masterData.setPosts(objects.getT3());
                    return masterData;
                }).block();
    }


    @DgsData(parentType = "QueryResolver", field = "findAllWithFilter")
    public MasterData findAllWithFilter(DataFetchingEnvironment environment) {
        MasterData masterData = new MasterData();
        Mono<List<UserInfo>> users = null;
        Mono<List<Post>> posts = null;
        Mono<List<Album>> albums = null;

        if (environment.getSelectionSet().contains("users")) {
            users = jsonPlaceHolderClient.getUsers();
        }
        if (environment.getSelectionSet().contains("posts")) {
            posts = jsonPlaceHolderClient.getPosts();
        }
        if (environment.getSelectionSet().contains("albums")) {
            albums = jsonPlaceHolderClient.getAlbums();
        }

        if (null != users) masterData.setUsers(users.block());
        if (null != posts) masterData.setPosts(posts.block());
        if (null != albums) masterData.setAlbums(albums.block());

        return masterData;
    }
}

