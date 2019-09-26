package com.example.primerparciallabov.Edit;

import android.widget.Button;
import android.widget.EditText;

import com.example.primerparciallabov.R;

public class EditView {
    EditModel model;
    EditController controller;
    EditText nombre;
    EditText cantidad;
    EditText precio;

    public EditView(EditModel model, EditListener listener, EditActivity a, EditController controller){
        this.model = model;
        this.controller = controller;

        Button btnEditar = (Button) a.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(listener);


    }
}
