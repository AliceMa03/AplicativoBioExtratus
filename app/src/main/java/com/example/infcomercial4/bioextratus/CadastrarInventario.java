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
import com.example.infcomercial4.bioextratus.model.ProdutoModel;

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
    ArrayList<ProdutoModel> listView_Produtos;
    ProdutoModel produtos;
    ArrayAdapter adapter;
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_produto_activiy);

        txtCodigo =(EditText)findViewById(R.id.txtCodigo);
        txtDescricao =(EditText)findViewById(R.id.txtDescricao);
        txtQuantidade =(EditText)findViewById(R.id.txtQuantidade);
        txtLote =(EditText)findViewById(R.id.txtLote);
        txtArmazem =(EditText)findViewById(R.id.txtArmazem);

        btnCapture =(Button) findViewById(R.id.btnIncluir);
        btnAdd =(Button)findViewById(R.id.btnAlterar);
        btnCancel=(Button)findViewById(R.id.btnCancel)

        lista=(ListView)findViewById(R.id.listView_Produtos);
        registerForContextMenu(lista);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int i, long l) {
                ProdutoModel produtoEscolhido = (ProdutoModel)adapter.getItemAtPosition(position);
                Intent i = new Intent(CadastrarInventario.this,)
                i.putExtra("produto-esolhido",produtoEscolhido);

            }
        });


        btnIncluir.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent= new Intent(CadastrarInventario.this,ListaProdutos.class);
                startActivity(intent);
            }
        });

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemLongClick(AdapterView<?> adapter, View view, int i, long l) {
                produtos = (ProdutoModel)adapter.getItemAtPosition()
                return false;
            }
        });


    }
    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo){
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
    protected void onResume(){
        super.onResume();
        carregarProduto();
    }

    private void cadastrarUsuario(){

        //Cria objeto usuario
        ParseUser usuario = new ParseUser();
        usuario.setUsername( textoUsuario.getText().toString() );
        usuario.setEmail( textoEmail.getText().toString() );
        usuario.setPassword( textoSenha.getText().toString() );

        //salva dados do usuario
        usuario.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if( e==null ){//sucesso ao salvar
                    Toast.makeText(CadastrarInventario.this, "Cadastro feito com sucesso!", Toast.LENGTH_LONG).show();
                    abrirLoginUsuario();
                }else{//erro ao salvar
                    ParseErros parseErros = new ParseErros();
                    String erro = parseErros.getErro( e.getCode() );
                    Toast.makeText(CadastrarInventario.this, erro , Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    protected void onResume(){
        super.onResume();
        carregarProduto();

    }
    public void carregarProduto(){
        bd= new ProdutosBD(CadastrarInventario.this);
        listView_Produtos= bd.getLista();
        bd.close();

        if(listView_Produtos != null){
            adapter = new ArrayAdapter<ProdutoModel>(CadastrarInventario.this,android.R.layout.simple_list_item_1,listView_Produtos);
            lista.setAdapter(adapter);
        }
        finish();

    }





}

