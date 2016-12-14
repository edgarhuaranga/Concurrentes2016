package com.edhuar.concurrentes2016;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 14/12/16.
 */

public class ListaAdapter extends ArrayAdapter<String> implements AdapterView.OnItemClickListener{
    private final Context context;
    private final ArrayList<String> valores;


    public ListaAdapter(Context context, ArrayList<String> arrayList) {
        super(context, -1, arrayList);
        this.context = context;
        this.valores = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View fila = inflater.inflate(R.layout.fila_opciones, parent, false);

        TextView textViewOpcion = (TextView) fila.findViewById(R.id.texto_opcion);
        textViewOpcion.setText(valores.get(position));

        return fila;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
