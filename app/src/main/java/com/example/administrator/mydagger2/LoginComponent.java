package com.example.administrator.mydagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by LiBing
 * on 2017/6/26 0026
 * describe:
 */
@Singleton
@Component(modules = UserModule.class)
public interface LoginComponent {

    void inject(LoginActivity loginActivity);
}
