package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AlagoasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alagoas_main);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(AlagoasActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void restaurantePage(View view) {
        Intent intent = new Intent(AlagoasActivity.this, RestauranteActivity.class);
        startActivity(intent);
    }
    public void sururuPage(View view) {
        Intent intent = new Intent(AlagoasActivity.this, SururuActivity.class);
        startActivity(intent);
    }
}
