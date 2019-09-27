package com.example.primerparciallabov.Edit;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.primerparciallabov.Producto;
import com.example.primerparciallabov.R;

public class EditActivity extends AppCompatActivity {
    String posicion;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.edit_title);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        this.posicion = extras.getString("posicion");

        String nombre = extras.getString("nombre");
        int cantidad = Integer.parseInt(extras.getString("cantidad"));
        float precio = Float.parseFloat(extras.getString("precio"));

        EditModel model = new EditModel(nombre, cantidad, precio);
        EditController controller = new EditController(model);
        EditListener listener = new EditListener(controller);
        EditView view = new EditView(model, listener, this, controller);
        controller.setView(view);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            setResult(RESULT_CANCELED);
            super.finish();
        }
        return true;
    }

    public void editarProducto(Producto p){
        Intent i = new Intent();
        i.putExtra("nombre", p.nombre);
        i.putExtra("cantidad", p.cantidad + "");
        i.putExtra("precio", p.precio+ "");
        i.putExtra("posicion", this.posicion + "");

        setResult(RESULT_OK, i);
        super.finish();
    }
}
