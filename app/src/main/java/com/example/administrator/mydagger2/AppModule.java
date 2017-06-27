package com.example.administrator.mydagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by LiBing
 * on 2017/6/26 0026
 * describe:
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient().newBuilder().build();
    }

}
