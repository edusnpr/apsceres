package com.example.ceres;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PiauiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piaui_main);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(PiauiActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void restaurantePage(View view) {
        Intent intent = new Intent(PiauiActivity.this, RestauranteLampiaoActivity.class);
        startActivity(intent);
    }
    public void pratoPage(View view) {
        Intent intent = new Intent(PiauiActivity.this, BodeActivity.class);
        startActivity(intent);
    }
}
