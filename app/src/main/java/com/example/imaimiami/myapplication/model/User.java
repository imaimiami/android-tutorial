package com.example.imaimiami.myapplication.model;

import java.util.Date;
import java.util.List;

public class User {

    private int id;

    private String name;

    private Image icon;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getNmae() {
        return name;
    }

    public String getIconUrl() {
        return icon.getUrl();
    }
}