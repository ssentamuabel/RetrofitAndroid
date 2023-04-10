package com.example.retrofittutorialtwo;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;

    private int id;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    private String title;

    @SerializedName("body")
    private String text;




}
