package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteMariasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marias_layout);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void sururuPage(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, SururuActivity.class);
        startActivity(intent);
    }

    public void pituzadaPage(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void moquecaPage(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, MainActivity.class);
        startActivity(intent);
    }
}