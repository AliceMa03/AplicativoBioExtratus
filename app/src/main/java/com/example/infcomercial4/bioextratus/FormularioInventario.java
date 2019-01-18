package com.example.infcomercial4.bioextratus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.infcomercial4.bioextratus.model.InventarioModel;

public class FormularioInventario extends AppCompatActivity {
    private EditText txtCodigo;
    private EditText txtArmazem;
    private EditText txtLote;
    private EditText txtQuantidade;

    private Button btnAlterar;

    InventarioModel editarInventario;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventario_activiy);

        Intent intent = getIntent();
        editarInventario = (InventarioModel) intent.getSerializableExtra("produto-escolhido");

        txtCodigo =(EditText)findViewById(R.id.txtCodigo);
        txtLote = (EditText)findViewById(R.id.txtLote);
        txtQuantidade= (EditText)findViewById(R.id.txtQuantidade);
        txtArmazem =(EditText)findViewById(R.id.txtArmazem);

        btnAlterar =(Button)findViewById(R.id.btnAlterar);

        if (editarInventario!=null){
            btnAlterar.setText("Alterar");
        }else{
            btnAlterar.setText("Cadastrar");
        }
    }


}
