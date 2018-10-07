package com.nagar.manish.fitnessapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Health_tips extends Fragment {

    ListView listView;
    String HealthTips[] = {
            "General Health Tips",
            "Health Tips For Children",
            "Health Tips For Women",
            "Health Tips For Men",
            "Simple Health Tips",
            "Healthy Exercise",
            "Yoga Tips",
            "Tips For Diabetes Patients",
            "Healthy Heart Tips",
            "TIps for It Professional",
            "Health and Stress",
            "Winter Heath Tips",
            "Summer Health Tips"

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health_tips, container, false);
        // get the reference of Button
        listView = (ListView) view.findViewById(R.id.l1);
        // perform setOnClickListener on first Button
        ArrayAdapter<String> as=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,HealthTips);
        listView.setAdapter(as);

        return view;
    }


}
