package com.example.jpetstore.domain;

public class Review {
    String content;
    int star;
    int mvId;
    int id;

    public Review(String content, int star, int mvId, int id) {
        this.content = content;
        this.star = star;
        this.mvId = mvId;
        this.id = id;
    }
}
