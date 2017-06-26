package com.example.administrator.mydagger2;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by LiBing
 * on 2017/6/21 0021
 * describe:
 */
@Module
public class UserModule {

    private Context mContext;

    public UserModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient().newBuilder().build();
    }

    @Provides
    public ApiService provideApiService(OkHttpClient okHttpClient) {
        return new ApiService(okHttpClient);
    }

    @Provides
    public UserManager provideUserManager(ApiService service) {
        return new UserManager(service);
    }

}
