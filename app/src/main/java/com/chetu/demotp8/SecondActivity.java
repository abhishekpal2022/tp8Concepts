package com.chetu.demotp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvDisplay, tvMobNO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvDisplay = findViewById(R.id.tv_name);
        tvMobNO = findViewById(R.id.tv_mob_no);

        Intent intent = getIntent();
//        Bundle bundle = intent.getBundleExtra(Keys.BUNDLE);

//        String fname = intent.getStringExtra("fname");
//        String lname = intent.getStringExtra("lname");
//        String fname = bundle.getString(Keys.FNAME);
//        String lname = bundle.getString(Keys.LNAME);
//        Long mobNo = bundle.getLong(Keys.MOB_NO);

        UserDetails userDetails = (UserDetails) intent.getSerializableExtra(Keys.SER_DATA);
        String fname = userDetails.getfName();
        String lname = userDetails.getlName();
        Long mobNo= userDetails.getMobileNo();

        tvDisplay.setText("Hello, "+fname+" "+lname);
        tvMobNO.setText(String.valueOf(mobNo));


    }
}