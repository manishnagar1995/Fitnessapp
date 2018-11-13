package com.nagar.manish.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;


public class ThirdFragment extends Fragment {
        View view;
        ListView lst;
        static int h=15;
        Customclass adap;


        String[] web = {
               "Asparagus Soup",
                "Cherry Salad",
                "Berry Peachy Smoothy",
                "Broccoli and bacon pilaf lge",
                "Gimme Leansausage Burrito",
               // "Cottage Pie",
                "Dal Kabila",
                "Egg Casserole",
                "Garlic Chicken",
                "Lentil and giner soup",
                "Lowfatreipes",
              //"Salmon with apple slaw",
              //  "Tofu scramble"
              // "Salmon chourcruote"
        } ;
        Integer[] imageId = {
               R.drawable.asparagussoup,
                R.drawable.cherrysalad,
                R.drawable.berrypeachysmoothy,
                R.drawable.broccoliandbaconpilaflge,
                R.drawable.gimmeleansausageburrito,
              //  R.drawable.cottagepie,
                R.drawable.dalkabila,
                R.drawable.apple,
                R.drawable.garlicchicken,
                R.drawable.cherrysalad,
                R.drawable.loow,

        };


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_third, container, false);
            lst = (ListView) view.findViewById(R.id.list);

            adap=new Customclass(getActivity(),web,imageId);
            lst.setAdapter(adap);

            lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    h = i;
                    Intent A = new Intent(getActivity(), WebActivity.class);
                    startActivity(A);
                }
            });
            return view;
        }
    }
