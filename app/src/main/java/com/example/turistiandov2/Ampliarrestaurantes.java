package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Moldehotel;
import com.example.turistiandov2.moldes.Molderestaurante;

public class Ampliarrestaurantes extends AppCompatActivity {

    Molderestaurante molderestaurente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliarrestaurantes);

        molderestaurente=(Molderestaurante) getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this, molderestaurente.getNombre(), Toast.LENGTH_SHORT).show();


    }
}