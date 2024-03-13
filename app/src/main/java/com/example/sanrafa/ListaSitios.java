package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.RestauranteAdaptador;
import com.example.sanrafa.adaptadores.SitiosAdaptador;
import com.example.sanrafa.moldes.Restaurantes;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList<com.example.sanrafa.moldes.Sitios>ListaSitios=new ArrayList<>();
    RecyclerView recyclerViewListaSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        crearlistaSitios();
        recyclerViewListaSitios=findViewById(R.id.Listadinamicadesitios);
        recyclerViewListaSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        SitiosAdaptador SitiosAdaptador = new SitiosAdaptador(ListaSitios);
        recyclerViewListaSitios.setAdapter(SitiosAdaptador);
    }

    private void crearlistaSitios() {
        ListaSitios.add(new Sitios("Monumento al Buey","Lugar emblematico","85069874","Al lado de la iglesia","todo el dia","gratis","ropa comoda",4,R.drawable.buey));
        ListaSitios.add(new Sitios("Tronco de la ceiba","Lugar emblematico","85062053","Parque principal","todo el dia","gratis","ropa comoda",5,R.drawable.ceiba));
        ListaSitios.add(new Sitios("Alto de la Virgen","Lugar de oracion","85052553","kilometro 3 ","todo el dia","gratis","ropa comoda",4,R.drawable.virgen));
        ListaSitios.add(new Sitios("Charco Quevedo","Lugar para el descanso","85062053","via tamesis","todo el dia","gratis","ropa comoda",5,R.drawable.charco));
        ListaSitios.add(new Sitios("Rapel","Deporte Extremo","85062512","Via pintada","De 10am a 3pm","$40USD","ropa comoda",5,R.drawable.rapel001));
    }
}