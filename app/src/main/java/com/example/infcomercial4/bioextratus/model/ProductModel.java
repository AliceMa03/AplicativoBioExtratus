package com.example.infcomercial4.bioextratus.model;

import java.io.Serializable;

public class ProductModel implements Serializable {
    public int codigo;
    public String descricao;
    public int quantidade;
    public String lote;
    public int armazem;
    public String BarCode;

    public ProductModel(int codigo, String descricao, int quantidade, String lote, int armazem, String barCode) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.lote = lote;
        this.armazem = armazem;
        BarCode = barCode;
    }
}
