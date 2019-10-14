package com.example.sunilsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
EditText result;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bd,be,bc,bx;
int num1, num2;
int res;
String op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result =findViewById(R.id.t1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b1);
        b3 = findViewById(R.id.b1);
        b4 = findViewById(R.id.b1);
        b5 = findViewById(R.id.b1);
        b6 = findViewById(R.id.b1);
        b7 = findViewById(R.id.b1);
        b8 = findViewById(R.id.b1);
        b9 = findViewById(R.id.b1);
        b0 = findViewById(R.id.b1);
        bp = findViewById(R.id.b1);
        bm = findViewById(R.id.b1);
        bd = findViewById(R.id.b1);
        bx = findViewById(R.id.b1);
        bc = findViewById(R.id.b1);
        be = findViewById(R.id.b1);

    }

    @Override
    public void onClick(View view) {
switch (view.)
    }
}
