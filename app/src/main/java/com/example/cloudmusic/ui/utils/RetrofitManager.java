package com.example.cloudmusic.ui.utils;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.example.cloudmusic.ui.convert.LenientGsonConverterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private static final RetrofitManager retrofitInstance = new RetrofitManager();
    private final Retrofit retrofitEleuu;

    private final Retrofit retrofitc;

    private final Retrofit retrofitu;

    private final Retrofit retrofitKuGou;

    public static RetrofitManager getInstance() {
        return retrofitInstance;
    }

    private RetrofitManager() {
        //创建Retrofit
        retrofitEleuu = new Retrofit.Builder()
                .baseUrl("http://music.eleuu.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        retrofitc = new Retrofit.Builder().client(getOkHttpClientC())
                .baseUrl("https://c.y.qq.com/")
                .addConverterFactory(LenientGsonConverterFactory.create(gson))
                .build();

        retrofitu = new Retrofit.Builder().client(getOkHttpClientU())
                .baseUrl("https://u.y.qq.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        retrofitKuGou = new Retrofit.Builder()
                .baseUrl("http://m.kugou.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit(int type) {
        if(type ==1)
        return retrofitEleuu;
        else if (type == 2)
         return retrofitc;
        else if(type == 3) return retrofitu;
        else return retrofitKuGou;
    }

    private OkHttpClient getOkHttpClientC() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(new RequestInterceptorC());
        return okHttpClientBuilder.build();
    }

    private OkHttpClient getOkHttpClientU() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(new RequestInterceptorU());
        return okHttpClientBuilder.build();
    }

    static class RequestInterceptorU implements Interceptor {

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public Response intercept(Chain chain) throws IOException {
            Log.d("RequestInterceptor","=======");
            Log.d("RequestInterceptor", String.valueOf(chain.request().url()));

            return chain.proceed(chain.request());
        }
    }

    static class RequestInterceptorC implements Interceptor {

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public Response intercept(Chain chain) throws IOException {
            Log.d("RequestInterceptor","=======");
            Log.d("RequestInterceptor", String.valueOf(chain.request().url()));
            Response response = chain.proceed(chain.request());
            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                long contentLength = responseBody.contentLength();
                BufferedSource source = responseBody.source();
                source.request(Long.MAX_VALUE);
                Buffer buffer = source.getBuffer();

                if ("gzip".equals(response.headers().get("Content-Encoding"))) {
                    GzipSource gzippedResponseBody = new GzipSource(buffer.clone());
                    buffer = new Buffer();
                    buffer.writeAll(gzippedResponseBody);
                }

                MediaType contentType = responseBody.contentType();
                Charset charset;
                if (contentType == null || contentType.charset(StandardCharsets.UTF_8) == null) {
                    charset = StandardCharsets.UTF_8;
                } else {
                    charset = contentType.charset(StandardCharsets.UTF_8);
                }

                if (charset != null && contentLength != 0L) {
                   return intercept(response, chain.request().url(), buffer.clone().readString(charset));
                }      
        }
            return response;
        }

        private Response intercept(Response response, HttpUrl url, String body) {
            JSONObject jsonObject = null;
            body = body.substring(9);
            body = body.substring(0,body.length()-1);
            Log.d("RequestInterceptor1",body);
            try {
                jsonObject = new JSONObject(body);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jsonObject != null) {
                if (!jsonObject.optBoolean("success")) {
                    if (response.body() != null) {
                        ResponseBody boy = ResponseBody.create(response.body().contentType(), body);
                        return response.newBuilder().body(boy).build();
                    }
                }
            }
            return response;
        }
        }

    }
