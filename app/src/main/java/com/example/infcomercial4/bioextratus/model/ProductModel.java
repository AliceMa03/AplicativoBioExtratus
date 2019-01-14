package com.example.infcomercial4.bioextratus.model;

import java.io.Serializable;

public class ProductModel implements Serializable {
    public int codigo;
    public String descricao;
    public int quantidade;
    public String BarCode;

    public ProductModel(int codigo, String descricao, int quantidade, String barCode) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        BarCode = barCode;
    }
}
