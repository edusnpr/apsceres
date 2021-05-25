package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BuchadaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buchada_layout);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(BuchadaActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void restaurantePage(View view) {
        Intent intent = new Intent(BuchadaActivity.this, RestauranteJecaActivity.class);
        startActivity(intent);
    }
}