package com.chetu.demotp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleDemoActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnClick, btnSubmit;
    private Context context;
    private EditText etInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_demo);
        btnClick = findViewById(R.id.btn_click);
        etInput = findViewById(R.id.et_input);
        btnSubmit = findViewById(R.id.btn_submit);
        context = this;

//        btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(SimpleDemoActivity.this, "Button Pressed", Toast.LENGTH_SHORT).show();
////                Toast.makeText(getApplicationContext(), "Button Pressed", Toast.LENGTH_SHORT).show();
////                Toast.makeText(context, "Button Pressed", Toast.LENGTH_SHORT).show();
////                Toast.makeText(context, btnClick.getText().toString(), Toast.LENGTH_SHORT).show();
//                  if (etInput.getText().toString().length() == 10) {
//                    Toast.makeText(context, etInput.getText().toString(), Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(context, "input must be 10 digit", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        btnClick.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_submit){
            Toast.makeText(context, btnSubmit.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.btn_click){
            if (etInput.getText().toString().length() == 10) {
                Toast.makeText(context, etInput.getText().toString(), Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(context, "input must be 10 digit", Toast.LENGTH_SHORT).show();
            }
        }
    }
}