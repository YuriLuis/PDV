package com.example.pdv.view.cliente;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pdv.R;
import com.example.pdv.adapter.AdapterCliente;
import com.example.pdv.controller.ControllerCliente;
import com.example.pdv.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClienteActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Cliente> listaDeClientes = new ArrayList<>();
    private ControllerCliente controllerCliente = new ControllerCliente();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_clientes);// layout que está o recycler view

        instaciaLayout();
        configurarRecyclerView();

    }

    public void instaciaLayout(){
        recyclerView = findViewById(R.id.recyclerViewClientes);

        if (controllerCliente.getClientes().isEmpty()){

        }

        this.listaDeClientes = controllerCliente.getClientes();

    }

    public AdapterCliente configurarAdapter(){


        AdapterCliente adapter = new AdapterCliente( listaDeClientes );



        return adapter;
    }

    public void configurarRecyclerView(){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(configurarAdapter()); // Adapter

        /**@setHasFixedSize melhora a performace do recyclerview.*/
        recyclerView.setHasFixedSize(true);

    }

}
