package com.example.primerparciallabov.Edit;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.primerparciallabov.R;

public class EditView {
    EditModel model;
    EditController controller;
    EditActivity activity;
    EditText nombre;
    TextView cantidad;
    EditText precio;

    public EditView(EditModel model, EditListener listener, EditActivity a, EditController controller){
        this.model = model;
        this.controller = controller;
        this.activity = a;

        Button btnEditar = (Button) a.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(listener);

        this.nombre = a.findViewById(R.id.nombreProducto);
        this.cantidad = a.findViewById(R.id.qty);
        this.precio = a.findViewById(R.id.price);

        this.nombre.setText(this.model.getProducto().nombre);
        this.cantidad.setText(this.model.getProducto().cantidad + "");
        this.precio.setText(this.model.getProducto().precio + "");
    }
}
