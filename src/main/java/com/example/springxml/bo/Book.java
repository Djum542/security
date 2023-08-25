package com.example.springxml.bo;

import lombok.Data;

@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private int publication_year;
}
