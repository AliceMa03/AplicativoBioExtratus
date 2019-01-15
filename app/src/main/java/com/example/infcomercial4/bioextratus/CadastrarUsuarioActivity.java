package com.example.infcomercial4.bioextratus;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Parcelable;
import android.widget.Toast;


import com.example.infcomercial4.bioextratus.util.ParseErros;

import java.text.ParseException;

public class CadastrarUsuarioActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editEmail;
    private EditText editSenha;
    private Button   btnCadastrar;
    private Object view;

    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editNome = (EditText) findViewById(R.id.editNome);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editSenha = (EditText) findViewById(R.id.editSenha);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);


    }



        public void abrirLoginUsuario(View view){
            Intent intent = new Intent(CadastrarUsuarioActivity.this, LoginActivity.class);
            startActivity( intent );
        }

        private void abrirLoginUsuario(){
            Intent intent = new Intent(CadastrarUsuarioActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

    }



