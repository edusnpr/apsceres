package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteArretadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arretado_layout);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteArretadoActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void peixadaPage(View view) {
        Intent intent = new Intent(RestauranteArretadoActivity.this, PeixadaActivity.class);
        startActivity(intent);
    }

    public void moquecaMarPage(View view) {
        Intent intent = new Intent(RestauranteArretadoActivity.this, MoquecaMarActivity.class);
        startActivity(intent);
    }

    public void arrozPage(View view) {
        Intent intent = new Intent(RestauranteArretadoActivity.this, ArrozActivity.class);
        startActivity(intent);
    }
}