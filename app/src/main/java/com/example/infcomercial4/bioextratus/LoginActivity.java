package com.example.infcomercial4.bioextratus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void abrirCadastroUsuario(View view){
        Intent intent = new Intent(LoginActivity.this,CadastrarUsuarioActivity.class);
        startActivity(intent);


    }



    private void abrirAreaPrincipal(){

        Intent intent = new Intent(LoginActivity.this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }

}
