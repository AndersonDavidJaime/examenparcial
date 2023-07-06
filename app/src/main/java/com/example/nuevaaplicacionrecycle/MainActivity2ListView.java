package com.example.nuevaaplicacionrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nuevaaplicacionrecycle.interfaces.iListAlumnos;

public class MainActivity2ListView extends AppCompatActivity {

    ListView lstList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_list_view);
        lstList=findViewById(R.id.lstlista);
        llenarData();
    }

    private void llenarData()
    {
        final String[] datos = new
                String[]{"alumno1","alumno 2","alumno 3","alumno4","alumno 5"};

        //adapter
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        datos);
        //vista
        lstList.setAdapter(adaptador2);


        lstList.setOnItemClickListener(new iListAlumnos(this.getApplicationContext()));
    }





}