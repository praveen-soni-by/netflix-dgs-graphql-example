package com.syscho.graphql.book;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class BookVO {
    private String id;
    private String title;
    private String genre;
    private String publisher;
    private LocalDate publishDate;
    private LocalDateTime createdTime;
}
