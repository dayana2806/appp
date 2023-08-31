package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Molderestaurante;
import com.example.turistiandov2.moldes.Moldeturismo;

public class Ampliarturismo extends AppCompatActivity {

   Moldeturismo moldeturismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliarturismo);

        moldeturismo=(Moldeturismo) getIntent().getSerializableExtra("datosturismo");
        Toast.makeText(this, moldeturismo.getNombre(), Toast.LENGTH_SHORT).show();
    }
}