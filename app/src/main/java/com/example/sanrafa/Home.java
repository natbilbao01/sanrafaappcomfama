package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    // ATRIBUTOS PARA REFERENCIAR ELEMENTOS GRAFICOS
    // QUE TENGO YO EN EL XML QUE QUIERO CONTROLAR EN JAVA
    Button botonHoteles;

    Button botonRestaurantes;

    Button botonSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Asociar las variables creadas con los ids de los elementos que vienen
        //desde XML
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitios=findViewById(R.id.botonsitios);

        //Escuchar eventos (clic en los botones)
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aca escribo lo que quiera hacer cuando presione el boton
                Toast.makeText(Home.this, "hizo clic en hoteles", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo clic en restaurantes", Toast.LENGTH_SHORT).show();
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo clic en sitios", Toast.LENGTH_SHORT).show();
            }
        });

    }
}