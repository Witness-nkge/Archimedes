package com.wintech.archimath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ButtonThree extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_three);

        Button BasicButton = (Button) findViewById(R.id.basicMath);
        Button AdvancedButton = (Button) findViewById(R.id.advancedMath);
        Button grade8Button = (Button) findViewById(R.id.grade8);
        Button grade9Button = (Button) findViewById(R.id.grade9);
        Button grade10Button = (Button) findViewById(R.id.grade10);
        Button grade11Button = (Button) findViewById(R.id.grade11);
        Button grade12Button = (Button) findViewById(R.id.grade12);
        Button teacherGuide = (Button) findViewById(R.id.teacherGuide);

        BasicButton.setOnClickListener(v -> {
            Intent intent13 = new Intent(ButtonThree.this,BasicMath.class);
            startActivity(intent13);
        });
        AdvancedButton.setOnClickListener(v -> {
            Intent intent14 = new Intent(ButtonThree.this, AdvancedMath.class);
            startActivity(intent14);
        });
        grade8Button.setOnClickListener(v -> {
            Intent intent14 = new Intent(ButtonThree.this, Grade8.class);
            startActivity(intent14);
        });
        grade9Button.setOnClickListener(v -> {
            Intent intent15 = new Intent(ButtonThree.this, Grade9.class);
            startActivity(intent15);
        });
        grade10Button.setOnClickListener(v -> {
            Intent intent16 = new Intent(ButtonThree.this, Grade10.class);
            startActivity(intent16);
        });
        grade11Button.setOnClickListener(v -> {
            Intent intent17 = new Intent(ButtonThree.this, Grade11.class);
            startActivity(intent17);
        });
        grade12Button.setOnClickListener(v -> {
            Intent intent18 = new Intent(ButtonThree.this, Grade12.class);
            startActivity(intent18);
        });
        teacherGuide.setOnClickListener(v -> {
            Intent intent19 = new Intent(ButtonThree.this, TeachersGuide.class);
            startActivity(intent19);
        });
    }
}
