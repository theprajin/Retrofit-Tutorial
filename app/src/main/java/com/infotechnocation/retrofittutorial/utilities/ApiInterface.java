package com.infotechnocation.retrofittutorial.utilities;

import com.infotechnocation.retrofittutorial.entity.Comments;
import com.infotechnocation.retrofittutorial.entity.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Prajin Bajracharya on 5/9/2017.
 */

public interface ApiInterface {

    @GET("/posts")
    Call<List<Posts>> getPosts();

    @GET("/posts/{id}")
    Call<Posts> getPostById(@Path("id") int id);

    @GET("/posts/{id}/comments")
    Call<List<Comments>> getComments(@Path("id") int id);

    @GET("/comments")
    Call<List<Comments>> getCommentByPostId(@Query("postId")int id);

    @GET("/posts")
    Call<List<Posts>> getPostByUserId(@Query("userId") int id);
}
