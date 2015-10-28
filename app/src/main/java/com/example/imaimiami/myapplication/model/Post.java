package com.example.imaimiami.myapplication.model;

import java.util.Date;
import java.util.List;

public class Post {

    private int id;

    private String body;

    private User user;

    public Post() {
    }

    public Post(int id, String body) {
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getUserName() {
        return user.getNmae();
    }

    public String getUserIconUrl() {
        return user.getIconUrl();
    }
}
