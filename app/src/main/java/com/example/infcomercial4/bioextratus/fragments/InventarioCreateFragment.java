package com.example.infcomercial4.bioextratus.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.infcomercial4.bioextratus.interfaces.OnInventarioListener;
import com.example.infcomercial4.bioextratus.model.InventarioModel;
import com.example.infcomercial4.bioextratus.interfaces.OnProductListener;
import java.lang.Double;
import com.example.infcomercial4.bioextratus.R;
import java.util.UUID;

public class InventarioCreateFragment extends Fragment {
    private EditText txtCodigo;
    private EditText txtDescricao;
    private EditText txtQuantidade;
    private EditText txtLote;
    private EditText txtArmazem;
    private TextView lblCode;
    private Button btnCapture;
    private Button btnAdd;
    private Button btnCancel;
    private InventarioModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View layout = inflater.inflate(R.layout.inventario_activity, container, false);

        this.model = new InventarioModel(UUID.randomUUID().toString(), "", "", 0);

        this.txtCodigo = (EditText)layout.findViewById(R.id.txtCodigo);
        this.txtQuantidade = (EditText)layout.findViewById(R.id.txtQuantidade);
        this.txtLote = (EditText)layout.findViewById(R.id.txtLote);
        this.txtArmazem = (EditText)layout.findViewById(R.id.txtArmazem);
        this.lblCode = (TextView)layout.findViewById(R.id.lblCode);

        this.btnCapture = (Button)layout.findViewById(R.id.btnCapture);
        this.btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getActivity() instanceof OnInventarioListener) {
                    OnInventarioListener listener = (OnInventarioListener) getActivity();

                    listener.barcodeCapture(model);
                }
            }
        });


        this.btnAdd = (Button)layout.findViewById(R.id.btnAdd);
        this.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() instanceof OnInventarioListener){
                    OnInventarioListener listener = (OnInventarioListener)getActivity();
                    model.quantidade = Integer.valueOf(txtQuantidade.getText().toString());
                    model.descricao = txtDescricao.getText().toString();
                    model.lote = txtLote.getText().toString();
                    model.armazem =  Integer.valueOf(txtArmazem.getText().toString());

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


    public void setBarCode(String barcode){
        lblCode.setText(barcode);
    }


}

