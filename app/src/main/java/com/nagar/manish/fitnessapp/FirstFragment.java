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

public class FirstFragment extends Fragment {


    View view;
    ListView listView;

    public FirstFragment() {
        // Required empty public constructor
    }


    static int c=15;
    String HealthTips[] = {
            "General Health Tips",
            "Health Tips For Children",
            "Health Tips For Women",
            "Health Tips For Men",
            "Simple Health Tips",
            "Healthy Exercise",
            "Yoga Tips",
            "Healthy Heart Tips",
            "TIps for It Professional",
            "Health and Stress"

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_first, container, false);
        listView = (ListView) view.findViewById(R.id.l1);
        // perform setOnClickListener on first Button
        ArrayAdapter<String> as=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,HealthTips);
        listView.setAdapter(as);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                c=i;
                Intent A=new Intent(getActivity(),Detailshow.class);
                startActivity(A);
            }
        });
        return view;
    }
}
