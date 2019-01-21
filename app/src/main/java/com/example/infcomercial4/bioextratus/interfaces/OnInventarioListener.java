package com.example.infcomercial4.bioextratus.interfaces;
import com.example.infcomercial4.bioextratus.model.InventarioModel;
public interface OnInventarioListener {
    void beforeCreate(InventarioModel model);
    void barcodeCapture(InventarioModel model);
    void cancel();

}
