package com.example.imaimiami.myapplication.api;

import com.example.imaimiami.myapplication.model.Image;
import com.example.imaimiami.myapplication.model.Images;
import com.example.imaimiami.myapplication.model.Books;

import java.util.List;

import retrofit.Callback;
import retrofit.ResponseCallback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface ApiService {

    @GET("/api/v1/feeds/featured.json")
    void fetchBooks(Callback<Books> callback);

    @GET("/images/{id}.json")
    void fetchImage(@Path("id") int imageId, Callback<Image> callback);

    @FormUrlEncoded
    @POST("/images/{id}/comments.json")
    void postComment(@Path("id") int imageId, @Field("comment[body]") String commentBody,
                     ResponseCallback callback);

}
