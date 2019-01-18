package com.example.infcomercial4.bioextratus.model;

import java.io.Serializable;

public class InventarioModel implements Serializable {
    public int codigo;
    public String descricao;
    public int quantidade;
    public String lote;
    public int armazem;
    public String BarCode;

    public InventarioModel(int codigo, String descricao, int quantidade, String lote, int armazem, String barCode) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.lote = lote;
        this.armazem = armazem;
        BarCode = barCode;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getArmazem() {
        return armazem;
    }

    public void setArmazem(int armazem) {
        this.armazem = armazem;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    @Override
    public String toString() {
        return "InventarioModel{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", lote='" + lote + '\'' +
                ", armazem=" + armazem +
                ", BarCode='" + BarCode + '\'' +
                '}';
    }

    public InventarioModel(String toString, String s, String s1, int i) {
    }


}
