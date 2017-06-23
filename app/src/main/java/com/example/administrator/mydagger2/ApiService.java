package com.example.administrator.mydagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by LiBing
 * on 2017/6/20 0020
 * describe:
 */

public class ApiService {


    public ApiService() {
        Log.i("ApiService", "------------ApiService");
    }

    @Inject
    public ApiService(String url) {
        Log.i("ApiService", "------------"+url);
    }

    public void register() {
        //保存到服务器
        Log.i("ApiService", "------------register");
    }
}
