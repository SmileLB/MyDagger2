package com.example.administrator.mydagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by LiBing
 * on 2017/6/21 0021
 * describe:
 */

@Singleton
@Component(modules = {UserModule.class})
public interface UserComponent {

    void inject(MainActivity activity);
}
