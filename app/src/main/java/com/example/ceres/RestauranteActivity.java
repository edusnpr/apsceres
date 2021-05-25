package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ceres.AlagoasActivity;
import com.example.ceres.MainActivity;
import com.example.ceres.R;

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
        Intent intent = new Intent(RestauranteActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void moquecaPage(View view) {
        Intent intent = new Intent(RestauranteActivity.this, MainActivity.class);
        startActivity(intent);
    }
}