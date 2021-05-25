package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteBatoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batore_layout);
    }
    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteBatoreActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void arrumadinhoPage(View view) {
        Intent intent = new Intent(RestauranteBatoreActivity.this, ArrumadinhoActivity.class);
        startActivity(intent);
    }

    public void baiaoPage(View view) {
        Intent intent = new Intent(RestauranteBatoreActivity.this, BaiaoActivity.class);
        startActivity(intent);
    }

    public void arrozDocePage(View view) {
        Intent intent = new Intent(RestauranteBatoreActivity.this, ArrozDoceActivity.class);
        startActivity(intent);
    }
}