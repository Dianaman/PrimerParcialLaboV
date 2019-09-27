package com.example.primerparciallabov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.primerparciallabov.Edit.EditActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.productos = new ArrayList<Producto>();
        for(int i=0; i<12; i++){
            Producto p = new Producto("Producto "+ i, i+2, i*3.5);
            this.productos.add(p);
        }

        RecyclerView rv = (RecyclerView) this.findViewById(R.id.rv);
        MyAdapter adapter = new MyAdapter(this.productos, this);
        rv.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        rv.setLayoutManager(manager);
    }

    public void editarProducto(){
        Log.d("Editar", "Editar");

        Intent i = new Intent(this, EditActivity.class);
        startActivityForResult(i, 1);
    }
}
