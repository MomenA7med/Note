package com.example.momen.noteretrofit.model;

/**
 * Created by Momen on 10/15/2018.
 */

public class Note extends BaseResponse {

    int id;
    String note;
    String timestamp;

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }
}