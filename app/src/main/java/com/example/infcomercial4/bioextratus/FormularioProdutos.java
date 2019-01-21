 package com.example.infcomercial4.bioextratus;

 import android.content.Intent;
 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import java.lang.String;

 import com.example.infcomercial4.bioextratus.model.ProdutoModel;

 public class FormularioProdutos extends AppCompatActivity {
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
     private Button btnAlterar;

     ProdutoModel editarProduto, produtos;

     protected void onCreate(Bundle savedInstanceState){

         super.onCreate(savedInstanceState);
         setContentView(R.layout.cadastrar_produto_activiy);

         Intent intent = getIntent();
         editarProduto= (ProdutoModel) intent.getSerializableExtra("produto-escolhido");

         editCodigo =(EditText)findViewById(R.id.editCodigo);
         editGrupo =(EditText)findViewById(R.id.editGrupo);
         editFamLin =(EditText)findViewById(R.id.editFamLin);
         editLinhaProd =(EditText)findViewById(R.id.editLinhaProd);
         editVolumetria =(EditText)findViewById(R.id.editVolumetria);
         editTipo =(EditText)findViewById(R.id.editTipo);
         editUnidade =(EditText)findViewById(R.id.editUnidade);
         editArmazem =(EditText)findViewById(R.id.editArmazem);
         editTEPadrao =(EditText)findViewById(R.id.editTEPadrao);
         editTSPadrao =(EditText)findViewById(R.id.editTSPadrao);
         editSegUnMed =(EditText)findViewById(R.id.editSegUnMed);
         editFatorConv =(EditText)findViewById(R.id.editFatorCon);
         editOrdExp =(EditText)findViewById(R.id.editOrdExp);
         editCodBarras1 =(EditText)findViewById(R.id.editCodBarras1);
         editCodBarras =(EditText)findViewById(R.id.editCodBarras);
         btnAlterar =(Button)findViewById(R.id.btnAlterar);

         if (editarProduto!=null){
             btnAlterar.setText("Alterar");
         }else{
             btnAlterar.setText("Cadastrar");
         }

         btnAlterar.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){

                produtos.setCodigo(Integer.parseInt(editCodigo.getText().toString()));

                produtos.setArmazem(Integer.parseInt(editArmazem.getText().toString()));
                produtos.setCodBarras(Integer.parseInt(editCodBarras.getText().toString()));
                produtos.setCodBarras1(Integer.parseInt(editCodBarras1.getText().toString()));
                //produtos.setDescricao(editDescricao.getText().toString());
                produtos.setCodBarras1(Integer.parseInt(editCodBarras1.getText().toString()));
                produtos.setOrdExp(Integer.parseInt(editOrdExp.getText().toString()));
                produtos.setGrupo(Integer.parseInt(editGrupo.getText().toString()));
                produtos.setFamLin(Integer.parseInt(editFamLin.getText().toString()));
                produtos.setFatorConv(Integer.parseInt(editFatorConv.getText().toString()));
                produtos.setLinhaProd(Integer.parseInt(editLinhaProd.getText().toString()));
                produtos.setTipo(Integer.parseInt(editTipo.getText().toString()));
                produtos.setTsPadrao(Integer.parseInt(editTSPadrao.getText().toString()));
                produtos.setTePadrao(Integer.parseInt(editTEPadrao.getText().toString()));

             }


         });
     }


 }