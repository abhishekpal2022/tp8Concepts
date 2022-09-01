package com.chetu.demotp8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLongPress, btnPopupMenu, btnLaunchActivity;
    private EditText etFname, etLname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnLongPress = findViewById(R.id.btn_long_press);
        btnPopupMenu = findViewById(R.id.btn_popup_menu);
        btnLaunchActivity = findViewById(R.id.btn_launch_activity);
        etFname = findViewById(R.id.et_fname);
        etLname = findViewById(R.id.et_lname);

        btnLaunchActivity.setOnClickListener(this);
        btnPopupMenu.setOnClickListener(this);
        btnLongPress.setOnClickListener(this);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        if (menu instanceof MenuBuilder) {
            MenuBuilder menuBuilder = (MenuBuilder) menu;
            menuBuilder.setOptionalIconsVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
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
        return super.onContextItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_long_press){
            registerForContextMenu(view);
        }

        if(view.getId() == R.id.btn_popup_menu){
            // TODO: 9/1/2022
            PopupMenu popupMenu = new PopupMenu(MenuActivity.this, view);
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.context_menu, popupMenu.getMenu());
            popupMenu.show();

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.item_settings:
                            Toast.makeText(MenuActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                            break;

                        case R.id.item_about_us:
                            Toast.makeText(MenuActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.item_app_version:
                            Toast.makeText(MenuActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.item_about_app:
                            Toast.makeText(MenuActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                            break;
                    }
                    return false;
                }
            });
        }
        if (view.getId() == R.id.btn_launch_activity){
            Intent intent = new Intent(MenuActivity.this, SecondActivity.class);
            intent.putExtra("fname", etFname.getText().toString());
            intent.putExtra("lname", etLname.getText().toString());
            startActivity(intent);
        }
    }
}