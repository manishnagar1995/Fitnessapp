package com.nagar.manish.fitnessapp;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Vitamis_and_Minerals extends Fragment {
    View view;
    ListView lst;
   static int m=15;
    Customclass adap8ter;


    String[] web = {
            "Vitamin A",
            "Vitamin B",
            "Vitamin C",
            "Vitamin D",
            "Vitamin E",
        //    "Vitamin B12",
            "Calcium",
            "Iron",
            "Magnesium",
            "Fiber"

    } ;
    Integer[] imageId = {
            R.drawable.vitamina,
            R.drawable.vitab,
            R.drawable.vitaminc,
            R.drawable.vitamind,
            R.drawable.vitamine,
       //     R.drawable.vitamind,
            R.drawable.ca,
          //  R.drawable.phosphorus,
            R.drawable.iron,
            R.drawable.magnesium,
            R.drawable.fiber
    };


    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list_view, container, false);
        lst = (ListView) view.findViewById(R.id.l1);

        Customclass adapter=new Customclass(getActivity(),web,imageId);
        lst.setAdapter(adapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                m = i;
                Intent B = new Intent(getActivity(), WebActivity.class);
                startActivity(B);
            }
        });
        return view;
    }
}

