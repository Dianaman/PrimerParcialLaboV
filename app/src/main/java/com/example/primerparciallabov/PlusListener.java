package com.example.primerparciallabov;

import android.util.Log;
import android.view.View;

public class PlusListener implements View.OnClickListener {
    private MyViewHolder holder;
    private MainActivity a;

    public PlusListener(MyViewHolder holder, MainActivity a){
        this.holder = holder;
        this.a = a;
    }

    @Override
    public void onClick(View view) {
        int posicion = this.holder.position;
        this.a.controlStock(posicion, "plus");
        Log.d("listener", "debio SUMAR uno a " + posicion);
    }
}
