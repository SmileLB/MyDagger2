package com.example.administrator.mydagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DaggerUserComponent.create().inject(this);
        DaggerUserComponent.builder()
                .userModule(new UserModule(this))
                .build()
                .inject(this);

        mManager.register();

    }
}
