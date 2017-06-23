package com.example.administrator.mydagger2;

/**
 * Created by LiBing
 * on 2017/6/20 0020
 * describe:
 */

public class UserManager {

    private UserStore mStore;
    private ApiService mService;

    public UserManager(ApiService service,UserStore store) {
        mStore = store;
        mService = service;
    }

    //分别向服务端和本地保存用户数据
    public void register() {
        mStore.register();
        mService.register();
    }
}
