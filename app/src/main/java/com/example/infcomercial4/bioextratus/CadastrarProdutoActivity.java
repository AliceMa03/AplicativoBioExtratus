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

import com.example.infcomercial4.bioextratus.BDbioextratus.ProdutosBD;
import com.example.infcomercial4.bioextratus.fragments.ProdutosCreateFragment;
import com.example.infcomercial4.bioextratus.model.ProdutoModel;

import java.util.ArrayList;

public class CadastrarProdutoActivity extends AppCompatActivity {
    private EditText editCodigo;
    private EditText editGrupo;
    private EditText editFamLin;
    private EditText editLinhaProd;
    private EditText editVolumetria;
    private EditText editTipo;
    private EditText editUnidade;
    private EditText editArmazem;
    private EditText editTEPadrao;
    private EditText editTSPadrao;
    private EditText editSegUnMed;
    private EditText editFatorConv;
    private EditText editOrdExp;
    private EditText editCodBarras1;
    private EditText editCodBarras;
    private Button btnIncluir;
    private Button btnAlterar;
    private Object view;
    ListView lista;
    ProdutosBD bd;
    ArrayList<ProdutoModel> listView_Produtos;
    ProdutoModel produtos;
    ArrayAdapter adapter;
    private ProdutosCreateFragment createFragment = null;
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_produto_activiy);

        editCodigo =(EditText)findViewById(R.id.editCodigo);
        editGrupo =(EditText)findViewById(R.id.editCodigo);
        editFamLin =(EditText)findViewById(R.id.editCodigo);
        editLinhaProd =(EditText)findViewById(R.id.editCodigo);
        editVolumetria =(EditText)findViewById(R.id.editCodigo);
        editTipo =(EditText)findViewById(R.id.editCodigo);
        editUnidade =(EditText)findViewById(R.id.editCodigo);
        editArmazem =(EditText)findViewById(R.id.editCodigo);
        editTEPadrao =(EditText)findViewById(R.id.editCodigo);
        editTSPadrao =(EditText)findViewById(R.id.editCodigo);
        editSegUnMed =(EditText)findViewById(R.id.editCodigo);
        editFatorConv =(EditText)findViewById(R.id.editCodigo);
        editOrdExp =(EditText)findViewById(R.id.editCodigo);
        editCodBarras1 =(EditText)findViewById(R.id.editCodigo);
        editCodBarras =(EditText)findViewById(R.id.editCodigo);
        btnIncluir =(Button) findViewById(R.id.btnIncluir);
        btnAlterar =(Button)findViewById(R.id.btnAlterar);


        btnIncluir.setOnClickListener();
        //lista=(ListView)findViewById(R.id.);

        registerForContextMenu(lista);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int i, long l) {
                int position;
                ProdutoModel produtoEscolhido = (ProdutoModel)adapter.getItemAtPosition(position);
                Intent i;
                i = new Intent(String.valueOf(CadastrarProdutoActivity.this));
                i.putExtra("produto-esolhido",produtoEscolhido);

            }
        });




        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public boolean onItemLongClick(AdapterView<?> adapter, View view, int i, long l) {
                produtos = (ProdutoModel)adapter.getItemAtPosition(i);
                return false;
            }
        });


    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        MenuItem menuDelete = menu.add("Deletar este produto");
        menuDelete.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
            public boolean onMenuItemClick(MenuItem item){
                bd= new ProdutosBD((CadastrarProdutoActivity.this));
                bd.deletarProduto(produtos);
                bd.close();
                carregarProduto();
                return true;
            }

        });
    }




    @Override
    protected void onResume(){
        super.onResume();
        carregarProduto();

    }
    public void carregarProduto(){
        bd= new ProdutosBD(CadastrarProdutoActivity.this);
        listView_Produtos= bd.getLista();
        bd.close();

        if(listView_Produtos != null){
            adapter = new ArrayAdapter<ProdutoModel>(CadastrarProdutoActivity.this,android.R.layout.simple_list_item_1,listView_Produtos);
            lista.setAdapter(adapter);
        }
        finish();

    }





}

