package com.example.primerparciallabov.Edit;

import android.util.Log;

public class EditController {
    EditModel model;
    EditView view;

    public EditController(EditModel model){
        this.model = model;
    }

    public void setView(EditView view){
        this.view = view;
    }

    public void editar(){
        int cantidad = Integer.parseInt(this.view.cantidad.getText()+"");
        float precio = Float.parseFloat(this.view.precio.getText()+"");
        String nombre = this.view.nombre.getText()+"";

        this.model.setProducto(nombre, cantidad, precio);

        this.view.activity.editarProducto(this.model.getProducto());
    }
}
