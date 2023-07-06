package com.example.nuevaaplicacionrecycle.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nuevaaplicacionrecycle.R;
import com.example.nuevaaplicacionrecycle.modelos.Revista;

public class AdapterRevista extends ArrayAdapter<Revista> {
    public AdapterRevista(@NonNull Context context, Revista[]datos) {
        super(context, R.layout.lyitemrevistas);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitemrevistas, null);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView txtTitulo = (TextView)item.findViewById(R.id.txtTitulo);
        txtTitulo.setText(getItem(position).getNombre());
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView txtAbrebiacion = (TextView)item.findViewById(R.id.txtAbrebiacion);
        txtAbrebiacion.setText(getItem(position).getAbreviacion());
        return(item);
    }

}
