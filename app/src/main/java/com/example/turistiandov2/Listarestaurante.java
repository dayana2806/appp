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
        listaRestaurante.add(new Molderestaurante("Charlie's Restaurant","310-8494323","100.000 a 450.000","Gourmet Mango Ice Cream ",R.drawable.restauarntedos));
        listaRestaurante.add(new Molderestaurante("Authentic Turkish food","310-8494323","50.000 a 300.00","GCheese PlatterLE 180 ",R.drawable.restaurantetres));
        listaRestaurante.add(new Molderestaurante("Indira Indian Restaurant","310-8494323","150.000 a 600.000","Ful Medames\n",R.drawable.restaurantecuatro));
        listaRestaurante.add(new Molderestaurante("Al Khal Egyptian Restaurant","310-8494323","70.000 a 300.000","Gourmet Mango Ice CreamKoshari ",R.drawable.restaurantesinco));

    }
}