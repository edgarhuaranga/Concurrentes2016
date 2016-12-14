package com.edhuar.concurrentes2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaOpciones extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_opciones);

        getSupportActionBar().setTitle("Opciones");
        getSupportActionBar().setSubtitle("Cliente");

        final ListView listView = (ListView) findViewById(R.id.lista_opciones);
        ArrayList<String> opciones = new ArrayList<>();
        opciones.add("Lista recibos");
        opciones.add("Pagar recibo");
        opciones.add("Salir");

        ListaAdapter adapter = new ListaAdapter(this, opciones);
        listView.setAdapter(adapter);

    }
}
