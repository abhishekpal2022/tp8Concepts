package com.chetu.demotp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvDisplay = findViewById(R.id.tv_display);

        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");

        tvDisplay.setText("Hello, "+fname+" "+lname);


    }
}