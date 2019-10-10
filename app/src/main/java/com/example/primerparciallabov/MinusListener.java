package com.example.primerparciallabov;

import android.util.Log;
import android.view.View;

public class MinusListener implements View.OnClickListener {
    private MyViewHolder holder;
    private MainActivity a;

    public MinusListener(MyViewHolder holder, MainActivity a){
        this.holder = holder;
        this.a = a;
    }

    @Override
    public void onClick(View view) {
        int posicion = this.holder.position;
        this.a.controlStock(posicion, "minus");

        Log.d("listener", "debio RESTAR uno a " + posicion);
    }
}
