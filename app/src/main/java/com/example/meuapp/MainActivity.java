package com.example.meuapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.planeta);

        lv = findViewById(R.id.listView);

        // recuperar dados datasource
        PlanetaController pcontroller = new PlanetaController();

        AdapterPlaneta adaptador = new AdapterPlaneta(getApplicationContext(),R.layout.item_lista,pcontroller.listaPlanetas());

        lv.setAdapter(adaptador);
    }
}