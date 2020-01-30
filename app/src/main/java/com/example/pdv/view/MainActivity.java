package com.example.pdv.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pdv.R;
import com.example.pdv.view.cliente.CadastroClienteActivity;
import com.example.pdv.view.cliente.ClienteActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnListaClientes, btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instanciaLayout();
        listarClientes();
        cadastrarCliente();
    }

    public void instanciaLayout(){

        btnListaClientes = findViewById(R.id.btnListaClientes);
        btnCadastrar = findViewById(R.id.btnCadastrar);
    }

    public void listarClientes(){
        btnListaClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ClienteActivity.class);
                startActivity(i);
            }
        });
    }

    public void cadastrarCliente(){
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CadastroClienteActivity.class);
                startActivity(i);
            }
        });
    }

}
