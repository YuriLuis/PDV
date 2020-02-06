package com.example.pdv.dao;

import com.example.pdv.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private static List<Cliente> clientes = new ArrayList<Cliente>();

    public static void adicionaCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static List<Cliente> getClientes(){
        return clientes;
    }
}
