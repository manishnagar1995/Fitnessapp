package com.nagar.manish.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by manish on 19-11-2017.
 */

public class SplashActivity extends AppCompatActivity {

    private static int splashtime=1000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstnceState) {

        super.onCreate(savedInstnceState);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splashtime);
    }
}
