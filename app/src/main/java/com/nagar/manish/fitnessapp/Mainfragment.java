package com.nagar.manish.fitnessapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;


public class Mainfragment extends Fragment {
  View view;
    GridView list;
   BottomBar bottomBar;
   RecyclerView recyclerView;
    int c;
    CardAdapter adapter;


    String[] web = {
            "Health Tips",
            "Nutrition Tips",
            "Health Recipie",
            "Home_Remedies",
            "Vitamins and Minerals Sources",
            "Health And Nutrition"

    } ;
    int[] imageId = {
            R.drawable.cardiogram,
            R.drawable.apple,
            R.drawable.atomic,
            R.drawable.aids,
            R.drawable.hospital,
            R.drawable.flag

    };

    public Mainfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view = inflater.inflate(R.layout.fragment_mainfragment, container, false);





   //   view = inflater.inflate(R.layout.fragment_mainfragment, container, false);

        adapter = new CardAdapter(getContext(),imageId,web);
        recyclerView= view.findViewById(R.id.list);
        RecyclerView.LayoutManager rel=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(rel);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
//        list.setAlpha(alpha);
        /*recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                c=position;
                switch (c)
                {
                    case 0:

                        Health_tips mainfragment = new Health_tips();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                        fragmentTransaction.addToBackStack("Mainfragment");
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        Nutrition_Tips mainfragment1 = new Nutrition_Tips();
                        FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        fragmentTransaction1.replace(R.id.fragment_container, mainfragment1);
                        fragmentTransaction1.addToBackStack("Mainfragment");
                        fragmentTransaction1.commit();
                        break;
                    case 2:
                        Health_Recipie mainfragment3 = new Health_Recipie();
                        FragmentManager fragmentManager3 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
                        fragmentTransaction3.replace(R.id.fragment_container, mainfragment3);
                        fragmentTransaction3.addToBackStack("Mainfragment");
                        fragmentTransaction3.commit();
                        break;
                    case 3:
                        Home_Remedies mainfragment4 = new Home_Remedies();
                        FragmentManager fragmentManager4 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
                        fragmentTransaction4.replace(R.id.fragment_container, mainfragment4);
                        fragmentTransaction4.addToBackStack("Mainfragment");
                        fragmentTransaction4.commit();
                        break;
                    case 4:
                        Vitamis_and_Minerals mainfragment5 = new Vitamis_and_Minerals();
                        FragmentManager fragmentManager5 = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction5 = fragmentManager5.beginTransaction();
                        fragmentTransaction5.replace(R.id.fragment_container, mainfragment5);
                        fragmentTransaction5.addToBackStack("Mainfragment");
                        fragmentTransaction5.commit();
                        break;
                    case 5:
                        Intent intent1 = new Intent(getActivity(),WebActivity.class);
                        startActivity(intent1);
                        break;
                        default:
                            break;
                }



            }
        });*/
        return view;
    }
}
