package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Sitios;

public class SitiosAmpliados extends AppCompatActivity {


    com.example.sanrafa.moldes.Sitios datossitios;

    TextView titulositios;
    ImageView imagensitios;
    TextView calificacionsitios;

    TextView descripcionsitios;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        titulositios=findViewById(R.id.tituloampliadositios);
        imagensitios=findViewById(R.id.fotoampliadositios);
        calificacionsitios=findViewById(R.id.calificacionsitios);
        descripcionsitios=findViewById(R.id.descripcionsitios);

        datossitios=(Sitios) getIntent().getSerializableExtra("datossitios");

        titulositios.setText(datossitios.getNombre());
        imagensitios.setImageResource(datossitios.getFotoGrafia());
        calificacionsitios.setText(Integer.toString((datossitios.getCalificacion())));

    }
}