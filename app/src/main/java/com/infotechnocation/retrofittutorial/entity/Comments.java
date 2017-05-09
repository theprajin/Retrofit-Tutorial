package com.infotechnocation.retrofittutorial.entity;

/**
 * Created by Prajin Bajracharya on 5/9/2017.
 */

public class Comments {

    private int postId;
    private int id;
    private String email;
    private String name;

    public Comments() {
    }

    public Comments(int postId, int id, String email, String name) {
        this.postId = postId;
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "postId=" + postId +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
