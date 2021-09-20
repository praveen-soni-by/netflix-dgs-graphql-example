package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class BookUpdateInput {
  private String id;

  private String title;

  private String genre;

  private String publisher;

  public BookUpdateInput() {
  }

  public BookUpdateInput(String id, String title, String genre, String publisher) {
    this.id = id;
    this.title = title;
    this.genre = genre;
    this.publisher = publisher;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  @Override
  public String toString() {
    return "BookUpdateInput{" + "id='" + id + "'," +"title='" + title + "'," +"genre='" + genre + "'," +"publisher='" + publisher + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookUpdateInput that = (BookUpdateInput) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(genre, that.genre) &&
                            java.util.Objects.equals(publisher, that.publisher);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, genre, publisher);
  }

  public static  com.syscho.graphql.generated.types.BookUpdateInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String title;

    private String genre;

    private String publisher;

    public BookUpdateInput build() {
                   com.syscho.graphql.generated.types.BookUpdateInput result = new  com.syscho.graphql.generated.types.BookUpdateInput();
                      result.id = this.id;
          result.title = this.title;
          result.genre = this.genre;
          result.publisher = this.publisher;
                      return result;
    }

    public  com.syscho.graphql.generated.types.BookUpdateInput.Builder id(String id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.BookUpdateInput.Builder title(String title) {
      this.title = title;
      return this;
    }

    public  com.syscho.graphql.generated.types.BookUpdateInput.Builder genre(String genre) {
      this.genre = genre;
      return this;
    }

    public  com.syscho.graphql.generated.types.BookUpdateInput.Builder publisher(String publisher) {
      this.publisher = publisher;
      return this;
    }
  }
}
