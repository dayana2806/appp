package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.turistiandov2.adaptadores.Adaptadoressitios;

import com.example.turistiandov2.moldes.Moldeturismo;


import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {


    ArrayList<Moldeturismo> listasitiosturisticos= new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.listadinamicasitiosturisticos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        Adaptadoressitios adaptadoressitios=new Adaptadoressitios(listasitiosturisticos);
        recyclerView.setAdapter(adaptadoressitios);

    }
    public void llenarListaConDatos(){
        listasitiosturisticos.add(new Moldeturismo("Pirámides de Giza","Dayana","310-8494323","150.0000",R.drawable.turismouno,"3.6","Las pirámides de Giza ocupan un destacado lugar en la lista de los mayores atractivos turísticos del planeta. Y ya lo hicieron desde tiempos remotos, pues supusieron una etapa destacada en el viaje del historiador griego Herodoto"));
        listasitiosturisticos.add(new Moldeturismo("Templo de Hatshepsut","Keiner","310-8494323","100.0000",R.drawable.turismotres,"4.7","El templo es una preciosidad, puede que determinadas partes de la estructura hayan sido demasiado restauradas, pero sigue siendo una maravilla que no hay que perderse"));
        listasitiosturisticos.add(new Moldeturismo("Templo de Lúxor","David","310-8494323","150.0000",R.drawable.turismocuatro,"4.1","El templo de Luxor, situado en el corazón de la antigua Tebas, se construyó esencialmente bajo las dinastías XVIII y XIX egipcias. Estaba consagrado al dios Amón bajo sus dos aspectos de Amón-Ra."));
    }
}
