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

    public void noque(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, SururuActivity.class);
        startActivity(intent);
    }

    public void cocadaPage(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void caldoPage(View view) {
        Intent intent = new Intent(RestauranteMariasActivity.this, MainActivity.class);
        startActivity(intent);
    }
}