package com.example.pdv.model;

import java.io.Serializable;

public class Cliente  implements Serializable {

    private String nome;

    public Cliente(){

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
