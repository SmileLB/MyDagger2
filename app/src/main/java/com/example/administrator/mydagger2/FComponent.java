package com.example.administrator.mydagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/27 11:32
 */
@Singleton
@Component(modules = AppModule.class)
public interface FComponent {

    CComponent getChildComponent();


}
