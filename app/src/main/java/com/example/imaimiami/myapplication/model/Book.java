package com.example.imaimiami.myapplication.model;

import java.util.Date;
import java.util.List;

public class Book {

    private int id;

    private String title;

    private List<Post> posts;

    private Image image;

    public Book() {
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return image.getUrl();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public String getFirstComment() {
        return this.posts.get(0).getBody();
    }

    public String getFirstCommentAvatar() {
        return this.posts.get(0).getUserIconUrl();
    }
}
