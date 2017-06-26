package com.example.administrator.mydagger2;

/**
 * Created by LiBing
 * on 2017/6/20 0020
 * describe:
 */

public class UserManager {

    private ApiService mService;

    public UserManager(ApiService service) {
        mService = service;
    }

    public void login() {
        mService.login();
    }

    //分别向服务端和本地保存用户数据
    public void register() {
        mService.register();
    }
}
