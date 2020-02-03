package com.example.pdv.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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



    /**
     *@Autor Yuri Luis Garcia Pereira <yuri.luizg@hotmail.com>
     *@Função Ordenar por ordem alfabética todos os clientes
     *@Metodo ordenaPorOrdemAlfabetica(lista que vem como parametro)
     * ordena o array que vem por parametro em ordem alfabética.*/
    public class OrdenaPorOrdemAlfabetica implements Comparator<Cliente>{

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.getNome().compareToIgnoreCase(o2.getNome());
        }

        public void ordenaPorOrdemAlfabetica(List<Cliente> list){

            Collections.sort(list , new OrdenaPorOrdemAlfabetica());
        }
    }

}
