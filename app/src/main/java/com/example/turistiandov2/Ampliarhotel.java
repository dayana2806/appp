package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Moldehotel;

public class Ampliarhotel extends AppCompatActivity {

    Moldehotel moldehotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliarhotel);

        moldehotel=(Moldehotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldehotel.getNombre(), Toast.LENGTH_SHORT).show();


    }
}