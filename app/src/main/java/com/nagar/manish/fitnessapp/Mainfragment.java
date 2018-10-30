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
            "BMI",
            "Notpad",
            "Recoder"

    } ;
    int[] imageId = {
            R.drawable.bmic,
            R.drawable.ic_note_add_black_48dp,
            R.drawable.recoder

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
                        Intent A0=new Intent(getActivity(),BMICalculator.class);
                        startActivity(A0);
                        break;
                    case 1:
                        Intent A1=new Intent(getActivity(),Notepad.class);
                        startActivity(A1);
                        break;

                    case 2:
                        Intent A2=new Intent(getActivity(),VoiceRecoder.class);
                        startActivity(A2);
                        break;
                }



            }
        });
        return view;
    }
}
