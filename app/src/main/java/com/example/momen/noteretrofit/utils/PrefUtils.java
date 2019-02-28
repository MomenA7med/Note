package com.example.momen.noteretrofit.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Momen on 10/15/2018.
 */

public class PrefUtils {

    public PrefUtils(){

    }
    private static SharedPreferences getSharedPreferance (Context context)
    {
        return context.getSharedPreferences("APP_PREF",Context.MODE_PRIVATE);
    }
    public static void storeApiKey (Context context,String api_key){
        SharedPreferences.Editor editor = getSharedPreferance(context).edit();
        editor.putString("API_KEY",api_key);
        editor.commit();
    }
    public static String getApiKey(Context context){
        return getSharedPreferance(context).getString("API_KEY",null);
    }
}
