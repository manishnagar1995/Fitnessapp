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


public class Home_Remedies extends Fragment {

    View view;
    ListView listview;
    static int b;
    String[]homeRemediesTips =
            {
                    "Acidity",
                    "Cough and Cold",
                    "Back Pain",
                    "Pimple Care",
                    "Tooth Ache",
                    "Weight Loss",
                    "Hair Loss",
                     "Skin Rashes",
                    "Asthma",
                    "Mouth Ulcer",
                    "Sore Throat"
            };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list_view, container, false);
        // get the reference of Button
        listview = (ListView) view.findViewById(R.id.list);
        // perform setOnClickListener on first Button
        ArrayAdapter<String> fu=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,homeRemediesTips);
        listview.setAdapter(fu);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i<9)
                {
                    b=i;
                    Intent A=new Intent(getActivity(),Detailshow.class);
                    startActivity(A);
                }
                else
                {
                    b=i;
                    Intent A=new Intent(getActivity(),WebActivity.class);
                    startActivity(A);
                }

            }
        });
        return view;

    }
}
