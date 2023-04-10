package com.example.retrofittutorialtwo;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface JsonPlaceholderApi {

//    @GET("posts")
//    Call<List<Post>>getPosts();

    @GET("posts")
    Call<List<Post>>getPosts(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String  order

            );

    @GET("posts")
    Call<List<Post>>getPosts(@QueryMap Map<String, String> parameters);

    @GET("posts/{id}/comments")
    Call<List<Comment>>getComments(@Path("id") int postId);
}
