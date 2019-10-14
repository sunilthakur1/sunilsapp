package com.example.sunilsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    private RadioGroup rbg;
    private RadioButton radio1, radio2, radio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        rbg = findViewById(R.id.rgSubject);

        radio1  = findViewById(R.id.rbAn);
        radio2 = findViewById(R.id.rbAn2);
        radio3 = findViewById(R.id.rbAn3);

        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbAn){
                    Toast.makeText(getApplicationContext(), radio1.getText(), Toast.LENGTH_LONG).show();
                }else if(checkedId == R.id.rbAn2){
                    Toast.makeText(getApplicationContext(), radio2.getText(), Toast.LENGTH_LONG).show();
                }else if(checkedId == R.id.rbAn3){
                    Toast.makeText(getApplicationContext(), radio3.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
