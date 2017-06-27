package com.example.administrator.mydagger2.app;

import android.app.Application;

import com.example.administrator.mydagger2.AppComponent;
import com.example.administrator.mydagger2.DaggerAppComponent;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/27 10:44
 */

public class MyAppilication extends Application{


    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent=DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
