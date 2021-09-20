package  com.syscho.graphql.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Post {
  private String userId;

  private Integer id;

  private String title;

  private String body;

  public Post() {
  }

  public Post(String userId, Integer id, String title, String body) {
    this.userId = userId;
    this.id = id;
    this.title = title;
    this.body = body;
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

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Post{" + "userId='" + userId + "'," +"id='" + id + "'," +"title='" + title + "'," +"body='" + body + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post that = (Post) o;
        return java.util.Objects.equals(userId, that.userId) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(body, that.body);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(userId, id, title, body);
  }

  public static  com.syscho.graphql.generated.types.Post.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String userId;

    private Integer id;

    private String title;

    private String body;

    public Post build() {
                   com.syscho.graphql.generated.types.Post result = new  com.syscho.graphql.generated.types.Post();
                      result.userId = this.userId;
          result.id = this.id;
          result.title = this.title;
          result.body = this.body;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Post.Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public  com.syscho.graphql.generated.types.Post.Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.Post.Builder title(String title) {
      this.title = title;
      return this;
    }

    public  com.syscho.graphql.generated.types.Post.Builder body(String body) {
      this.body = body;
      return this;
    }
  }
}
