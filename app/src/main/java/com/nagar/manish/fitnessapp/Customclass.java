package com.nagar.manish.fitnessapp;


//import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;


public class Customclass extends ArrayAdapter<String>
{
    public  Activity context;
    public  String[] web;
    Bitmap b;
    public Integer[] imageId;
    public Customclass(Activity context, String[] web, Integer[] imageId) {
        super(context, R.layout.gridpiclist, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }

    @SuppressLint("NewApi")
    @NonNull
    @Override
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();


        View rowView= inflater.inflate(R.layout.gridpiclist, null, true);
        TextView txtTitle = rowView.findViewById(R.id.txt);
        ImageView imageView = rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);

      /*  b = BitmapFactory.decodeResource(context.getResources(), imageId[position]);
       Bitmap scale  = Bitmap.createScaledBitmap(b, 100, 100, false);

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        b.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] imageInByte = stream.toByteArray();
        long lengthbmp = imageInByte.length;*/

    //    imageView.setImageBitmap(scale);
        imageView.setImageResource(Math.toIntExact(imageId[position]));
        return rowView;
    }
}
