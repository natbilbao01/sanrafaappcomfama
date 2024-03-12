package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Hotel> ListaHoteles=new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles=findViewById(R.id.Listadinamicadehoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador=new HotelAdaptador(ListaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);

    }

    public void crearListaHoteles(){
        ListaHoteles.add(new Hotel("Hotel la ceiba","45 usd","Ambiente campestre",
                "6045892056","calle principal 107",4,R.drawable.hotel));
        ListaHoteles.add(new Hotel("Hotel Donde guillermo","60 usd","Ambiente familiar",
                "604856951","Cra 37 no 28-10",3,R.drawable.hotel02));
        ListaHoteles.add(new Hotel("Hotel Villa Camila","30 usd","Zona Campestre",
                "60986551","Cra 12 no 28-10",3,R.drawable.villacamila));
        ListaHoteles.add(new Hotel("Hotel Guadalejo","30 usd","Zona Campestre",
                "60986551","Cra 12 no 28-10",3,R.drawable.hotelguadalejo));
        ListaHoteles.add(new Hotel("Hotel La Esquina","30 usd","Zona Campestre",
                "60986551","Cra 12 no 28-10",3,R.drawable.hotellaesquina));

    }

}