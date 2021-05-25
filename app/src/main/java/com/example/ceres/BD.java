package com.example.ceres;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
public class BD {
    private SQLiteDatabase bd;

    public BD(Context context) {
        BDCore auxBd = new BDCore(context);
        bd = auxBd.getWritableDatabase();
    }
    public void inserir(Usuario usuario) {
        ContentValues valores = new ContentValues();
        valores.put("nome", usuario.getNome());
        valores.put("email", usuario.getEmail());
        valores.put("telefone", usuario.getTelefone());
        valores.put("cep", usuario.getCep());
        valores.put("endereco", usuario.getEndereco());
        valores.put("senha", usuario.getSenha());
        bd.insert("usuario", null, valores);
    }
    public void atualizar(Usuario usuario) {
        ContentValues valores = new ContentValues();
        valores.put("nome", usuario.getNome());
        valores.put("email", usuario.getEmail());
        valores.put("telefone", usuario.getTelefone());
        valores.put("cep", usuario.getCep());
        valores.put("endereco", usuario.getEndereco());
        bd.update("usuario", valores, "_id = ?", new String[]{"" + usuario.getId()});
    }

    public void deletar(Usuario usuario) {
        bd.delete("usuario", "_id = " + usuario.getId(), null);
    }

}
