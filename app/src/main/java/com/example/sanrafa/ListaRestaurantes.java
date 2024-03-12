package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.moldes.Restaurantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<Restaurantes>ListaRestaurantes=new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerViewRestaurantes=findViewById(R.id.Listadinamicaderestaurantes);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));



    }
    public void crearlistarestaurantes(){
        ListaRestaurantes.add(new Restaurantes("La Aldea","20USD","Comida tipica de la region","6042589569","Calle principal",5,R.drawable.restaurante02));
        ListaRestaurantes.add(new Restaurantes("La Paila","10USD","Comida tipica de la region","6042589569","Calle principal",5,R.drawable.restaurante02));
        ListaRestaurantes.add(new Restaurantes("El pilon","15USD","Comida tipica de la region","6042589569","Calle principal",5,R.drawable.restaurante02));
        ListaRestaurantes.add(new Restaurantes("Maizal","30USD","Comida tipica de la region","6042589569","Calle principal",5,R.drawable.restaurante02));
        ListaRestaurantes.add(new Restaurantes("El Molino","35USD","Comida tipica de la region","6042589569","Calle principal",5,R.drawable.restaurante02));

    }

}