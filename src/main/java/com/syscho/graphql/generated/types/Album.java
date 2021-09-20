package  com.syscho.graphql.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Album {
  private String userId;

  private Integer id;

  private String title;

  public Album() {
  }

  public Album(String userId, Integer id, String title) {
    this.userId = userId;
    this.id = id;
    this.title = title;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Album{" + "userId='" + userId + "'," +"id='" + id + "'," +"title='" + title + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album that = (Album) o;
        return java.util.Objects.equals(userId, that.userId) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(userId, id, title);
  }

  public static  com.syscho.graphql.generated.types.Album.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String userId;

    private Integer id;

    private String title;

    public Album build() {
                   com.syscho.graphql.generated.types.Album result = new  com.syscho.graphql.generated.types.Album();
                      result.userId = this.userId;
          result.id = this.id;
          result.title = this.title;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Album.Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public  com.syscho.graphql.generated.types.Album.Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.Album.Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
