package com.example.administrator.mydagger2;

import android.util.Log;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/**
 * Created by LiBing
 * on 2017/6/20 0020
 * describe:
 */

public class ApiService {

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public OkHttpClient mOkHttpClient;

    public ApiService(OkHttpClient okHttpClient) {
        this.mOkHttpClient = okHttpClient;
    }

    public void login(){
        Log.i("login","------------"+mOkHttpClient);
    }

    public void register() {
        Log.i("main","------------"+mOkHttpClient);
        //保存到服务器
//        RequestBody body = RequestBody.create(JSON, "json内容");
//        Request request = new Request.Builder()
//                .url("www.baidu.com")
//                .post(body)
//                .build();
//        mOkHttpClient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//
//            }
//        });
    }
}
