package com.example.administrator.mydagger2;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/27 9:33
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    OkHttpClient mOkHttpClient();
}
