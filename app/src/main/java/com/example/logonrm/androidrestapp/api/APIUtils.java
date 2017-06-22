package com.example.logonrm.androidrestapp.api;

/**
 * Created by logonrm on 21/06/2017.
 */

public class APIUtils {

    public static final String BASE_URL = "http:/www.mocky.io";

    public static AndroidAPI getAndroidAPIVersion(){
        return RetrofitClient.getClient(BASE_URL).create(AndroidAPI.class);
    }

}
