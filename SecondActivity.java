package com.wintech.archimath;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public SecondActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Button mBtn1 = (Button) findViewById(R.id.Btn1);
        Button mBtn2=(Button)findViewById(R.id.Btn2);
        Button mBtn3 = (Button) findViewById(R.id.Btn3);
        Button mBtn4=(Button)findViewById(R.id.Btn4);
        Button mBtn5=(Button)findViewById(R.id.Btn5);

        mBtn1.setOnClickListener(v ->  {
                Intent intent2 = new Intent(SecondActivity.this,ButtonOne.class);
                startActivity(intent2);
            });
                mBtn2.setOnClickListener(v -> {
                    Intent intent3 = new Intent(SecondActivity.this,ButtonTwo.class);
                    startActivity(intent3);
                });
                mBtn3.setOnClickListener(v -> {
                        Intent intent4 = new Intent(SecondActivity.this,ButtonFour.class);
                        startActivity(intent4);
                });
                mBtn4.setOnClickListener(v -> {
                        Intent intent5 = new Intent(SecondActivity.this,ButtonThree.class);
                        startActivity(intent5);
                });
                mBtn5.setOnClickListener(v ->  {
                        Intent intent6 = new Intent(SecondActivity.this,ButtonFive.class);
                        startActivity(intent6);
                });
            }
    }