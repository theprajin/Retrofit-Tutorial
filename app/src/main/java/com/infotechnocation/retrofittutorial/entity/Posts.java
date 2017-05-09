package com.infotechnocation.retrofittutorial.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Prajin Bajracharya on 5/9/2017.
 */

public class Posts {

    @SerializedName("userId")
    private int userId;
    @SerializedName("id")
    private int id;
    @SerializedName("body")
    private String body;
    @SerializedName("title")
    private String title;

    public Posts() {
    }

    public Posts(int userId, int id, String body, String title) {
        this.userId = userId;
        this.id = id;
        this.body = body;
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "userId='" + userId + '\'' +
                ", id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
