package com.example.ceres;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import java.io.StringReader;

public class Tela_Cadastro extends AppCompatActivity {

    private Usuario usuario = new Usuario();
    EditText caixa_cpf, caixa_cep, caixa_nome, caixa_email, caixa_fone, caixa_senha1, caixa_senha2;
    Button b_cadastrar, b_voltar;
    String nome_cliente, cpf_cliente, cep_cliente, email_cliente, fone_cliente, senha_cadastro1, senha_cadastro2, senha_cliente;
    boolean c1, c2, c3, c4, c5, c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        setContentView(R.layout.tela_cadastro);
        caixa_nome = (EditText) findViewById(R.id.caixa_nome); //Indica a caixa de texto
        caixa_cpf = (EditText) findViewById(R.id.caixa_cpf);
        caixa_cep = (EditText) findViewById(R.id.caixa_cep);
        caixa_email = (EditText) findViewById(R.id.caixa_email);
        caixa_fone = (EditText) findViewById(R.id.caixa_fone);
        caixa_senha1 = (EditText) findViewById(R.id.caixa_senha1);
        caixa_senha2 = (EditText) findViewById(R.id.caixa_senha2);

        nome_cliente = caixa_nome.getText().toString(); //Pega o Texto da Caixa de Texto
        cpf_cliente = caixa_cpf.getText().toString();
        cep_cliente = caixa_cep.getText().toString();
        email_cliente = caixa_email.getText().toString();
        fone_cliente = caixa_fone.getText().toString();
        senha_cadastro1 = caixa_senha1.getText().toString();
        senha_cadastro2 = caixa_senha2.getText().toString();

        c1 = false; //Variáveis de Autentificação
        c2 = false;
        c3 = false;
        c4 = false;
        c5 = false;
        c6 = false;


        Intent intent = getIntent();
        if(intent != null){
            Bundle bundle = intent.getExtras();
            if(bundle != null){
                usuario.setId(bundle.getLong("id"));
                usuario.setNome(bundle.getString("nome"));
                usuario.setEmail(bundle.getString("email"));
                usuario.setCep(bundle.getString("cep"));
                usuario.setCpf(bundle.getString("cpf"));
                usuario.setFone(bundle.getString("fone"));
                usuario.setSenha(bundle.getString("senha"));

                caixa_nome.setText(usuario.getNome());
                caixa_email.setText(usuario.getEmail());
                caixa_fone.setText(usuario.getFone());
                caixa_cep.setText(usuario.getCep());
                caixa_cpf.setText(usuario.getCpf());
                caixa_senha2.setVisibility(View.GONE);

                b_cadastrar.setVisibility(View.GONE);
                //editarBt.setVisibility(View.VISIBLE);
            }
        }


        //Botão para voltar a tela anterior
        b_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent secondActivity = new Intent(Tela_Cadastro.this, Tela_Inicial.class);
                startActivity(secondActivity);
            }
        }
        );

        b_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(Tela_Cadastro.this);

                dialogo.setTitle("Atenção!");

                if (senha_cadastro1 != senha_cadastro2) {
                    dialogo.setMessage("As senhas não conhecidem!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else {
                    senha_cadastro1 = senha_cliente;
                    c1 = true;
                }

                if (nome_cliente == null || nome_cliente.isEmpty()) {
                    dialogo.setMessage("Insira o seu nome!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else c2 = true;

                if (cpf_cliente == null || cpf_cliente.isEmpty()) {
                    dialogo.setMessage("Insira o seu CPF!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else c3 = true;

                if (cep_cliente == null || cep_cliente.isEmpty()) {
                    dialogo.setMessage("Insira o seu nome!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else c4 = true;

                if (fone_cliente == null || fone_cliente.isEmpty()) {
                    dialogo.setMessage("Insira o seu Telefone!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else c5 = true;

                if (email_cliente == null || email_cliente.isEmpty()) {
                    dialogo.setMessage("Insira o seu CPF!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else c6 = true;

                if (c1 == true && c2 == true && c3 == true && c4 == true && c5 == true && c6 == true) {
                    //Colocar comando para inserir informações no Banco de Dados

                    usuario.setNome(nome_cliente);
                    usuario.setEmail(email_cliente);
                    usuario.setSenha(senha_cliente);
                    usuario.setFone(fone_cliente);
                    usuario.setCpf(cpf_cliente);
                    usuario.setCep(cep_cliente);

                    BD bd = new BD(Tela_Cadastro.this);//Ver Se isso está correto
                    bd.inserir(usuario);

                    Toast.makeText(Tela_Cadastro.this, "Usuário inserido com sucesso!",
                            Toast.LENGTH_SHORT).show(); //Ver se está correto
                    Intent intent = new Intent(Tela_Cadastro.this, MainActivity.class); //Ver se está certo
                    startActivity(intent);

                    dialogo.setTitle("Pronto!");
                    dialogo.setMessage("Informações Cadastradas com Sucesso!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();

                    /* Código para abrir a tela com oo Perfil e Dados de Clientes OBS: Adaptar
                    public void onClick(View view){
                    Intent secondActivity = new Intent(Tela_Cadastro.this, Tela_Dados_Cliente.class);
                    startActivity(secondActivity);
                    }*/
                }
            }
        }
        );

    }
}
