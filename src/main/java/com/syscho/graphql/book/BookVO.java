package com.syscho.graphql.book;

import lombok.Data;

@Data
public class BookVO {
    private String id;
    private String title;
    private String genre;
    private String publisher;
}
