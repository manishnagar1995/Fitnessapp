package com.nagar.manish.fitnessapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyHolder> {
    public Context context;
    public  int[] image;
    public String name[];
    public int pos;

    public CardAdapter(Context context,int []image, String name[]) {
        //super(context, R.layout.card,name);
        this.context = context;
        this.name=name;
        this.image=image;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(context);
        View v =li.inflate(R.layout.card,viewGroup,false);
        return new MyHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {

        myHolder.imageView.setImageResource(image[i]);

     //   Bitmap b = BitmapFactory.decodeResource(context.getResources(), image[i]);
     //   Bitmap scale  = Bitmap.createScaledBitmap(b, 100, 100, false);
        //   myHolder.imageView.setImageBitmap(b);

        myHolder.textView.setText(name[i]);
        final int c=i;
        final AppCompatActivity act=(AppCompatActivity)context;
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, c+"i", Toast.LENGTH_SHORT).show();
                switch (c)
                {
                    case 0:
                        Toast.makeText(context, c+"i", Toast.LENGTH_SHORT).show();

                        Health_tips mainfragment = new Health_tips();
                        FragmentManager fragmentManager = act.getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, mainfragment);
                        fragmentTransaction.addToBackStack("Mainfragment");
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        Nutrition_Tips mainfragment1 = new Nutrition_Tips();
                        FragmentManager fragmentManager1 = act.getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        fragmentTransaction1.replace(R.id.fragment_container, mainfragment1);
                        fragmentTransaction1.addToBackStack("Mainfragment");
                        fragmentTransaction1.commit();
                        break;
                    case 2:
                        Health_Recipie mainfragment3 = new Health_Recipie();
                        FragmentManager fragmentManager3 = act.getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
                        fragmentTransaction3.replace(R.id.fragment_container, mainfragment3);
                        fragmentTransaction3.addToBackStack("Mainfragment");
                        fragmentTransaction3.commit();
                        break;
                    case 3:
                        Home_Remedies mainfragment4 = new Home_Remedies();
                        FragmentManager fragmentManager4 = act.getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
                        fragmentTransaction4.replace(R.id.fragment_container, mainfragment4);
                        fragmentTransaction4.addToBackStack("Mainfragment");
                        fragmentTransaction4.commit();
                        break;
                    case 4:
                        Vitamis_and_Minerals mainfragment5 = new Vitamis_and_Minerals();
                        FragmentManager fragmentManager5 = act.getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction5 = fragmentManager5.beginTransaction();
                        fragmentTransaction5.replace(R.id.fragment_container, mainfragment5);
                        fragmentTransaction5.addToBackStack("Mainfragment");
                        fragmentTransaction5.commit();
                        break;
                    case 5:
                        Intent intent1 = new Intent(act,WebActivity.class);
                        context.startActivity(intent1);
                        break;
                    default:
                        break;
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return image.length;
    }
    class MyHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
             imageView =  itemView.findViewById(R.id.imageCard);
             textView=itemView.findViewById(R.id.tv);
        }
    }
}
