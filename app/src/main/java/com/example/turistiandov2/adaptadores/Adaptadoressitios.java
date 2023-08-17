package com.example.turistiandov2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    @androidx.annotation.NonNull
    @Override
    public Adaptadoressitios.viewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup parent, int viewType) {

        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null ,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull Adaptadoressitios.viewHolder viewHolder, int i) {
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
        public viewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);
            fotositio=itemView.findViewById(R.id.telefonoturismo);
            nombresitio=itemView.findViewById(R.id.valledelosrteyesimg);
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
        }
    }


}

