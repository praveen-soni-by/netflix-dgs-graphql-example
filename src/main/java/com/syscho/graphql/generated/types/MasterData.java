package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class MasterData {
  private List<UserInfo> users;

  private List<Post> posts;

  private List<Album> albums;

  public MasterData() {
  }

  public MasterData(List<UserInfo> users, List<Post> posts, List<Album> albums) {
    this.users = users;
    this.posts = posts;
    this.albums = albums;
  }

  public List<UserInfo> getUsers() {
    return users;
  }

  public void setUsers(List<UserInfo> users) {
    this.users = users;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public List<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(List<Album> albums) {
    this.albums = albums;
  }

  @Override
  public String toString() {
    return "MasterData{" + "users='" + users + "'," +"posts='" + posts + "'," +"albums='" + albums + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MasterData that = (MasterData) o;
        return java.util.Objects.equals(users, that.users) &&
                            java.util.Objects.equals(posts, that.posts) &&
                            java.util.Objects.equals(albums, that.albums);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(users, posts, albums);
  }

  public static  com.syscho.graphql.generated.types.MasterData.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private List<UserInfo> users;

    private List<Post> posts;

    private List<Album> albums;

    public MasterData build() {
                   com.syscho.graphql.generated.types.MasterData result = new  com.syscho.graphql.generated.types.MasterData();
                      result.users = this.users;
          result.posts = this.posts;
          result.albums = this.albums;
                      return result;
    }

    public  com.syscho.graphql.generated.types.MasterData.Builder users(List<UserInfo> users) {
      this.users = users;
      return this;
    }

    public  com.syscho.graphql.generated.types.MasterData.Builder posts(List<Post> posts) {
      this.posts = posts;
      return this;
    }

    public  com.syscho.graphql.generated.types.MasterData.Builder albums(List<Album> albums) {
      this.albums = albums;
      return this;
    }
  }
}
