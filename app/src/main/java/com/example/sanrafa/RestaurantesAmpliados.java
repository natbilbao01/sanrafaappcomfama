package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Restaurantes;

public class RestaurantesAmpliados extends AppCompatActivity {

    Restaurantes datosrestaurante;

    TextView titulorestaurante;
    ImageView imagenrestaurante;
    TextView calificacionrestaurante;

    TextView descripcionrestaurante;

    TextView telefonorestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        titulorestaurante=findViewById(R.id.tituloampliadorestaurantes);
        imagenrestaurante=findViewById(R.id.fotoampliadorestaurantes);
        calificacionrestaurante=findViewById(R.id.calificacionrestaurantes);
        descripcionrestaurante=findViewById(R.id.descripcionrestaurantes);
        telefonorestaurante=findViewById(R.id.telefonorestaurantes);

        datosrestaurante=(Restaurantes)getIntent().getSerializableExtra("datosrestaurante");

        titulorestaurante.setText(datosrestaurante.getNombre());
        imagenrestaurante.setImageResource(datosrestaurante.getFotoGrafia());
        calificacionrestaurante.setText(Integer.toString(datosrestaurante.getCalificacion()));
        descripcionrestaurante.setText(datosrestaurante.getDescripcion());

        Toast.makeText(this, datosrestaurante.getNombre(), Toast.LENGTH_SHORT).show();
    }
}