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
    @Override
    public AdaptadoHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null ,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadoHoteles.viewHolder viewHolder, int i) {
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
        public viewHolder(@NonNull View itemView) {
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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Ampliarhotel.class);
                    itemView.getContext().startActivity(intent);
                }
            });

                    }
    }


}

