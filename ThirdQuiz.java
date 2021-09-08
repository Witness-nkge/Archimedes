package com.wintech.archimath;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdQuiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_quiz);

        RadioButton radioButton1 = (RadioButton) findViewById(R.id.rdButton1);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.rdButton2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.rdButton3);

        radioButton1.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Invalid:Please try again",Toast.LENGTH_SHORT).show());
        radioButton2.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Invalid:Please try again",Toast.LENGTH_SHORT).show());
        radioButton3.setOnClickListener(v -> {
            Intent intent12 = new Intent(ThirdQuiz.this,FourthActivity.class);
            startActivity(intent12);
            Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
        });
    }
}
