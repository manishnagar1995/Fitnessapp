package com.nagar.manish.fitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ThirdFragment mainfragment = new ThirdFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, mainfragment);
        fragmentTransaction.commit();

    }
}
