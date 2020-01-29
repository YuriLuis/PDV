package com.example.pdv.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pdv.model.Cliente;
import com.example.pdv.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHoler> {

    private List<Cliente> clientes = new ArrayList<>();


    public Adapter(List<Cliente> fillmes){

        this.clientes = fillmes;
    }

    /**
     * @Autor Yuri Luis Garcia Pereira <yuri.luizg@hotmail.com>
     * @Metodo cria as visualização para o recyclerview que aparecem p/ o usuário*/
    @NonNull
    @Override
    public MyViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemDaLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false); // layout|cardView onde esta as dados para listagem

        return new MyViewHoler(itemDaLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoler holder, int position) {

        Cliente cliente = clientes.get(position);
            holder.nome.setText(cliente.getNome());

    }

    @Override
    public int getItemCount() {
        return clientes.size() ;
    }

    /**
     *@Classe MyViewHolder
     **/
    public class MyViewHoler extends RecyclerView.ViewHolder{

        TextView nome;

        public MyViewHoler(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.tvNome);
        }
    }
}

