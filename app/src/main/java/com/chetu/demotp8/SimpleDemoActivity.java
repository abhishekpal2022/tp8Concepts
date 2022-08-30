package com.chetu.demotp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SimpleDemoActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    private Button btnClick, btnSubmit;
    private Context context;
    private EditText etInput;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_demo);
        btnClick = findViewById(R.id.btn_click);
        etInput = findViewById(R.id.et_input);
        btnSubmit = findViewById(R.id.btn_submit);
        radioGroup = findViewById(R.id.rg_gender);
        context = this;

        radioGroup.setOnCheckedChangeListener(this);

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
        if (view.getId() == R.id.btn_submit){
//            Toast.makeText(context, btnSubmit.getText().toString(), Toast.LENGTH_SHORT).show();
            Snackbar.make(view, btnSubmit.getText().toString(), Snackbar.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.btn_click){
            if (etInput.getText().toString().length() == 10) {
//                Toast.makeText(context, etInput.getText().toString(), Toast.LENGTH_SHORT).show();
                Snackbar.make(view, etInput.getText().toString(), Snackbar.LENGTH_SHORT).show();
            }else {
//                Toast.makeText(context, "input must be 10 digit", Toast.LENGTH_SHORT).show();
                Snackbar.make(view, "input must be 10 digit", Snackbar.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedRadioBUtton) {
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        Toast.makeText(context,  radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}