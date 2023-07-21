package com.rgcreations.kglbconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView label , result;
    EditText input;
    Button tokg, tolb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label= findViewById(R.id.label);
        input = findViewById(R.id.input);
        result= findViewById(R.id.result);
        tokg = findViewById(R.id.tokg);
        tolb = findViewById(R.id.tolb);

        tokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lb = Double.parseDouble(input.getText().toString());
                double kg = convertToKg(lb);
                result.setText(String.valueOf(kg)+" kg(s)");
            }
        });

        tolb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kg = Double.parseDouble(input.getText().toString());
                double lb = convertToLb(kg);
                result.setText(String.valueOf(lb)+" lb(s)");
            }
        });
    }

    public double convertToKg(double lb){
        return lb / 2.205;
    }

    public double convertToLb(double kg){
        return kg*2.205;
    }

}