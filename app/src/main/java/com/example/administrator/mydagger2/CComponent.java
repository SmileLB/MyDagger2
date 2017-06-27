package com.example.administrator.mydagger2;

import com.example.administrator.mydagger2.anotation.ActivityScope;

import dagger.Subcomponent;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/27 11:32
 */
@ActivityScope
@Subcomponent(modules = UtilModule.class)
public interface CComponent {

    void inject(SubComponentActivity activity);
}
