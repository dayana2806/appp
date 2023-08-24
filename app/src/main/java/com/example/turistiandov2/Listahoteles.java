package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.turistiandov2.adaptadores.AdaptadoHoteles;
import com.example.turistiandov2.moldes.Moldehotel;

import java.util.ArrayList;

public class Listahoteles extends AppCompatActivity {


    ArrayList<Moldehotel> listaHoteles  = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadoHoteles adaptadoHoteles=new AdaptadoHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadoHoteles);

    }
    public void llenarListaConDatos(){
        listaHoteles.add(new Moldehotel("Lamar Azul","$350.000","3108494323",R.drawable.e));
        listaHoteles.add(new Moldehotel("Helnan Auberge FayoumSe","$150.000","3108494323",R.drawable.helnan));
        listaHoteles.add(new Moldehotel("Jaz Maraya ResortSe","$450.000","3108494323",R.drawable.jaz));
        listaHoteles.add(new Moldehotel("Tolip El Fairouz HotelSe ","$400.000","3108494323",R.drawable.tolip));
        listaHoteles.add(new Moldehotel("TIME Coral Nuweiba ResortSe ","$320.000","3108494323",R.drawable.time));
    }
}