package com.example.infcomercial4.bioextratus.model;

import java.io.Serializable;

public class ProdutoModel implements Serializable {
    private int codigo;
    private String descricao;
    private int grupo;
    private int famLin;
    private int linhaProd;
    private   int volumetria;
    private int tipo;
    private int unidade;
    private int armazem;
    private int tePadrao;
    private int tsPadrao;
    private int segUnMed;
    private int fatorConv;
    private   int ordExp;
    private int codBarras;
    private int codBarras1;
    private int codBarras2;

    public ProdutoModel(int codigo, String descricao, int grupo, int famLin, int linhaProd, int volumetria, int tipo, int unidade, int armazem, int tePadrao, int tsPadrao, int segUnMed, int fatorConv, int ordExp, int codBarras, int codBarras1, int codBarras2) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.grupo = grupo;
        this.famLin = famLin;
        this.linhaProd = linhaProd;
        this.volumetria = volumetria;
        this.tipo = tipo;
        this.unidade = unidade;
        this.armazem = armazem;
        this.tePadrao = tePadrao;
        this.tsPadrao = tsPadrao;
        this.segUnMed = segUnMed;
        this.fatorConv = fatorConv;
        this.ordExp = ordExp;
        this.codBarras = codBarras;
        this.codBarras1 = codBarras1;
        this.codBarras2 = codBarras2;
    }
    public String toString(){
        return descricao.toString();
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

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getFamLin() {
        return famLin;
    }

    public void setFamLin(int famLin) {
        this.famLin = famLin;
    }

    public int getLinhaProd() {
        return linhaProd;
    }

    public void setLinhaProd(int linhaProd) {
        this.linhaProd = linhaProd;
    }

    public int getVolumetria() {
        return volumetria;
    }

    public void setVolumetria(int volumetria) {
        this.volumetria = volumetria;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public int getArmazem() {
        return armazem;
    }

    public void setArmazem(int armazem) {
        this.armazem = armazem;
    }

    public int getTePadrao() {
        return tePadrao;
    }

    public void setTePadrao(int tePadrao) {
        this.tePadrao = tePadrao;
    }

    public int getTsPadrao() {
        return tsPadrao;
    }

    public void setTsPadrao(int tsPadrao) {
        this.tsPadrao = tsPadrao;
    }

    public int getSegUnMed() {
        return segUnMed;
    }

    public void setSegUnMed(int segUnMed) {
        this.segUnMed = segUnMed;
    }

    public int getFatorConv() {
        return fatorConv;
    }

    public void setFatorConv(int fatorConv) {
        this.fatorConv = fatorConv;
    }

    public int getOrdExp() {
        return ordExp;
    }

    public void setOrdExp(int ordExp) {
        this.ordExp = ordExp;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public int getCodBarras1() {
        return codBarras1;
    }

    public void setCodBarras1(int codBarras1) {
        this.codBarras1 = codBarras1;
    }

    public int getCodBarras2() {
        return codBarras2;
    }

    public void setCodBarras2(int codBarras2) {
        this.codBarras2 = codBarras2;
    }
}
