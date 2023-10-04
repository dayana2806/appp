package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;


import com.example.turistiandov2.adaptadores.Adaptadoressitios;

import com.example.turistiandov2.moldes.Moldeturismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;


import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {


    ArrayList<Moldeturismo> listasitiosturisticos= new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.listadinamicasitiosturisticos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("sitios turisticos")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombresitio=document.getString("nombre");
                                String reseñasitio=document.getString("reseña");
                                String puntajesitios=document.getString("puntaje");

                                Toast.makeText(ListaSitiosTuristicos.this, nombresitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, reseñasitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, puntajesitios, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        Adaptadoressitios adaptadoressitios=new Adaptadoressitios(listasitiosturisticos);
        recyclerView.setAdapter(adaptadoressitios);

    }
    public void llenarListaConDatos(){
        listasitiosturisticos.add(new Moldeturismo("Pirámides de Giza","Dayana","310-8494323","150.0000",R.drawable.turismouno,"3.6","Las pirámides de Giza ocupan un destacado lugar en la lista de los mayores atractivos turísticos del planeta. Y ya lo hicieron desde tiempos remotos, pues supusieron una etapa destacada en el viaje del historiador griego Herodoto"));
        listasitiosturisticos.add(new Moldeturismo("Templo de Hatshepsut","Keiner","310-8494323","100.0000",R.drawable.turismotres,"4.7","El templo es una preciosidad, puede que determinadas partes de la estructura hayan sido demasiado restauradas, pero sigue siendo una maravilla que no hay que perderse"));
        listasitiosturisticos.add(new Moldeturismo("Templo de Lúxor","David","310-8494323","150.0000",R.drawable.turismocuatro,"4.1","El templo de Luxor, situado en el corazón de la antigua Tebas, se construyó esencialmente bajo las dinastías XVIII y XIX egipcias. Estaba consagrado al dios Amón bajo sus dos aspectos de Amón-Ra."));
    }
}
