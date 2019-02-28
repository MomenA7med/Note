package com.example.momen.noteretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Momen on 10/15/2018.
 */

public class User extends BaseResponse {
    @SerializedName("api_key")
    String api_key;

    public String getApi_key(){
        return api_key;
    }
}
