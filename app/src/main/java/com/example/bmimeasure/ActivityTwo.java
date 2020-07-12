package com.example.bmimeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private EditText weightEditText, heightEditText;
    private Button secondButton;
    private TextView bmiTextView, resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        weightEditText = findViewById(R.id.weight_editText_Id);
        heightEditText = findViewById(R.id.height_editText_Id);
        secondButton = findViewById(R.id.second_buttonId);
        bmiTextView = findViewById(R.id.bmi_textViewId);
        resultTextView = findViewById(R.id.result_textViewId);


        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double weight = 0;
                double height = 0;
                double bmi = 0;
                String msg = "";

                weight = Double.parseDouble(weightEditText.getText().toString());
                height = Double.parseDouble(heightEditText.getText().toString());

                bmi = height * height;
                bmi = weight / bmi;

                bmiTextView.setText(String.valueOf(bmi));

                if (bmi < 18.5) {
                    msg = "UnderWeight";
                } else if (bmi > 18.5 && bmi < 25) {
                    msg = "Normal";
                } else if (bmi > 25) {
                    msg = "OverWeight";
                }

                resultTextView.setText(msg);

            }
        });
    }
}
