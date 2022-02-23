package com.cydeo.model;

import lombok.Data;

@Data
public class Comment {
    private String author;
    private String text;
}
// for Pojos no @Component