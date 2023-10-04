package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;


import com.example.turistiandov2.adaptadores.AdaptadoHoteles;
import com.example.turistiandov2.adaptadores.AdaptadoresRestaurantes;
import com.example.turistiandov2.moldes.Molderestaurante;
import com.example.turistiandov2.moldes.Molderestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Listarestaurante extends AppCompatActivity {

    ArrayList<Molderestaurante> listaRestaurante = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurante);
        recyclerView=findViewById(R.id.listadinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombrerRestaurante=document.getString("nombre");
                                String precioRestaurante=document.getString("rango precio");
                                String puntaRestaurante=document.getString("puntaje");
                                String platoRecomendadoHoteles=document.getString("plato recomendado");
                                String telefonoRestaurante=document.getString("telefono");

                                Toast.makeText(Listarestaurante.this, nombrerRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listarestaurante.this, precioRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listarestaurante.this, puntaRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listarestaurante.this, platoRecomendadoHoteles, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listarestaurante.this, telefonoRestaurante, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


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