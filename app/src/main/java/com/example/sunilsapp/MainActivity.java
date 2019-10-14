package com.example.sunilsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numFirst,numSec;
    TextView result;
    Button buttonAdd,  buttonSub, buttonMul, buttonDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numFirst = findViewById(R.id.firstnum);
        numSec = findViewById(R.id.secondnum);

        /*for result */
        result = findViewById(R.id.Textresult);

        /*fOr the buttons*/
        buttonAdd = findViewById(R.id.btnadd);
        buttonSub = findViewById(R.id.btnsubtract);
        buttonMul = findViewById(R.id.btnmultiply);
        buttonDiv = findViewById(R.id.btndivide);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = numFirst.getText().toString();
                String text2 = numSec.getText().toString();



              /*int a= Integer.parseInt(text);
                for(int i = 1;i<=10;i++){



                Log.d("Myoutput",i +"*"+a+"="+ i*a);}*/


                int a = Integer.parseInt(text1);
                int b = Integer.parseInt(text2);

                int c= a+b;

                result.setText(String.valueOf(c));
            }
        });

    }
}
