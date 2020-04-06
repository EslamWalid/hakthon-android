package com.gautam.medicinetime;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.gautam.medicinetime.medicine.MedicineActivity;

public class SplashActivity extends AppCompatActivity {

    private View mContentView;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        mContentView =findViewById(R.id.linear_container);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        scheduleSplashScreen();




    }

    private void scheduleSplashScreen() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void run() {


                Intent loginIntent = new Intent(SplashActivity.this, MedicineActivity.class);
                startActivity(loginIntent);

            }
        }, 3000);


    }


}
