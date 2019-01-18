package com.example.infcomercial4.bioextratus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.infcomercial4.bioextratus.BDbioextratus.ProdutosBD;
import com.example.infcomercial4.bioextratus.model.InventarioModel;

import java.util.ArrayList;

public class CadastrarInventario extends AppCompatActivity {
    private EditText txtCodigo;
    private EditText txtDescricao;
    private EditText txtQuantidade;
    private EditText txtLote;
    private EditText txtArmazem;
    private Button btnCapture;
    private Button btnAdd;
    private Button btnCancel;
    private Object view;
    ListView lista;
    ProdutosBD bd;
    ArrayList<InventarioModel> listView_Inventario;
    InventarioModel inventario;
    ArrayAdapter adapter;
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventario_activiy);

        txtCodigo =(EditText)findViewById(R.id.txtCodigo);
        txtDescricao =(EditText)findViewById(R.id.txtDescricao);
        txtQuantidade =(EditText)findViewById(R.id.txtQuantidade);
        txtLote =(EditText)findViewById(R.id.txtL);
        txtArmazem =(EditText)findViewById(R.id.txtArmazem);

        btnCapture =(Button) findViewById(R.id.btnIncluir);
        btnAdd =(Button)findViewById(R.id.btnAlterar);
        btnCancel=(Button)findViewById(R.id.btnCancel);

        lista=(ListView)findViewById(R.id.listView_Inventario);
        registerForContextMenu(lista);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int i, long l) {
                InventarioModel produtoEscolhido = (InventarioModel)adapter.getItemAtPosition(position);
                Intent i = new Intent(String.valueOf(CadastrarInventario.this));
                i.putExtra("produto-esolhido",produtoEscolhido);

            }
        });



        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onItemLongClick(AdapterView<?> adapter, View view, int i, long l) {
                inventario = (InventarioModel)adapter.getItemAtPosition();
                return false;
            }
        });


    }
    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo){
        MenuItem menuDelete = menu.add("Deletar este produto");
        menuDelete.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
            public boolean onMenuItemClick(MenuItem item){
                bd= new ProdutosBD((CadastrarInventario.this));
                bd.deletarProduto(inventario);
                bd.close();
                carregarProduto();
                return true;
            }

        });
    }
    protected void onResume(){
        super.onResume();
        carregarProduto();
    }








}

