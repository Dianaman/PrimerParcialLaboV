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
    MainActivity ac;

    public MyAdapter(List<Producto> productos, MainActivity ac){
        this.ac = ac;
        this.productos = productos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("On create", "On create");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v, this.ac);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.position = position;

        holder.tvNombre.setText(productos.get(position).nombre);
        holder.tvCantidad.setText(productos.get(position).cantidad + "");
        holder.tvPrecio.setText(productos.get(position).precio + "");
    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }
}
