package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class RestaurantesAmpliados extends AppCompatActivity {

    Restaurante datosrestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        datosrestaurante=(Restaurante)getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this, datosrestaurante.getNombre(), Toast.LENGTH_SHORT).show();
    }
}