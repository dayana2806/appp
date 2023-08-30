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
import com.example.turistiandov2.Ampliarturismo;
import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.Moldeturismo;

import java.util.ArrayList;

public class Adaptadoressitios extends RecyclerView.Adapter<Adaptadoressitios.viewHolder> {

    //TODOS ADATADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<Moldeturismo> listasitiosturisticos;


    //constructor vacio
    public Adaptadoressitios() {
    }

    //constructor lleno
    public Adaptadoressitios(ArrayList<Moldeturismo> listasitiosturisticos) {
        this.listasitiosturisticos = listasitiosturisticos;
    }

    @NonNull
    @Override
    public Adaptadoressitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null ,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadoressitios.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listasitiosturisticos.get(i));
    }

    @Override
    public int getItemCount() {
        return listasitiosturisticos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotositio;
        TextView nombresitio;
        TextView preciositio;
        TextView contactositio;
        TextView telefonositios;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotositio=itemView.findViewById(R.id.valledelosrteyesimg);
            nombresitio=itemView.findViewById(R.id.moldeturismo);
            preciositio=itemView.findViewById(R.id.precioturismo);
            contactositio=itemView.findViewById(R.id.telefonoturismo);
            telefonositios=itemView.findViewById(R.id.telefonoturismo2);
        }

        public void actualizarDatos(Moldeturismo moldeturismo) {
            fotositio.setImageResource(moldeturismo.getFoto());
            nombresitio.setText(moldeturismo.getNombre());
            preciositio.setText(moldeturismo.getPrecio());
            contactositio.setText(moldeturismo.getNombreContacto());
            telefonositios.setText(moldeturismo.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Ampliarturismo.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }


}

