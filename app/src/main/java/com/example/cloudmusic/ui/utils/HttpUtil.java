package com.example.cloudmusic.ui.utils;

import android.net.Uri;
import android.util.Log;

import com.example.cloudmusic.ui.homepage.net.IHttpCallback;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URI;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.http.Url;

public class HttpUtil {

    public static <T> void get(String url, Class<T> tClass, IHttpCallback callback) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url).get()
                .build();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Response response = null;
                try {
                    response = client.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String responseData = null;
                try {
                    Gson gson = new GsonBuilder()
                        .setLenient()
                        .create();
                    responseData = response.body().string();
                    T result = gson.fromJson(responseData, tClass);
                    callback.onLoadedSuccess(result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Log.d("HttpUtil response",responseData);

               // Gson gson = new Gson();
//                Gson gson = new GsonBuilder()
//                        .setLenient()
//                        .create();
//                String result = gson.fromJson(responseData, new  TypeToken<String>(){}.getType());
//                Log.d("HttpUtil result",result.toString());
            }
        }).start();

    }
}
