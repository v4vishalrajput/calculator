package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  EditText etFirst,etSecond;
  TextView txtAns;
  Button add,subtract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst=findViewById(R.id.etFirstValue);
        etSecond=findViewById(R.id.etSecondValue);
        txtAns=findViewById(R.id.textAns);
        add=findViewById(R.id.btnAdd);
        subtract=findViewById(R.id.btnSubtract);
        multiply=findViewById(R.id.btnMultiply);
        divide=findViewById(R.id.btnDivide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(etFirst.getText().toString());
                int second=Integer.parseInt(etSecond.getText().toString());
                int ans=first + second;
                txtAns.setText("Answer is "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(etFirst.getText().toString());
                int second=Integer.parseInt(etSecond.getText().toString());
                int ans=first - second;
                txtAns.setText("Answer is "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(etFirst.getText().toString());
                int second=Integer.parseInt(etSecond.getText().toString());
                int ans=first * second;
                txtAns.setText("Answer is "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(etFirst.getText().toString());
                int second=Integer.parseInt(etSecond.getText().toString());
                int ans=first / second;
                txtAns.setText("Answer is "+ans);
            }
        });
    }
}