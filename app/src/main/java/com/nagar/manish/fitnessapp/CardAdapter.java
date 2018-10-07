package com.nagar.manish.fitnessapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardAdapter extends ArrayAdapter<String> {
    public Activity context;
    public  int[] image;
    public String name[];

    public CardAdapter(Activity context,int []image, String name[]) {
        super(context, R.layout.card,name);
        this.context = context;
        this.name=name;
        this.image=image;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.card, null, true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageCard);
        TextView textView=rowView.findViewById(R.id.tv);
        imageView.setImageResource(image[position]);
        textView.setText(name[position]);
        return rowView;
    }
}
