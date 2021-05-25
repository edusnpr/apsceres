package com.example.ceres;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MaranhaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ceara_main);
    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(MaranhaoActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void restaurantePage(View view) {
        Intent intent = new Intent(MaranhaoActivity.this, RestauranteCozinhaActivity.class);
        startActivity(intent);
    }
}
