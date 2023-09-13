package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Molderestaurante;
import com.example.turistiandov2.moldes.Moldeturismo;

public class Ampliarturismo extends AppCompatActivity {

   Moldeturismo moldeturismo;
   ImageView fotoampliarturismo;
   TextView nombreampliarturismo;
   TextView puntajeturismo;
   TextView loremturismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliarturismo);
        fotoampliarturismo=findViewById(R.id.amplearimagenturismo);
        nombreampliarturismo=findViewById(R.id.ampliartituloturismo);
        puntajeturismo=findViewById(R.id.puntajeturismo);
      loremturismo=findViewById(R.id.ampliarloremturismo);

        moldeturismo=(Moldeturismo) getIntent().getSerializableExtra("datosturismo");

        //cargando la info en los componentes graficos

        fotoampliarturismo.setImageResource(moldeturismo.getFoto());
        nombreampliarturismo.setText(moldeturismo.getNombre());
        puntajeturismo.setText(moldeturismo.getPuntaje());
        loremturismo.setText(moldeturismo.getLorem());
    }
}