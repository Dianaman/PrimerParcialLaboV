package com.example.primerparciallabov.Edit;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        EditModel model = new EditModel();
        EditController controller = new EditController(model);
        EditListener listener = new EditListener(controller);
        EditView view = new EditView(model, listener, this, controller);
        controller.setView(view);
    }
}
