package com.example.pdv.controller;

import com.example.pdv.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente {

   private static List<Cliente> clientes = new ArrayList<>();

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void salvar(Cliente cliente){

        clientes.add(cliente);
    }

}
