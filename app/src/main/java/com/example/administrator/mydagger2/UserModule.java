package com.example.administrator.mydagger2;

import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;

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
    public String provideUrl() {
        return "ewufuewjfgqwejfwe";
    }

    @Provides
    public UserStore provideUserStore(){
        Log.i("provideUserStore","-----------provideUserStore");
        return new UserStore(this.mContext);
    }

    @Provides
    public UserManager provideUserManager(ApiService service, UserStore store) {
        return new UserManager(service, store);
    }

}
