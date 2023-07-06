package com.example.nuevaaplicacionrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.nuevaaplicacionrecycle.adapters.AdapterUsuarios;
import com.example.nuevaaplicacionrecycle.httpRequest.Asynchtask;
import com.example.nuevaaplicacionrecycle.httpRequest.WebService;
import com.example.nuevaaplicacionrecycle.modelos.Revista;
import com.example.nuevaaplicacionrecycle.modelos.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity3usuario extends AppCompatActivity {


    ListView lstOpciones2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3usuario);

        lstOpciones2 = (ListView)findViewById(R.id.lstDataUsu2);
        View header=getLayoutInflater().inflate(R.layout.activity_lyheader,null);
        lstOpciones2.addHeaderView(header);
        cargardata();


    }
    private void cargardata()
    {
        View header = getLayoutInflater().inflate(R.layout.lyitemusuario, null);
        lstOpciones2.addHeaderView(header);
        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("https://revistas.uteq.edu.ec/ws/journals.php",
                datos, MainActivity3usuario.this, (Asynchtask) MainActivity3usuario.this);
        ws.execute("GET");
    }
    @Override
    public void processFinish(String result2) throws JSONException {
        JSONArray JSONlista = new JSONArray(result2);
        ArrayList<Usuario> lstUsuarios = Revista.JsonObjectsBuild(JSONlista);
        AdapterUsuarios adapatorUsuario = new AdapterUsuarios(this, lstUsuarios);
        lstOpciones2.setAdapter(adapatorUsuario);

}