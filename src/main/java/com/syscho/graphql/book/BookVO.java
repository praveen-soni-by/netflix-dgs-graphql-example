package com.syscho.graphql.book;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookVO {
    private String id;
    private String title;
    private String genre;
    private String publisher;
    private LocalDate publishDate;
}
