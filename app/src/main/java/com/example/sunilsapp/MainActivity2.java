package com.example.sunilsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
RadioButton radio1, radio2, radio3;

private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radio1 = findViewById(R.id.rbAn);
        radio2 = findViewById(R.id.rbAn2);
        radio3 = findViewById(R.id.rbAn3);
        imageView = findViewById(R.id.img);

        radio1.setOnClickListener(this);
        radio2.setOnClickListener(this);
        radio3.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.rbAn:
                imageView.setImageResource(R.drawable.one);
                        break;
            case R.id.rbAn2:
                imageView.setImageResource(R.drawable.two);
                break;
            case R.id.rbAn3:
                imageView.setImageResource(R.drawable.three);
                break;
        }
    }
}
