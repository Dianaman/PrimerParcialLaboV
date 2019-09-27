package com.example.primerparciallabov.Edit;

import com.example.primerparciallabov.Producto;

public class EditModel {
    private Producto producto;

    public EditModel(String nombre, int cantidad, float precio){
        this.producto = new Producto(nombre, cantidad,precio);
    }

    public void setProducto(String nombre, int cantidad, float precio){
        this.producto = new Producto(nombre, cantidad,precio);
    }

    public Producto getProducto(){
        return this.producto;
    }

}
