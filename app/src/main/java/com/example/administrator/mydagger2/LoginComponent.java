package com.example.administrator.mydagger2;

import com.example.administrator.mydagger2.anotation.ActivityScope;

import dagger.Component;

/**
 * Created by LiBing
 * on 2017/6/26 0026
 * describe:
 */
@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity loginActivity);
}
