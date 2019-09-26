package com.example.primerparciallabov;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<Producto> productos;

    public MyAdapter(List<Producto> productos){
        this.productos = productos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("On create", "On create");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d("On bind", "On bind");
        holder.position = position;
        holder.onBind(this.productos);
    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }
}
