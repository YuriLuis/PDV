package com.example.pdv.view.cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pdv.R;
import com.example.pdv.controller.ControllerCliente;
import com.example.pdv.model.Cliente;
import com.example.pdv.view.MainActivity;

public class CadastroClienteActivity extends AppCompatActivity {

    private EditText etNomeCliente;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        instanciaLayout();

    }

    public void instanciaLayout(){
        etNomeCliente = findViewById(R.id.etNomeCliente);
        btnCadastrar = findViewById(R.id.btnCadastrar);
    }

    public void cadastraCliente(View view){

        String nome = String.valueOf(etNomeCliente.getText());

        Toast.makeText(getApplicationContext(),
                "Cliente cadastrado!",
                Toast.LENGTH_LONG).show();

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        Cliente cliente = new Cliente(nome);

        ControllerCliente.salvar(cliente);
        startActivity(i);
    }


}
