package com.nagar.manish.fitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity
{
    NavigationView navigationView = null;
    NavigationView navigation = null;
    Toolbar toolbar = null;
    static int id;
    ActionBarDrawerToggle toggle;

    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Mainfragment mainfragment = new Mainfragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, mainfragment);
        fragmentTransaction.commit();


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Health And Nutrition");
        }

        //toolbar.inflateMenu(R.menu.main);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
         toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                id = item.getItemId();
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(navigationView);

               if(id== R.id.healthtips) {
                   Health_tips mainfragment = new Health_tips();
                   android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                   fragmentTransaction.addToBackStack("Mainfragment");
                   fragmentTransaction.commit();
               }
               else if(id== R.id.nutrition)
               {
                   Nutrition_Tips mainfragment = new Nutrition_Tips();
                   android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                   fragmentTransaction.addToBackStack("Mainfragment");
                   fragmentTransaction.commit();
               }
               else if(id== R.id.recipe)
               {
                  Health_Recipie mainfragment = new Health_Recipie();
                   android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                   fragmentTransaction.addToBackStack("Mainfragment");
                   fragmentTransaction.commit();
               }
               else if(id== R.id.remedies)
               {
                   Home_Remedies mainfragment = new Home_Remedies();
                   android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                   fragmentTransaction.addToBackStack("Mainfragment");
                   fragmentTransaction.commit();
               }
               else if(id== R.id.vitamins)
               {
                   Vitamis_and_Minerals mainfragment = new Vitamis_and_Minerals();
                   android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                   fragmentTransaction.addToBackStack("Mainfragment");
                   fragmentTransaction.commit();

               }
               else if(id== R.id.han)
               {
                   Intent intent1 = new Intent(MainActivity.this,WebActivity.class);
                    startActivity(intent1);
               }
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Mainfragment mainfragment = new Mainfragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, mainfragment);
            super.onBackPressed();
            fragmentTransaction.commit();
          /*  AlertDialog.Builder dialogCancel = new AlertDialog.Builder(this)
                    .setTitle("discard changes...")
                    .setMessage("are you sure you do not want to save changes to this note?")
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            killProcess(android.os.Process.myPid()); //just go back to main activity
                        }
                    })
                    .setNegativeButton("NO", null); //null = stay in the activity!
            dialogCancel.show();*/
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.action_search:
                Mainfragment mainfragment = new Mainfragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                fragmentTransaction.commit();


        /*      FragmentManager fm = getActivity(activity)
                        .getSupportFragmentManager();
                fm.popBackStack ("Mainfragment", FragmentManager.POP_BACK_STACK_INCLUSIVE);*/
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (true) {
        }
        return true;
    }

    public FragmentActivity getActivity(Activity activity) {
        return (FragmentActivity) activity;
    }
}