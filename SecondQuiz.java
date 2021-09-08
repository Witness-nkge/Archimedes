package com.wintech.archimath;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


import java.util.regex.Pattern;


public class SecondQuiz extends AppCompatActivity{

    private static final Pattern answer = Pattern.compile("12");

    private EditText editText;
    private Button nextButton;
    private TextView textTv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_quiz);

        editText = (EditText) findViewById(R.id.EditText1);
        textTv = (TextView) findViewById(R.id.TextTv);
        nextButton = (Button) findViewById(R.id.nextButton1);

        editText.addTextChangedListener(answerTextWatcher);
    }
    private final TextWatcher answerTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String answer1 = editText.getText().toString().trim();
            nextButton.setEnabled(!answer1.isEmpty());

            if (answer.matcher(answer1).matches()){

            textTv.setText(R.string.text_tv1);
                nextButton.setOnClickListener(v -> {
                    Intent intent11 = new Intent(SecondQuiz.this, ThirdQuiz.class);
                    startActivity(intent11);

                });

            } else {
                textTv.setText(R.string.text_tv2);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            }


    };
    }

