package com.example.primerparciallabov.Edit;

import android.view.View;

public class EditListener implements View.OnClickListener {
    EditController controller;

    public EditListener(EditController controller){
        this.controller = controller;
    }

    @Override
    public void onClick(View view) {
        this.controller.editar();
    }
}
