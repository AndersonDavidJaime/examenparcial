package com.example.nuevaaplicacionrecycle.modelos;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;

public class Revista implements Serializable {

    String Nombre;
    String Portada;
    String Abreviacion;

    public static ArrayList<Usuario> JsonObjectsBuild(JSONArray jsoNlista) {
        return null;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPortada() {
        return Portada;
    }

    public void setPortada(String portada) {
        Portada = portada;
    }

    public String getAbreviacion() {
        return Abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        Abreviacion = abreviacion;
    }
}
