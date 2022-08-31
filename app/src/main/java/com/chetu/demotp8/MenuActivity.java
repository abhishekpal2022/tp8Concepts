package com.chetu.demotp8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        if (menu instanceof MenuBuilder){
            MenuBuilder menuBuilder= (MenuBuilder) menu;
            menuBuilder.setOptionalIconsVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_settings:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_about_us:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_app_version:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_about_app:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}