package com.example.administrator.mydagger2;

import dagger.Component;

/**
 * Created by LiBing
 * on 2017/6/21 0021
 * describe:
 */
@Component(modules = {UserModule.class})
public interface UserComponent {

    void inject(MainActivity activity);
}
