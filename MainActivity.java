package com.wintech.archimath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      new Handler().postDelayed(() -> {
          Intent intent1 = new Intent(MainActivity.this,SecondActivity.class);
          startActivity(intent1);
          finish();
      },SPLASH_TIME_OUT);
    }
}