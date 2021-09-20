package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book {
  private String id;

  private String title;

  private String genre;

  private String publisher;

  private LocalDate publishDate;

  private LocalDateTime createdTime;

  public Book() {
  }

  public Book(String id, String title, String genre, String publisher, LocalDate publishDate,
      LocalDateTime createdTime) {
    this.id = id;
    this.title = title;
    this.genre = genre;
    this.publisher = publisher;
    this.publishDate = publishDate;
    this.createdTime = createdTime;
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

  public LocalDate getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(LocalDate publishDate) {
    this.publishDate = publishDate;
  }

  public LocalDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }

  @Override
  public String toString() {
    return "Book{" + "id='" + id + "'," +"title='" + title + "'," +"genre='" + genre + "'," +"publisher='" + publisher + "'," +"publishDate='" + publishDate + "'," +"createdTime='" + createdTime + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(genre, that.genre) &&
                            java.util.Objects.equals(publisher, that.publisher) &&
                            java.util.Objects.equals(publishDate, that.publishDate) &&
                            java.util.Objects.equals(createdTime, that.createdTime);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, genre, publisher, publishDate, createdTime);
  }

  public static  com.syscho.graphql.generated.types.Book.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String title;

    private String genre;

    private String publisher;

    private LocalDate publishDate;

    private LocalDateTime createdTime;

    public Book build() {
                   com.syscho.graphql.generated.types.Book result = new  com.syscho.graphql.generated.types.Book();
                      result.id = this.id;
          result.title = this.title;
          result.genre = this.genre;
          result.publisher = this.publisher;
          result.publishDate = this.publishDate;
          result.createdTime = this.createdTime;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Book.Builder id(String id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.Book.Builder title(String title) {
      this.title = title;
      return this;
    }

    public  com.syscho.graphql.generated.types.Book.Builder genre(String genre) {
      this.genre = genre;
      return this;
    }

    public  com.syscho.graphql.generated.types.Book.Builder publisher(String publisher) {
      this.publisher = publisher;
      return this;
    }

    public  com.syscho.graphql.generated.types.Book.Builder publishDate(LocalDate publishDate) {
      this.publishDate = publishDate;
      return this;
    }

    public  com.syscho.graphql.generated.types.Book.Builder createdTime(LocalDateTime createdTime) {
      this.createdTime = createdTime;
      return this;
    }
  }
}
