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
        listasitiosturisticos.add(new Moldeturismo("Las Pirámides de Giza","dayismo12345@gmail.com","310-8494323","150.0000",R.drawable.turismouno));
        listasitiosturisticos.add(new Moldeturismo(" Templo de Hatshepsut y Los Colosos Memnon","dayismo12345@gmail.com","310-8494323","100.0000",R.drawable.turismotres));
        listasitiosturisticos.add(new Moldeturismo("Templo de Lúxor","dayismo12345@gmail.com","310-8494323","150.0000",R.drawable.turismocuatro));
    }
}
