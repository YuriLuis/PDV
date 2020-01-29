package com.example.pdv.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pdv.controller.Adapter;
import com.example.pdv.model.Cliente;
import com.example.pdv.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Cliente> listaDeClientes = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_clientes); // layout que está o recycler view
        instaciaLayout();
        configurarRecyclerView();
        criaCliente();
    }

    public void instaciaLayout(){
        recyclerView = findViewById(R.id.recyclerViewClientes);
    }

    public Adapter configurarAdapter(){

        Adapter adapter = new Adapter( listaDeClientes );

        return adapter;
    }

    public void configurarRecyclerView(){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(configurarAdapter()); // Adapter

        /**@setHasFixedSize melhora a performace do recyclerview.*/
        recyclerView.setHasFixedSize(true);

    }

    public void criaCliente(){
        Cliente cliente =  new Cliente("Yuri");
        listaDeClientes.add(cliente);

        cliente = new Cliente("Ygor");
        listaDeClientes.add(cliente);
    }
}
