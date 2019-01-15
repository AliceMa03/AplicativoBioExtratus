package com.example.infcomercial4.bioextratus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.infcomercial4.bioextratus.model.ProdutoModel;

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

        Intent intent = getIntent();
        editarProduto = (ProdutoModel)intent.getSerializableExtra("produto-escolhido");
        if(editarProduto!= null){
            btnIncluir.setText("Modificar");
        }else{
            btnIncluir.setText("Cadastrar");
        }

        btnIncluir.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent= new Intent(CadastrarProdutoActivity.this,ListaProdutos.class);
                startActivity(intent);
            }
        });


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
                    Toast.makeText(CadastroActivity.this, "Cadastro feito com sucesso!", Toast.LENGTH_LONG).show();
                    abrirLoginUsuario();
                }else{//erro ao salvar
                    ParseErros parseErros = new ParseErros();
                    String erro = parseErros.getErro( e.getCode() );
                    Toast.makeText(CadastroActivity.this, erro , Toast.LENGTH_LONG).show();
                }
            }
        });

    }





    }

