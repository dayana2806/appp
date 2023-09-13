package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Moldehotel;

public class Ampliarhotel extends AppCompatActivity {

    Moldehotel moldehotel;
    ImageView fotoampliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView descripcionhotel;
    TextView precioampliarhotel;
    TextView puntajehotel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliarhotel);
        fotoampliandoHotel = findViewById(R.id.fotoampliarhoteles);
        nombreAmpliandoHotel = findViewById(R.id.nombreampliarhoteles);
        descripcionhotel= findViewById(R.id.valoracionampliarhoteles);
        precioampliarhotel=findViewById(R.id.precioampliarthotel);
        puntajehotel=findViewById(R.id.puntajehotel);


        moldehotel = (Moldehotel) getIntent().getSerializableExtra("datoshotel");

        //cargando la info en los componentes graficos

        fotoampliandoHotel.setImageResource(moldehotel.getFoto());
        nombreAmpliandoHotel.setText(moldehotel.getNombre());
        descripcionhotel.setText(moldehotel.getDescrpcion());
        precioampliarhotel.setText(moldehotel.getPrecio());
        puntajehotel.setText(moldehotel.getPuntaje());
    }
}