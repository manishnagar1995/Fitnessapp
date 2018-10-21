package com.nagar.manish.fitnessapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class Mainfragment extends Fragment {
    View view;
    GridView list;
    int c;
    CardAdapter adapter;


    String[] web = {
            "Health Tips",
            "Health and Nutrition",
            "Vitamin A"

    } ;
    int[] imageId = {
            R.drawable.bmic,
            R.drawable.youtub,
            R.drawable.vitamina

    };

    public Mainfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.fragment_mainfragment, container, false);

        adapter = new CardAdapter(getActivity(),imageId,web);
        list=(GridView) view.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                c=position;
                switch (c)
                {
                    case 0:
                        Intent A=new Intent(getActivity(),BMICalculator.class);
                        startActivity(A);
                        break;
                }



            }
        });
        return view;
    }
}
