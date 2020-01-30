package com.example.pdv.controller;

import com.example.pdv.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente {

   private List<Cliente> clientes = new ArrayList<>();

    public  List<Cliente> getClientes() {
        return clientes;
    }

    public  void salvar(Cliente cliente){

        clientes.add(cliente);
    }


    public  void criaCliente(){
        Cliente cliente =  new Cliente("Yuri");
        clientes.add(cliente);

        cliente = new Cliente("Ygor");
        clientes.add(cliente);
    }
}
