package com.example.soc_macmini_15.sqlitepractice.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.soc_macmini_15.sqlitepractice.R;

public class SplashScreenActivity extends AppCompatActivity {
//    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreenActivity.this,RegisterActivity.class));
                finish();
            }
        },5000);
    }
}
