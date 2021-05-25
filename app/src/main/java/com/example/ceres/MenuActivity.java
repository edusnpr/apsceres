package com.example.ceres;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button alagoasPage, bahiaPage, cearaPage, maranhaoPage, paraibaPage, pernambucoPage, piauiPage, rioGrdNPage, sergipePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        alagoasPage = (Button) findViewById(R.id.btnAlagoas);
        bahiaPage = (Button) findViewById(R.id.btnBahia);
        cearaPage = (Button) findViewById(R.id.btnCeara);
        maranhaoPage = (Button) findViewById(R.id.btnMaranhao);
        paraibaPage = (Button) findViewById(R.id.btnParaiba);
        pernambucoPage = (Button) findViewById(R.id.btnPernambuco);
        piauiPage = (Button) findViewById(R.id.btnPiauí);
        rioGrdNPage = (Button) findViewById(R.id.btnRioGrd);
        sergipePage = (Button) findViewById(R.id.btnSergipe);


        alagoasPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AlagoasActivity.class);
                startActivity(intent);
            }
        });
        bahiaPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, BahiaActivity.class);
                startActivity(intent);
            }
        });
        cearaPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CearaActivity.class);
                startActivity(intent);
            }
        });
        maranhaoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MaranhaoActivity.class);
                startActivity(intent);
            }
        });
        paraibaPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ParaibaActivity.class);
                startActivity(intent);
            }
        });
        pernambucoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PernambucoActivity.class);
                startActivity(intent);
            }
        });
        piauiPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PiauiActivity.class);
                startActivity(intent);
            }
        });
        rioGrdNPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RioGrdNActivity.class);
                startActivity(intent);
            }
        });
        sergipePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SergipeActivity.class);
                startActivity(intent);
            }
        });
    }
}