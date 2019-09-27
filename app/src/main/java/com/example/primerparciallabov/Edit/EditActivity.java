package com.example.primerparciallabov.Edit;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.primerparciallabov.R;

public class EditActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Editar producto");
        actionBar.setDisplayHomeAsUpEnabled(true);

        EditModel model = new EditModel();
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
}
