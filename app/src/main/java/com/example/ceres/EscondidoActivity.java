package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EscondidoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escondido_layout);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(EscondidoActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void restaurantePage(View view) {
        Intent intent = new Intent(EscondidoActivity.this, RestauranteJecaActivity.class);
        startActivity(intent);
    }
}