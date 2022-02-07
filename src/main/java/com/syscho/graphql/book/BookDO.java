package com.syscho.graphql.book;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "BOOK")
public class BookDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;
    private String genre;
    private String publisher;
    private LocalDate publishDate;
    private LocalDateTime createdTime;
    private StatusEnum status;
    private boolean isAvailable;
}

enum StatusEnum {
    RELEASE,
    NO_RELEASE
}