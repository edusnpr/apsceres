package com.example.ceres;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewUsuario extends Activity {
    private Usuario usuario = new Usuario();
    private EditText nomeEt;
    private EditText emailEt;
    private EditText telefoneEt;
    private EditText cepEt;
    private EditText enderecoEt;
    private EditText senhaEt;
    private Button salvarBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);
        nomeEt = (EditText) findViewById(R.id.nome);
        emailEt = (EditText) findViewById(R.id.email);
        senhaEt = (EditText) findViewById(R.id.senha);
        telefoneEt = (EditText) findViewById(R.id.celular);
        cepEt = (EditText) findViewById(R.id.cep);
        enderecoEt = (EditText) findViewById(R.id.endereco);
        salvarBt = (Button) findViewById(R.id.btnCadastrar);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                usuario.setId(bundle.getLong("id"));
                usuario.setNome(bundle.getString("nome"));
                usuario.setEmail(bundle.getString("email"));
                usuario.setTelefone(bundle.getString("celular"));
                usuario.setCep(bundle.getString("cep"));
                usuario.setEndereco(bundle.getString("endereco"));
                nomeEt.setText(usuario.getNome());
                emailEt.setText(usuario.getEmail());
                telefoneEt.setText(usuario.getTelefone());
                cepEt.setText(usuario.getCep());
                enderecoEt.setText(usuario.getEndereco());
                senhaEt.setVisibility(View.GONE);
                salvarBt.setVisibility(View.GONE);
            }
        }
    }

    public void salvarUsuario(View view) {
        usuario.setNome(nomeEt.getText().toString());
        usuario.setEmail(emailEt.getText().toString());
        usuario.setTelefone(telefoneEt.getText().toString());
        usuario.setCep(cepEt.getText().toString());
        usuario.setEndereco(enderecoEt.getText().toString());
        usuario.setSenha(senhaEt.getText().toString());
        BD bd = new BD(this);
        bd.inserir(usuario);
        Toast.makeText(this, "Usuário inserido com sucesso!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
