package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteLampiaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lampiao_layout);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteLampiaoActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void capotePage(View view) {
        Intent intent = new Intent(RestauranteLampiaoActivity.this, CapoteActivity.class);
        startActivity(intent);
    }

    public void bodePage(View view) {
        Intent intent = new Intent(RestauranteLampiaoActivity.this, BodeActivity.class);
        startActivity(intent);
    }

    public void mariaPage(View view) {
        Intent intent = new Intent(RestauranteLampiaoActivity.this, MariaActivity.class);
        startActivity(intent);
    }
}