package com.example.primerparciallabov;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.primerparciallabov.Edit.EditActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    List<Producto> productos;
    MyAdapter adapter;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.productos = new ArrayList<Producto>();
        for(int i=0; i<12; i++){
            Producto p = new Producto("Producto "+ i, i*2, (float)2.5 * i);
            this.productos.add(p);
        }

        RecyclerView rv = (RecyclerView) this.findViewById(R.id.rv);
        this.adapter = new MyAdapter(this.productos, this);
        rv.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        rv.setLayoutManager(manager);
    }

    public void editarProducto(int posicion){
        Producto p = this.productos.get(posicion);

        Intent i = new Intent(this, EditActivity.class);
        i.putExtra("posicion", posicion + "");
        i.putExtra("nombre", p.nombre);
        i.putExtra("cantidad", p.cantidad + "");
        i.putExtra("precio", p.precio + "");

        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();

            String nombre = extras.getString("nombre");
            int cantidad = Integer.parseInt(extras.getString("cantidad"));
            float precio = Float.parseFloat(extras.getString("precio"));
            int posicion = Integer.parseInt(extras.getString("posicion"));

            Producto p = new Producto(nombre, cantidad, precio);

            this.productos.set(posicion, p);

            this.adapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void controlStock(int position, String action){
        Producto p = this.productos.get(position);
        int cantidad = p.cantidad;

        if(action == "minus" && cantidad > 0){
            cantidad--;
        } else if(action == "plus"){
            cantidad ++;
        }

        p.cantidad = cantidad;
        this.productos.set(position, p);

        this.adapter.notifyItemChanged(position);
    }
}
