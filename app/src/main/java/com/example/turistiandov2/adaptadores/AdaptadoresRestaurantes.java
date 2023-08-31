package com.example.turistiandov2.adaptadores;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.Ampliarhotel;
import com.example.turistiandov2.Ampliarrestaurantes;
import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.Molderestaurante;

import java.util.ArrayList;

public class AdaptadoresRestaurantes extends RecyclerView.Adapter<AdaptadoresRestaurantes.viewHolder> {

    //TODOS ADATADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<Molderestaurante> listarestaurante;


    //constructor vacio
    public AdaptadoresRestaurantes() {
    }

    //constructor lleno
    public AdaptadoresRestaurantes(ArrayList<Molderestaurante> listarestaurante) {
        this.listarestaurante = listarestaurante;
    }

    @NonNull
    @Override
    public AdaptadoresRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null ,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadoresRestaurantes.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listarestaurante.get(i));
    }

    @Override
    public int getItemCount() {
        return listarestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotorestaurante;
        TextView nombrerestaurante;
        TextView preciorestaurante;
        TextView contactorestaurante;
        TextView platorestauarente;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotorestaurante=itemView.findViewById(R.id.fotolistarestaurantes);
            nombrerestaurante=itemView.findViewById(R.id.nombrerestaurante);
            preciorestaurante=itemView.findViewById(R.id.rangopreciolistarestaurante);
            contactorestaurante=itemView.findViewById(R.id.telefonolistarestaurante);
           platorestauarente=itemView.findViewById(R.id.platorecomendadolisrestauarantes);
        }

        public void actualizarDatos(Molderestaurante molderestaurante) {
            fotorestaurante.setImageResource(molderestaurante.getFoto());
            nombrerestaurante.setText(molderestaurante.getNombre());
            preciorestaurante.setText(molderestaurante.getRangoprecio());
            contactorestaurante.setText(molderestaurante.getTelefono());
            platorestauarente.setText(molderestaurante.getPlatorecomendado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Ampliarrestaurantes.class);
                    intent.putExtra("datosrestaurante",molderestaurante);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }


}

