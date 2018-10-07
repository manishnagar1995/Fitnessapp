package com.nagar.manish.fitnessapp;


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
            "Nutrition Tips",
            "Health Recipie",
            "Home Remedies",
            "Vitamin and Minerals",
            "Health and Nutrition",
            "Vitamin A"
            /*"Vitamin B",
            "Vitamin C",
            "Vitamin D",
            "Vitamin E",
            "Vitamin B12",
            "Calcium",
            "Iron",
            "Magnesium",
            "Fiber"*/

    } ;
    int[] imageId = {
            R.drawable.healthtips,
            R.drawable.nutrition,
            R.drawable.healthrecipe,
            R.drawable.rhrf,
            R.drawable.vitamin,
            R.drawable.youtub,
            R.drawable.vitamina
            /*R.drawable.vitab,
            R.drawable.vitaminc,
            R.drawable.vitamind,
            R.drawable.vitamine,
            R.drawable.vitamind,
            R.drawable.ca,
            //   R.drawable.phosphorus,
            R.drawable.iron,
            R.drawable.magnesium,
            R.drawable.fiber*/

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
                Toast.makeText(getActivity(),"You Clicked at "+web[position]+" "+position, Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
