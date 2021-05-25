package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteJecaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeca_layout);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteJecaActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void pamonhaPage(View view) {
        Intent intent = new Intent(RestauranteJecaActivity.this, PamonhaActivity.class);
        startActivity(intent);
    }

    public void escondidoPage(View view) {
        Intent intent = new Intent(RestauranteJecaActivity.this, EscondidoActivity.class);
        startActivity(intent);
    }

    public void buchadaPage(View view) {
        Intent intent = new Intent(RestauranteJecaActivity.this, BuchadaActivity.class);
        startActivity(intent);
    }
}