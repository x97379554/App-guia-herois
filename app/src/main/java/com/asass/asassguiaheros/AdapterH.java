package com.asass.asassguiaheros;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterH extends RecyclerView.Adapter<AdapterH.HerosVH>    {

    private List<Model_infoH> superheroL;

    public AdapterH(List<Model_infoH> superheroL) {
        this.superheroL = superheroL;
    }

    @NonNull
    @Override
    public AdapterH.HerosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_recycler, parent, false);
        return new HerosVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterH.HerosVH holder, int position) {
        Model_infoH model_infoH = superheroL.get(position);
        Picasso.get().load(model_infoH.getImg_h()).into(holder.perfil_imageView);
        holder.nome_H.setText(model_infoH.getNome_h());
        holder.habilidade_H.setText(model_infoH.getHabilidades_h());

    }

    @Override
    public int getItemCount() {
        return superheroL.size();
    }

    public class HerosVH extends RecyclerView.ViewHolder   {
        private ImageView perfil_imageView;
        private TextView nome_H;
        private TextView habilidade_H;

        public HerosVH(@NonNull View itemView) {
            super(itemView);
            perfil_imageView = itemView.findViewById(R.id.perfil_H);
            nome_H = itemView.findViewById(R.id.nome_H);
            habilidade_H = itemView.findViewById(R.id.habilidade_H);
        }
    }
}
