package com.wintech.archimath;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityQuiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        RadioButton radio1 = (RadioButton) findViewById(R.id.rdb1);
        RadioButton radio2 = (RadioButton) findViewById(R.id.rdb2);
        RadioButton radio3 = (RadioButton) findViewById(R.id.rdb3);

        radio1.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Invalid:Please try again",Toast.LENGTH_SHORT).show());
        radio2.setOnClickListener(v -> {
            Intent intent9 = new Intent(ActivityQuiz.this,SecondQuiz.class);
            startActivity(intent9);
            Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
        });
        radio3.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Invalid:Please try again",Toast.LENGTH_SHORT).show());
    }
}
