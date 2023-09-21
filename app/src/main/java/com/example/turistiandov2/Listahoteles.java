package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.example.turistiandov2.adaptadores.AdaptadoHoteles;
import com.example.turistiandov2.moldes.Moldehotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Listahoteles extends AppCompatActivity {


    ArrayList<Moldehotel> listaHoteles  = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull  Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                               String nombreHotel=document.getString("nombre");
                               String precioHotel=document.getString("precio");
                                Toast.makeText(Listahoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                           // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        AdaptadoHoteles adaptadoHoteles=new AdaptadoHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadoHoteles);

    }
    public void llenarListaConDatos(){
        listaHoteles.add(new Moldehotel("Lamar Azul","$350.000","3108494323",R.drawable.e,"La gerencia y el personal nos complacemos en ser sus anfitriones. Espero poder demostrar todos los servicios que hacen de lamar azul un alojamiento especial.","4.5"));
        listaHoteles.add(new Moldehotel("Helnan Auberge FayoumSe","$150.000","3108494323",R.drawable.helnan,"Comodidad, calidez, calidad, disfrute de verdad… Lo que busques de un buen Hotel en nuestro Hotel lo hallarás sin dudar.","5.0"));
        listaHoteles.add(new Moldehotel("Jaz Maraya ResortSe","$450.000","3108494323",R.drawable.jaz,"La mejor estancia de tus vacaciones soñadas será nuestro Hotel, en el que sin dudas disfrutarás más que nada a más no poder.","3.8"));
        listaHoteles.add(new Moldehotel("Tolip El Fairouz HotelSe ","$400.000","3108494323",R.drawable.tolip,"No sólo es una estancia, no sólo es un Hotel, es un lugar cálido, cómodo y maravilloso en el que muchas maravillosas experiencias podrás tener.","4.4"));
        listaHoteles.add(new Moldehotel("Coral Nuweiba ResortSe ","$320.000","3108494323",R.drawable.time,"Que te sientas en nuestro Hotel tan bien como en tu hogar, es el propósito que nos proponemos día a día alcanzar y por el que nos esforzamos sin parar.","4.9"));
    }
}