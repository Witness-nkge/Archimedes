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

public class FourthActivity extends AppCompatActivity {

    private static final Pattern answer = Pattern.compile("60");
    private EditText editText1;
    private TextView textView;
    private Button nextButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_quiz);

        editText1 = findViewById(R.id.EditText2);
        textView = findViewById(R.id.TextTv2);
        nextButton2 = findViewById(R.id.nextButton2);

        editText1.addTextChangedListener(answerTextWatcher);
    }

    private TextWatcher answerTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String answer1 = editText1.getText().toString().trim();
            nextButton2.setEnabled(!answer1.isEmpty());

            if (answer.matcher(answer1).matches()) {

                textView.setText(R.string.text_tv1);
                nextButton2.setOnClickListener(v -> {
                    Intent intent11 = new Intent(FourthActivity.this, FifthQuiz.class);
                    startActivity(intent11);

                });

            } else {
                textView.setText(R.string.text_tv2);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
        }


    };
}
