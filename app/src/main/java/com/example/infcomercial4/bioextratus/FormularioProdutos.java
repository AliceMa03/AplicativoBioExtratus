 package com.example.infcomercial4.bioextratus;
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

     Produtos editarProduto;

     protected void onCreate(Bundle savedInstanceState){

         super.onCreate(savedInstanceState);
         setContentView(R.layout.cadastrar_produto_activity);

         Intent intent = getIntent();
         editarProduto= (Produtos)intent.getSerializabeExtra("produto-escolhido");

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
         btnAlterar =(Button)findViewById(R.id.btnAlterar);

         if (editarProduto!=null){
             btnAlterar.setText("Alterar");
         }else{
             btnAlterar.setText("Cadastrar");
         }
     }


 }