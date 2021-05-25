package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//RESTAURANTE CASA DO SABOR
public class RestauranteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurante_layout);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void sururuPage(View view) {
        Intent intent = new Intent(RestauranteActivity.this, SururuActivity.class);
        startActivity(intent);
    }

    public void pituzadaPage(View view) {
        Intent intent = new Intent(RestauranteActivity.this, PituzadaActivity.class);
        startActivity(intent);
    }

    public void moquecaPage(View view) {
        Intent intent = new Intent(RestauranteActivity.this, MoquecaSiriActivity.class);
        startActivity(intent);
    }
}