package com.example.momen.noteretrofit.network;

import com.example.momen.noteretrofit.model.Note;
import com.example.momen.noteretrofit.model.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Momen on 10/17/2018.
 */

public interface ApiService {
    @FormUrlEncoded
    @POST("/notes/user/register")
    Single<User> register(@Field("device_id") String device_id);

   // @FormUrlEncoded
    @GET("/notes/all")
    Single<List<Note>> getAllNote();

    @FormUrlEncoded
    @POST("/notes/new")
    Single<Note> createNote(@Field("note") String text);

    @FormUrlEncoded
    @PUT("/notes/{id}")
    Completable updateNote(@Path("id") int node_id,@Field("note") String node);

    //@FormUrlEncoded
    @DELETE("notes/{id}")
    Completable deleteNote(@Path("id") int note_id);
}
