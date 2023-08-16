package com.example.turistiandov2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.view.menu.MenuView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.Moldehotel;
import com.example.turistiandov2.moldes.Molderestaurante;

import java.util.ArrayList;

public class AdatadoresRestaurantes {
    //TODOS ADATADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<Molderestaurante> listaRestaurantes;


    //constructor vacio
    public AdatadoresRestaurantes() {
    }

    //Construtor lleno


    public AdatadoresRestaurantes(ArrayList<Molderestaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public AdatadoresRestaurantes.viewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup parent, int viewType) {

        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante, null, false);
        return new AdatadoresRestaurantes().viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull AdatadoresRestaurantes.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView rangoprecioRestaurante;
        TextView telefonoRestaurante;
        TextView platorecomendadoRestaurante;
    }

    public viewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
        super(itemView);

        fotoRestaurante = itemView.findViewById(R.id.fotolistarestaurantes);
        nombreRestaurante = itemView.findViewById(R.id.nombrerestaurante);
        rangoprecioRestauranteitemView.findViewById(R.id.rangopreciolistarestaurante);
        telefonoRestauranteitemView.findViewById(R.id.telefonolistarestaurante);
        platorecomendadoRestauranteitemView.findViewById(R.id.platorecomendadolisrestauarantes);
    }

    public void actualizarDatos(Molderestaurante molderestaurante) {
        fotoRestauarnte.setImageResource(molderestaurante.getFoto());
        nombreRestaurante.setText(molderestaurante.getNombre());
        rengoprecioRestaurante.setText(molderestaurante.getRangoprecio());
        telefonoRestaurante.setText(molderestaurante.getTelefono());
        platorecomendadoRestauante.setText(molderestaurante.getPlatorecomendado());
    }


}






}
