package com.example.turistiandov2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.Moldehotel;

import java.util.ArrayList;

public class AdaptadoHoteles extends RecyclerView.Adapter<AdaptadoHoteles.viewHolder> {

    //TODOS ADATADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<Moldehotel> listaHoteles;


   //constructor vacio
    public AdaptadoHoteles() {
    }

    //constructor lleno
    public AdaptadoHoteles(ArrayList<Moldehotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public AdaptadoHoteles.viewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup parent, int viewType) {

        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null ,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull AdaptadoHoteles.viewHolder viewHolder, int i) {
      viewHolder.actualizarDatos(listaHoteles.get(i));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);
                    nombreHotel=itemView.findViewById(R.id.nombrelistahotel);
                    precioHotel=itemView.findViewById(R.id.precioturistahotel);
                            contactoHotel=itemView.findViewById(R.id.conctatolistahoteles);
        }

        public void actualizarDatos(Moldehotel moldehotel) {
            fotoHotel.setImageResource(moldehotel.getFoto());
            nombreHotel.setText(moldehotel.getNombre());
            precioHotel.setText(moldehotel.getPrecio());
            contactoHotel.setText(moldehotel.getTelefono());
                    }
    }


}

