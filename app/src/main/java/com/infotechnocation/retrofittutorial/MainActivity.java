package com.infotechnocation.retrofittutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.infotechnocation.retrofittutorial.entity.Comments;
import com.infotechnocation.retrofittutorial.entity.Posts;
import com.infotechnocation.retrofittutorial.utilities.APIClient;
import com.infotechnocation.retrofittutorial.utilities.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPosts();
        getPostById(5);
        getComments(2);
        getCommentById(3);
        getPostByUserId(10);


    }

    private ApiInterface getApiInterface(){
        ApiInterface apiInterface = APIClient.getClient().create(ApiInterface.class);

        return apiInterface;
    }

    private void getPosts(){
        Call<List<Posts>> posts = getApiInterface().getPosts();
        posts.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                List<Posts> postList = response.body();
                    Log.e("posts","The size is " + postList.size());

            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {

            }
        });
    }

    private void getPostById(int id){

            Call<Posts> postById = getApiInterface().getPostById(id);
            postById.enqueue(new Callback<Posts>() {
                @Override
                public void onResponse(Call<Posts> call, Response<Posts> response) {
                    Posts posts = response.body();
                    Log.e("postById", posts.toString());
                }

                @Override
                public void onFailure(Call<Posts> call, Throwable t) {

                }
            });

    }

    private void getComments(int id){

            Call<List<Comments>> comments = getApiInterface().getComments(id);
            comments.enqueue(new Callback<List<Comments>>() {
                @Override
                public void onResponse(Call<List<Comments>> call, Response<List<Comments>> response) {
                    List<Comments> commentsList = response.body();
                    Log.e("comments","the no. of comments = " + commentsList.size());
                }

                @Override
                public void onFailure(Call<List<Comments>> call, Throwable t) {

                }
            });

    }

    private void getCommentById(int postId) {
        Call<List<Comments>> commentByPostIdList = getApiInterface().getCommentByPostId(postId);
        commentByPostIdList.enqueue(new Callback<List<Comments>>() {
            @Override
            public void onResponse(Call<List<Comments>> call, Response<List<Comments>> response) {
                List<Comments> commentsList = response.body();
                Log.e("commentById", "The no. of comments by postId = " + commentsList.size());
            }

            @Override
            public void onFailure(Call<List<Comments>> call, Throwable t) {

            }
        });
    }

    private void getPostByUserId(int userId) {
        Call<List<Posts>> postByUserId = getApiInterface().getPostByUserId(userId);
        postByUserId.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                List<Posts> postsList = response.body();
                Log.e("postByUserId", "The no. of posts by userId = " + postsList.size());
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {

            }
        });
    }
}
