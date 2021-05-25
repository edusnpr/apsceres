package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MoquecaSiriActivity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moqueca_siri_layout);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(MoquecaSiriActivity.this, MenuActivity.class);
        startActivity(intent);
    }
    public void restaurantePage(View view) {
        Intent intent = new Intent(MoquecaSiriActivity.this, RestauranteActivity.class);
        startActivity(intent);
    }
}