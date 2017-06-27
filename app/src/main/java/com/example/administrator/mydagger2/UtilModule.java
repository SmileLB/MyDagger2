package com.example.administrator.mydagger2;

import com.example.administrator.mydagger2.anotation.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/27 11:33
 */
@Module
public class UtilModule {

    @Provides
    @ActivityScope
    public Gson providerGson(){
        return new Gson();
    }
}
