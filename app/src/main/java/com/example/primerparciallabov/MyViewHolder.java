package com.example.primerparciallabov;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyViewHolder extends RecyclerView.ViewHolder {
    View itemView;
    int position;
    MainActivity a;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        this.itemView = itemView;

        MyListener myListener = new MyListener();
        itemView.setOnClickListener(myListener);
    }

    public void onBind(List<Producto> productos){

        TextView tvNombre = (TextView) itemView.findViewById(R.id.nombreProducto);
        tvNombre.setText(productos.get(position).nombre);

        TextView tvCantidad = itemView.findViewById(R.id.qty);
        tvCantidad.setText(productos.get(position).cantidad + "");

        TextView tvPrecio = itemView.findViewById(R.id.price);
        tvPrecio.setText(productos.get(position).precio + "");
    }

}
