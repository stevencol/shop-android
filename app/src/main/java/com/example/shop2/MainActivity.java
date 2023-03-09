package com.example.shop2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.entitys.Persona;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private Persona persona;
    private EditText password;
    private final List<Persona> personas = RegistesActivity.personas;


    @Override
    protected void onResume() {
        super.onResume();
        userName = findViewById(R.id.getUser);
        password = findViewById(R.id.gePassword);
        userName.setText("");
        password.setText("");

        if (persona != null) {
            persona = null;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.getUser);
        password = findViewById(R.id.gePassword);

    }

    private Boolean verificar(View v) {

        if (userName.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            String mensaje = userName.getText().toString().isEmpty() &&
                    password.getText().toString().isEmpty() ? "No has ingreasodo Ningun Dato" :
                    userName.getText().toString().isEmpty() ? "No ingresaste el nombre de usuario" : "No ingresaste la contraseña";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void login(View v) {

        if (verificar(v)) {
            String userName = this.userName.getText().toString().trim();
            String password = this.password.getText().toString().trim();

            for (Persona persona : personas) {

                if (persona.getUser().equals(userName) && persona.getPassword().equals(password)) {
                    this.persona = persona;
                    System.out.println("siiii");
                    break;
                }


            }

            if (this.persona != null) {
                Intent intent = new Intent(this, Shop.class);
                intent.putExtra("persona", this.persona);
                this.persona = null;
                startActivity(intent);
            } else {
                Toast.makeText(this, "user no existe", Toast.LENGTH_SHORT).show();
            }


        }
    }


    public void register(View v) {
        Intent intent = new Intent(this, RegistesActivity.class);
        startActivity(intent);
    }
}