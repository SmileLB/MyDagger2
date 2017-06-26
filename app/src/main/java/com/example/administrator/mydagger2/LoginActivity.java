package com.example.administrator.mydagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by LiBing
 * on 2017/6/26 0026
 * describe:
 */

public class LoginActivity extends AppCompatActivity{

    @Inject
    UserManager mManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerLoginComponent.builder().userModule(new UserModule(this)).build().inject(this);

        mManager.login();
    }
}
