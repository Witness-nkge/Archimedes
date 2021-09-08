package com.wintech.archimath;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonFour extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_four);
        RadioButton rdb = (RadioButton) findViewById(R.id.radioB1);
        RadioButton rdb2 = (RadioButton) findViewById(R.id.radioB2);
        RadioButton rdb3 = (RadioButton) findViewById(R.id.radioB3);
        rdb.setOnClickListener(view -> {
            Intent intent8 = new Intent(ButtonFour.this, ActivityQuiz.class);
            startActivity(intent8);
            Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
        });
        rdb2.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Invalid:Please try again",Toast.LENGTH_SHORT).show());
        rdb3.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Invalid:Please try again",Toast.LENGTH_SHORT).show());
    }
    }

