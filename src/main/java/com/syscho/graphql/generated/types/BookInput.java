package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class BookInput {
  private String title;

  private String genre;

  private String publisher;

  public BookInput() {
  }

  public BookInput(String title, String genre, String publisher) {
    this.title = title;
    this.genre = genre;
    this.publisher = publisher;
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
    return "BookInput{" + "title='" + title + "'," +"genre='" + genre + "'," +"publisher='" + publisher + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookInput that = (BookInput) o;
        return java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(genre, that.genre) &&
                            java.util.Objects.equals(publisher, that.publisher);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(title, genre, publisher);
  }

  public static  com.syscho.graphql.generated.types.BookInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String title;

    private String genre;

    private String publisher;

    public BookInput build() {
                   com.syscho.graphql.generated.types.BookInput result = new  com.syscho.graphql.generated.types.BookInput();
                      result.title = this.title;
          result.genre = this.genre;
          result.publisher = this.publisher;
                      return result;
    }

    public  com.syscho.graphql.generated.types.BookInput.Builder title(String title) {
      this.title = title;
      return this;
    }

    public  com.syscho.graphql.generated.types.BookInput.Builder genre(String genre) {
      this.genre = genre;
      return this;
    }

    public  com.syscho.graphql.generated.types.BookInput.Builder publisher(String publisher) {
      this.publisher = publisher;
      return this;
    }
  }
}
