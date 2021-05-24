package com.example.ceres;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class Tela_Inicial extends AppCompatActivity{

    EditText c_email, c_senha;
    Button b_criar, b_entrar;
    String email_i, senha_i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        setContentView(R.layout.tela_inicial);
        c_email = (EditText) findViewById(R.id.c_email); //Indica a caixa de texto
        c_senha = (EditText) findViewById(R.id.c_senha);

        email_i = c_email.getText().toString();
        senha_i = c_senha.getText().toString();

        b_criar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(Tela_Inicial.this, Tela_Cadastro.class);
                startActivity(secondActivity);
            }
        });

        b_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Código para abrir a tela com oo Perfil e Dados de Clientes OBS: Adaptar
                Intent secondActivity = new Intent(Tela_Inicial.this, Tela_Dados_Cliente.class);
                startActivity(secondActivity);
                }*/
            }
        });
    }
}