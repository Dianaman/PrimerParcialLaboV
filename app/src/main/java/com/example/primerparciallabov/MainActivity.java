package com.example.primerparciallabov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

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
        MyAdapter adapter = new MyAdapter(this.productos);
        rv.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        rv.setLayoutManager(manager);
    }

    public void editarProducto(){
        Intent i = new Intent();

    }
}
