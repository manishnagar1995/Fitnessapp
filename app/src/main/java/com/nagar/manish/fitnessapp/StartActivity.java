package com.nagar.manish.fitnessapp;

import android.support.v7.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

   /* ImageView img;
    Button next,btnleft,btnright;
    int current_img_index;
    int [] images={
            R.drawable.gabiellereece,
            R.drawable.healthnutrtition,
            R.drawable.body,
            R.drawable.health,
            R.drawable.mixvage,
            R.drawable.relation,
            R.drawable.nutrition,
            R.drawable.word,
            R.drawable.strobary
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        buttonclick();

    }
    public void buttonclick()
    {
        btnleft=(Button)findViewById(R.id.left);
        btnright=(Button)findViewById(R.id.right);
        img=(ImageView)findViewById(R.id.imageView);
        next=(Button)findViewById(R.id.button);


        btnright.setOnClickListener(this);
        btnleft.setOnClickListener(this);
        next.setOnClickListener( this);
        img.setImageResource(images[1]);
    }


    @Override
    public void onClick(View view) {

        if((view.getId() == R.id.right) || (view.getId() == R.id.left)){
            current_img_index++;
            current_img_index=current_img_index % images.length;
            img.setImageResource(images[current_img_index]);
        }
        else if(view.getId()==R.id.button)
        {
            Intent intent=new Intent(this,Health_nutritionguide.class);
            startActivity(intent);
        }
    }*/
}
