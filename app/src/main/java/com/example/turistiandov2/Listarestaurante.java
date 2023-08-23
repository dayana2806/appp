package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.turistiandov2.adaptadores.AdaptadoHoteles;
import com.example.turistiandov2.moldes.Moldehotel;
import com.example.turistiandov2.moldes.Molderestaurante;

import java.util.ArrayList;

public class Listarestaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurante);


    }
}