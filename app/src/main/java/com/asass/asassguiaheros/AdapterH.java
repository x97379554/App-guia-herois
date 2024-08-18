package com.asass.asassguiaheros;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterH extends RecyclerView.Adapter<AdapterH.HerosVH>    {

    @NonNull
    @Override
    public AdapterH.HerosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterH.HerosVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HerosVH extends RecyclerView.ViewHolder   {

        public HerosVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
