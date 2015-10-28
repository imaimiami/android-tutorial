package com.example.imaimiami.myapplication.model;

import java.util.Date;
import java.util.List;

public class Book {

    private int id;

    private String title;

    private String url;

    private Date createdAt;

    private List<Comment> comments;

    private Image image;

    public Book() {
    }

    public Book(int id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return image.getUrl();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
