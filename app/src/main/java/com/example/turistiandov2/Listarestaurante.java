package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.turistiandov2.adaptadores.AdaptadoHoteles;
import com.example.turistiandov2.adaptadores.AdaptadoresRestaurantes;
import com.example.turistiandov2.moldes.Molderestaurante;
import com.example.turistiandov2.moldes.Molderestaurante;

import java.util.ArrayList;

public class Listarestaurante extends AppCompatActivity {

    ArrayList<Molderestaurante> listaRestaurante = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurante);
        recyclerView=findViewById(R.id.listadinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadoresRestaurantes adaptadoresRestaurantes=new AdaptadoresRestaurantes(listaRestaurante);
        recyclerView.setAdapter(adaptadoresRestaurantes);

    }
    public void llenarListaConDatos(){
        listaRestaurante.add(new Molderestaurante("Charlie's","310-8494323","100.000 a 450.000","Gourmet Mango",R.drawable.restauarntedos,"4.9"));
        listaRestaurante.add(new Molderestaurante("Authentic Turkish","310-8494323","50.000 a 300.00","GCheese PlatterLe",R.drawable.restaurantetres,"4.2"));
        listaRestaurante.add(new Molderestaurante("Indira Indian","310-8494323","150.000 a 600.000","Ful Medames\n",R.drawable.restaurantecuatro,"3.9"));
        listaRestaurante.add(new Molderestaurante("Al Khal Egyptian","310-8494323","70.000 a 300.000","Gourmet Mango",R.drawable.restaurantesinco,"5.0"));

    }
}