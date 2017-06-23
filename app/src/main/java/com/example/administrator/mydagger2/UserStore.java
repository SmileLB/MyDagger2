package com.example.administrator.mydagger2;

import android.content.Context;

/**
 * Created by LiBing
 * on 2017/6/20 0020
 * describe:
 */

public class UserStore {

    private Context mContext;

    public UserStore(Context context) {
        mContext = context;
    }

    public void register() {
        //保存到本地
        mContext.getSharedPreferences("user_data",1).edit().putString("","").commit();
    }
}
