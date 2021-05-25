package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ArrumadinhoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrumadinho_layout);

    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(ArrumadinhoActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void restaurantePage(View view) {
        Intent intent = new Intent(ArrumadinhoActivity.this, RestauranteBatoreActivity.class);
        startActivity(intent);
    }
}
