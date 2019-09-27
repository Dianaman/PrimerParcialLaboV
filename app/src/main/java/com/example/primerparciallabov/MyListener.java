package com.example.primerparciallabov;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class MyListener implements View.OnClickListener {
    MainActivity a;
    MyViewHolder holder;

    public MyListener(MyViewHolder holder, MainActivity a){
        this.holder = holder;
        this.a = a;
    }

    @Override
    public void onClick(View view) {
        this.a.editarProducto(holder.position);
    }
}
