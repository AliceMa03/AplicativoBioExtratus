package com.example.infcomercial4.bioextratus.interfaces;

public interface OnProductListener {
    void beforeCreate(ProductModel model);
    void barcodeCapture(ProductModel model);
    void cancel();
}
