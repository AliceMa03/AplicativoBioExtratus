package com.example.infcomercial4.bioextratus.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

import com.example.infcomercial4.bioextratus.interfaces.OnProductListener;
import com.example.infcomercial4.bioextratus.model.ProdutoModel;

import java.util.UUID;

public class ProdutosCreateFragment extends Fragment{

    private EditText txtCodigo;
    private EditText txtGrupo;
    private EditText txtFamLin;
    private EditText txtLinhaProd;
    private EditText txtVolumetria;
    private EditText txtTipo;
    private EditText txtUnidade;
    private EditText txtArmazem;
    private EditText txtTEPadrao;
    private EditText txtTSPadrao;
    private EditText txtSegUnMed;
    private EditText txtFatorConv;
    private EditText txtOrdExp;
    private EditText txtCodBarras1;
    private EditText txtCodBarras;
        private TextView lblCode;
        private Button btnCapture;
        private Button btnAdd;
        private Button btnCancel;
        private ProdutoModel model;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View layout = inflater.inflate(R.layout.cadastrar_produto_actitivty, container, false);

            this.model = new ProdutoModel(UUID.randomUUID().toString(), "", "", 0);

            this.txtCodigo = (EditText)layout.findViewById(R.id.txtCodigo);
            this.txtGrupo  = (EditText)layout.findViewById(R.id.txtGrupo);
            this.txtFamLin = (EditText)layout.findViewById(R.id.txtFamLin);
            this.txtLinhaProd =(EditText)layout.findViewById(R.id.LinhaProd);
            this.txtVolumetria = (EditText)layout.findViewById(R.id.txtVolumetria);
            this.txtTipo = (EditText)layout.findViewById(R.id.txtTipo);
            this.txtArmazem = (EditText)layout.findViewById(R.id.txtArmazem);
            this.txtUnidade= (EditText)layout.findViewById(R.id.txtUnidade);
            this.txtTEPadrao = (EditText)layout.findViewById(R.id.txtTEPadrao);
            this.txtTSPadrao = (EditText)layout.findViewById(R.id.txtTSPadrao);
            this.txtSegUnMed = (EditText)layout.findViewById(R.id.txtSegUnMed);
            this.txtFatorConv = (EditText)layout.findViewById(R.id.txtFatorConv);
            this.txtOrdExp = (EditText)layout.findViewById(R.id.OrdExp);
            this.txtCodBarras1=(EditText)layout.findViewById(R.id.txtCodBarras1);
            this.txtCodBarras=(EditText)layout.findViewById(R.id.txtCodBarras);
            this.lblCode = (TextView)layout.findViewById(R.id.lblCode);

            this.btnCapture = (Button)layout.findViewById(R.id.btnCapture);
            this.btnCapture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (getActivity() instanceof OnProductListener) {
                        OnProductListener listener = (OnProductListener) getActivity();
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
                        model.famLin = Integer.valueOf(txtFamLin.getText().toString());
                        model.codigo = Integer.valueOf(txtCodigo.getText().toString());
                        model.grupo = Integer.valueOf(txtGrupo.getText().toString());
                        model.linhaProd = Integer.valueOf(txtLinhaProd.getText().toString());
                        model.volumetria = Integer.valueOf(txtVolumetria.getText().toString());
                        model.fatorConv = Integer.valueOf(txtFatorConv.getText().toString());
                        model.codBarras1 = Integer.valueOf(txtCodBarras1.getText().toString());
                        model.ordExp = Integer.valueOf(txtOrdExp.getText().toString());
                        model.fatorConv = Integer.valueOf(txtFatorConv.getText().toString());
                        model.linhaProd = Integer.valueOf(txtLinhaProd.getText().toString());
                        model.tsPadrao = Integer.valueOf(txtTSPadrao.getText().toString());
                        model.tePadrao = Integer.valueOf(txtTEPadrao.getText().toString());
                        model.tipo = Integer.valueOf(txtLinhaProd.getText().toString());
                        model.unidade = Integer.valueOf(txtUnidade.getText().toString());
                        model.segUnMed = Integer.valueOf(txtSegUnMed.getText().toString());






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

