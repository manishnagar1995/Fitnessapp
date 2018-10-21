package com.nagar.manish.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Nutrition_Tips extends Fragment {

    public Nutrition_Tips() {
        // Required empty public constructor
    }


    View view;
    ListView listview;
    static int k=15;
    String nutritonTips[] = {
            "General Nutrition Tips ",
            "Nutrition Tips For Children",
            "Nutrition Tips For Men",
            "Nutrition Tips For Women",
            "Nutrition Tips For Hair",
            "Nutrition Tips For Skin",
            "Nutrition Tips For Anaemic Patient",
            "Nutrition Tips For Weight Gain",
            "Nutrition Tips For High Blood Pressure",
            "Nutrition Tips For Diabetes"


    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list_view, container, false);
        // get the reference of Button
        listview = (ListView) view.findViewById(R.id.list);
        // perform setOnClickListener on first Button
        ArrayAdapter<String> nu=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,nutritonTips);
        listview.setAdapter(nu);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i<9)
                {
                    k=i;
                    Toast.makeText(getActivity(), ""+k, Toast.LENGTH_SHORT).show();
                    Intent A=new Intent(getActivity(),Detailshow.class);
                    startActivity(A);
                }
                else
                {
                    k=i;
                    Toast.makeText(getActivity(), ""+k, Toast.LENGTH_SHORT).show();
                    Intent A=new Intent(getActivity(),WebActivity.class);
                    startActivity(A);
                }
            }
        });
        return view;
    }
}
