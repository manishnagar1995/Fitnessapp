package com.nagar.manish.fitnessapp;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StopWatch extends AppCompatActivity {
    TextView timer ;
    Button start, pause, reset;
    long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L ;
    Handler handler;
    int Seconds, Minutes, MilliSeconds ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        timer = (TextView)findViewById(R.id.tv1);
        start = (Button)findViewById(R.id.start);
        pause = (Button)findViewById(R.id.pause);
        reset = (Button)findViewById(R.id.stop);
        handler = new Handler() ;
    }

    public void start(View view) {
        StartTime = SystemClock.uptimeMillis();
        handler.postDelayed(runnable, 0);

        reset.setEnabled(false);
    }

    public void stop(View view) {
        MillisecondTime = 0L ;
        StartTime = 0L ;
        TimeBuff = 0L ;
        UpdateTime = 0L ;
        Seconds = 0 ;
        Minutes = 0 ;
        MilliSeconds = 0 ;

        timer.setText("00:00:00");

    }

    public void pause(View view) {
        TimeBuff += MillisecondTime;

        handler.removeCallbacks(runnable);

        reset.setEnabled(true);
    }

    public Runnable runnable = new Runnable() {

        public void run() {

            MillisecondTime = SystemClock.uptimeMillis() - StartTime;

            UpdateTime = TimeBuff + MillisecondTime;

            Seconds = (int) (UpdateTime / 1000);

            Minutes = Seconds / 60;

            Seconds = Seconds % 60;

            MilliSeconds = (int) (UpdateTime % 100);

            timer.setText("" + String.format("%02d",Minutes) + ":"
                    + String.format("%02d", Seconds) + ":"
                    + String.format("%02d", MilliSeconds));

            handler.postDelayed(this, 0);
        }

    };
}
