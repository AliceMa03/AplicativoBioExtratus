package com.example.infcomercial4.bioextratus.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.infcomercial4.bioextratus.model.ProductModel;
import com.example.infcomercial4.bioextratus.interfaces.OnProductListener;

import java.util.UUID;

public class ProductCreateFragment xtends Fragment {

    private EditText txtCodigo;
    private EditText txtDescricao;
    private EditText txtQuantidade;
    private TextView lblCode;
    private Button btnCapture;
    private Button btnAdd;
    private Button btnCancel;
    private ProductModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View layout = inflater.inflate(R.layout.product_activity, container, false);

        this.model = new ProductModel(UUID.randomUUID().toString(), "", "", 0);

        this.txtCodigo = (EditText)layout.findViewById(R.id.txtCodigo);
        this.txtQuantidade = (EditText)layout.findViewById(R.id.txtQuantidade);
        this.lblCode = (TextView)layout.findViewById(R.id.lblCode);

        this.btnCapture = (Button)layout.findViewById(R.id.btnCapture);
        this.btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() instanceof OnProductListener){
                    OnProductListener listener = (OnProductListener)getActivity();
                    listener.barcodeCapture(model);
                }
            }
        });


        this.btnAdd = (Button)layout.findViewById(R.id.btnAdd);
        this.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() instanceof OnProductListener){
                    OnProductListener listener = (OnProductListener)getActivity();
                    model.quantidade = Double.valueOf(txtQuantidade.getText().toString());
                    model.descricao = txtDescricao.getText().toString();
                    model.BarCode = lblCode.getText().toString();

                    listener.beforeCreate(model);
                }
            }
        });

        this.btnCancel = (Button)layout.findViewById(R.id.btnCancel);
        this.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() instanceof OnProductListener){
                    OnProductListener listener = (OnProductListener)getActivity();
                    listener.cancel();
                }
            }
        });

        return layout;
    }

    private Object getActivity() {
    }

    public void setBarCode(String barcode){
        lblCode.setText(barcode);
    }

}

