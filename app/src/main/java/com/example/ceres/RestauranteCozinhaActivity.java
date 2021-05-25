package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteCozinhaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurante2_layout);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteCozinhaActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void tapiocaPage(View view) {
        Intent intent = new Intent(RestauranteCozinhaActivity.this, TapiocaActivity.class);
        startActivity(intent);
    }
    public void rapaduraPage(View view) {
        Intent intent = new Intent(RestauranteCozinhaActivity.this, RapaduraActivity.class);
        startActivity(intent);
    }
    public void carneSolPage(View view) {
        Intent intent = new Intent(RestauranteCozinhaActivity.this, CarneSolActivity.class);
        startActivity(intent);
    }
}