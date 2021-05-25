package com.example.ceres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteRecantoActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recanto_layout);

    }


    public void voltarInicio(View view) {
        Intent intent = new Intent(RestauranteRecantoActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void pacoca(View view) {
        Intent intent = new Intent(RestauranteRecantoActivity.this, PacocaActivity.class);
        startActivity(intent);
    }

    public void feijao(View view) {
        Intent intent = new Intent(RestauranteRecantoActivity.this, FeijaoActivity.class);
        startActivity(intent);
    }

    public void cuscuz(View view) {
        Intent intent = new Intent(RestauranteRecantoActivity.this, CuscuzActivity.class);
        startActivity(intent);
    }
}
