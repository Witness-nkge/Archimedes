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

public class FifthQuiz extends AppCompatActivity {

    private static final Pattern answer = Pattern.compile("5");
    private EditText editText3;
    private TextView textView3;
    private Button nextButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_quiz);

        editText3 = findViewById(R.id.EditText3);
        textView3 = findViewById(R.id.textTv3);
        nextButton3 = findViewById(R.id.nextButton3);

        editText3.addTextChangedListener(answerTextWatcher);

    }
    private final TextWatcher answerTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String answer1 = editText3.getText().toString().trim();
            nextButton3.setEnabled(!answer1.isEmpty());

            if (answer.matcher(answer1).matches()) {
                textView3.setText(R.string.text_tv1);
                nextButton3.setOnClickListener(v -> {
                    Intent intent12 = new Intent(FifthQuiz.this,SixthQuiz.class);
                    startActivity(intent12);
                });
            }
            else textView3.setText(R.string.text_tv2);
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    }

