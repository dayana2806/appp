package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Moldehotel;
import com.example.turistiandov2.moldes.Molderestaurante;

public class Ampliarrestaurantes extends AppCompatActivity {

    Molderestaurante molderestaurente;
    ImageView fotoampliarrestaurante;
    TextView nombreampliarrestauarnte;
    TextView numeroampliarrestaurante;
    TextView puntajerestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliarrestaurantes);
        fotoampliarrestaurante=findViewById(R.id.fotolistarestaurantes);
        nombreampliarrestauarnte=findViewById(R.id.nombrerestaurante);
        numeroampliarrestaurante=findViewById(R.id.numero);
        puntajerestaurante=findViewById(R.id.puntajerestaurante);

        molderestaurente=(Molderestaurante) getIntent().getSerializableExtra("datosrestaurante");

        //cargando la info en los componentes graficos

        fotoampliarrestaurante.setImageResource(molderestaurente.getFoto());
        nombreampliarrestauarnte.setText(molderestaurente.getNombre());
        numeroampliarrestaurante.setText(molderestaurente.getTelefono());
        puntajerestaurante.setText(molderestaurente.getPuntaje());

    }
}