package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//restaurante porto - BAHIA
public class RestaurantePortoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurante1_layout);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(RestaurantePortoActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void acacaPage(View view) {
        Intent intent = new Intent(RestaurantePortoActivity.this, AcacaActivity.class);
        startActivity(intent);
    }
    public void acarajePage(View view) {
        Intent intent = new Intent(RestaurantePortoActivity.this, AcarajeActivity.class);
        startActivity(intent);
    }
    public void boboPage(View view) {
        Intent intent = new Intent(RestaurantePortoActivity.this, BoboActivity.class);
        startActivity(intent);
    }
}