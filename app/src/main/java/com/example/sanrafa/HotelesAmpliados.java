package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;

public class HotelesAmpliados extends AppCompatActivity {

    Hotel datoshotel;
    TextView titulohotel;
    ImageView imagenhotel;
    TextView calificacionhotel;

    TextView descripcionhotel;

    TextView telefonohotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);

        titulohotel=findViewById(R.id.tituloampliadohoteles);
        imagenhotel=findViewById(R.id.fotoampliadohoteles);
        calificacionhotel=findViewById(R.id.calificacionhoteles);
        descripcionhotel=findViewById(R.id.descripcionhoteles);
        telefonohotel=findViewById(R.id.telefonohoteles);


        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");

        titulohotel.setText(datoshotel.getNombre());
        imagenhotel.setImageResource(datoshotel.getFotoGrafia());
        calificacionhotel.setText(Integer.toString(datoshotel.getCalificacion()));
        descripcionhotel.setText(datoshotel.getDescripcion());


        Toast.makeText(this, datoshotel.getNombre(), Toast.LENGTH_SHORT).show();
    }
}