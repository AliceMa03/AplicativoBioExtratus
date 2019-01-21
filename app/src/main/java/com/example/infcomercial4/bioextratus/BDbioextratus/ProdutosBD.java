package com.example.infcomercial4.bioextratus.BDbioextratus;

import android.app.Fragment;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.String;

import java.util.ArrayList;

import com.example.infcomercial4.bioextratus.CadastrarInventario;
import com.example.infcomercial4.bioextratus.model.InventarioModel;
import com.example.infcomercial4.bioextratus.model.ProdutoModel;
public class ProdutosBD extends SQLiteOpenHelper {

    private static final String DATABASE = "bdprodutos";
    private static final int VERSION = 1;
    private Fragment cursor;

    public ProdutosBD(Context context) {
        super(context, DATABASE, null, VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String produto = "CREATE TABLE produtos(codigo INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, descricao TEXT NOL NULL, grupo INTEGER, famLin INTEGER, linhaProd INTEGER, volumetria" +
                "INTEGER, tipo INTEGER, armazem INTEGER, tepadrao INETEGER, tspadrao INTEGER, segUnMed INTEGER, fatorConv INTEGER, ordExp INTEGER, codBarras1 INTEGER, codBarras INTEGER);";
        db.execSQL(produto);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versaoVelha, int versaoNova) {
        String produto = "DROP TABLE IF EXISTS produtos";

        db.execSQL(produto);
    }

    public void salvarProduto(ProdutoModel produtos) {
        ContentValues values = new ContentValues();

        values.put("descricao", produtos.getDescricao());
        values.put("grupo", produtos.getGrupo());
        values.put("famLin", produtos.getFamLin());
        values.put("linhaProd", produtos.getLinhaProd());
        values.put("volumetria", produtos.getVolumetria());
        values.put("tipo", produtos.getTipo());
        values.put("armazem", produtos.getArmazem());
        values.put("tepadrao", produtos.getTePadrao());
        values.put("tspadrao", produtos.getTsPadrao());
        values.put("segUnMed", produtos.getSegUnMed());
        values.put("fatorConv", produtos.getFatorConv());
        values.put("ordExp", produtos.getOrdExp());
        values.put("codBarras", produtos.getCodBarras());
        values.put("codBarras1", produtos.getCodBarras1());
        values.put("tipoConv", produtos.getTipoConv());

        getWritableDatabase().insert("produtos", null, values);
    }

    public void alterarProduto(ProdutoModel produtos) {
        ContentValues values = new ContentValues();

        values.put("descricao", produtos.getDescricao());
        values.put("grupo", produtos.getGrupo());
        values.put("famLin", produtos.getFamLin());
        values.put("linhaProd", produtos.getLinhaProd());
        values.put("volumetria", produtos.getVolumetria());
        values.put("tipo", produtos.getTipo());
        values.put("armazem", produtos.getArmazem());
        values.put("tepadrao", produtos.getTePadrao());
        values.put("tspadrao", produtos.getTsPadrao());
        values.put("segUnMed", produtos.getSegUnMed());
        values.put("fatorConv", produtos.getFatorConv());
        values.put("ordExp", produtos.getOrdExp());
        values.put("codBarras", produtos.getCodBarras());
        values.put("codBarras1", produtos.getCodBarras1());
        values.put("tipoConv", produtos.getTipoConv());

        getWritableDatabase().insert("produtos", null, values);
        String[] args = {DATABASE.toString()};
        getWritableDatabase().update("produtos", values, "codigo=?", args);
    }




        public void deletarProduto(ProdutoModel produtos) {
            String[] args = {DATABASE.toString()};
            getWritableDatabase().delete("inventario", "codigo=?", args);


        }


    }




