package com.example.primerparciallabov;

import android.view.View;

public class MyListener implements View.OnClickListener {
    MainActivity context;

    public MyListener(MainActivity context){
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        context.editarProducto();
    }
}
