package com.example.shop2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.entitys.Persona;

public class Perfil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);
        Persona persona = (Persona) getIntent().getSerializableExtra("persona");
        ((TextView) findViewById(R.id.nombre)).setText(persona.getNombre());
        ((TextView) findViewById(R.id.apellido)).setText(persona.getApellido());
        ((TextView) findViewById(R.id.usuario)).setText(persona.getUser());


    }

}
