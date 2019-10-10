package com.example.primerparciallabov;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MyViewHolder extends RecyclerView.ViewHolder {
    View itemView;
    int position;
    TextView tvNombre;
    TextView tvCantidad;
    TextView tvPrecio;

    public MyViewHolder(@NonNull View itemView, MainActivity a) {
        super(itemView);

        this.itemView = itemView;

        MyListener myListener = new MyListener(this, a);
        itemView.setOnClickListener(myListener);

        MinusListener minusListener = new MinusListener(this, a);
        ImageButton minusBtn = itemView.findViewById(R.id.btn_minus);
        minusBtn.setOnClickListener(minusListener);

        PlusListener plusListener = new PlusListener(this, a);
        ImageButton plusBtn = itemView.findViewById(R.id.btn_plus);
        plusBtn.setOnClickListener(plusListener);

        this.tvNombre = (TextView) itemView.findViewById(R.id.nombreProducto);
        this.tvCantidad = itemView.findViewById(R.id.qty);
        this.tvPrecio = itemView.findViewById(R.id.price);
    }

}
