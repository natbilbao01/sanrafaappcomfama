package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.SitiosAmpliados;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class SitiosAdaptador extends RecyclerView.Adapter<SitiosAdaptador.viewHolder> {

    public ArrayList<Sitios>ListaSitios;

    public SitiosAdaptador() {
    }

    public SitiosAdaptador(ArrayList<Sitios> listaSitios) {
        ListaSitios = listaSitios;
    }

    @NonNull
    @Override
    public SitiosAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull SitiosAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(ListaSitios.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotomoldesitios;
        TextView nombresitios;

        TextView preciositios;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomoldesitios=itemView.findViewById(R.id.fotomoldesitios);
            nombresitios=itemView.findViewById(R.id.nombresitios);
            preciositios=itemView.findViewById(R.id.preciositios);
        }

        public void pintarMolde(Sitios sitios) {
            fotomoldesitios.setImageResource(sitios.getFotoGrafia());
            nombresitios.setText(sitios.getNombre());
            preciositios.setText(sitios.getTarifa());



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemView.getContext(), SitiosAmpliados.class);
                    intent.putExtra("datossitios",sitios);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
