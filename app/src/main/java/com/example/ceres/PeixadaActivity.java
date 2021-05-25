package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PeixadaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peixada_layout);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(PeixadaActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void restaurantePage(View view) {
        Intent intent = new Intent(PeixadaActivity.this, RestauranteArretadoActivity.class);
        startActivity(intent);
    }
}