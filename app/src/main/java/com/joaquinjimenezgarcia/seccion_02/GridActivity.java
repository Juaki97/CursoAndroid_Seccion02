package com.joaquinjimenezgarcia.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    private List<String> names;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView) findViewById(R.id.gridView);

        // Datos a mostrar
        names = new ArrayList<String>();
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");

        // Enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.grid_item, names);
        gridView.setAdapter(myAdapter);

        // Añadimos un listener a los elementos del listview
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridActivity.this, "Soy " + names.get(position), Toast.LENGTH_LONG).show();
            }
        });


    }
}