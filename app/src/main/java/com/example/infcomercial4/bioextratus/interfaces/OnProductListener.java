package com.example.infcomercial4.bioextratus.interfaces;

import com.example.infcomercial4.bioextratus.model.ProdutoModel;

public interface OnProductListener {
    void beforeCreate(ProdutoModel model);
    void barcodeCapture(ProdutoModel model);
    void cancel();
}

