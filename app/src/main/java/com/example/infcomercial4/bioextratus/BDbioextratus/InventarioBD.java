package com.example.infcomercial4.bioextratus.BDbioextratus;

import android.app.Fragment;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.String;

import com.example.infcomercial4.bioextratus.model.InventarioModel;
import com.example.infcomercial4.bioextratus.model.ProdutoModel;

import java.util.ArrayList;

public class InventarioBD extends SQLiteOpenHelper {

    private static final String DATABASE = "bdprodutos";
    private static final int VERSION = 1;


    public InventarioBD(Context context) {
        super(context, DATABASE, null, VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String produto = "CREATE TABLE produtos(codigo INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, descricao TEXT NOT NULL, lote INTEGER, armazem INTEGER, quantidade INTEGER);";
        db.execSQL(produto);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versaoVelha, int versaoNova) {
        String produto = "DROP TABLE IF EXISTS produtos";

        db.execSQL(produto);
    }

    public void salvarProduto(InventarioModel produtos) {
        ContentValues values = new ContentValues();

        values.put("descricao", produtos.getDescricao());
        values.put("lote", produtos.getLote());
        values.put("quantidade", produtos.getQuantidade());
        values.put("armazem", produtos.getArmazem());

        getWritableDatabase().insert("produtos", null, values);
    }

    public void alterarProduto(InventarioModel produtos) {
        ContentValues values = new ContentValues();

        values.put("descricao", produtos.getDescricao());
        values.put("lote", produtos.getLote());
        values.put("quantidade", produtos.getQuantidade());
        values.put("armazem", produtos.getArmazem());


        getWritableDatabase().insert("inventario", null, values);

        String[] args = {DATABASE.toString()};
        getWritableDatabase().update("inventario", values, "codigo=?", args);


    }

    public void deletarProduto(InventarioModel produtos) {
        String[] args = {DATABASE.toString()};
        getWritableDatabase().delete("inventario", "codigo=?", args);


    }


}

