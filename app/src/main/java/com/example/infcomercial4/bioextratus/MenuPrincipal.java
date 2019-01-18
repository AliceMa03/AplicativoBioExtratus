package com.example.infcomercial4.bioextratus;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MenuPrincipal extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirCadastroProduto(View view) {
        Intent it = new Intent(this, CadastrarProdutoActivity.class);
        startActivity(it);

    }

    public void abrirCadastrarInventario(View view) {
        Intent it = new Intent(this, CadastrarInventario.class);
        startActivity(it);


    }
}