package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ArrozDoceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arroz_doce_layout);

    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(ArrozDoceActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void restaurantePage(View view) {
        Intent intent = new Intent(ArrozDoceActivity.this, RestauranteBatoreActivity.class);
        startActivity(intent);
    }
}