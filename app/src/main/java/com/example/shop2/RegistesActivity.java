package com.example.shop2;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.entitys.Persona;

import java.util.ArrayList;
import java.util.List;

public class RegistesActivity extends AppCompatActivity {

    public static List<Persona> personas = new ArrayList<>();
    private ImageView foto;
    private EditText nombre;
    private EditText apellido;
    private EditText user;
    private EditText contrsaena;
    private EditText contrsaena2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        foto = findViewById(R.id.camara);
        nombre = findViewById(R.id.getNombre);
        apellido = findViewById(R.id.getApellido);
        user = findViewById(R.id.getusername);
        contrsaena = findViewById(R.id.getPasswor1);
        contrsaena2 = findViewById(R.id.getPasswor2);


        foto.setOnClickListener(v -> {
            openCamara();
        });
    }


    private Boolean verificarDatos(View v) {
        String mensage = "";
        String nombre = this.nombre.getText().toString();
        String apellido = this.apellido.getText().toString();
        String user = this.user.getText().toString();
        String contrasena = this.contrsaena.getText().toString();
        String contrasena2 = this.contrsaena2.getText().toString();

        if (nombre.isEmpty() || apellido.isEmpty() || user.isEmpty() || contrasena.isEmpty() || contrasena2.isEmpty()) {
            mensage = "Verifcia: " +
                    (nombre.isEmpty() ? "Nombre, " : "") +
                    (apellido.isEmpty() ? "Apellido, " : "") +
                    (user.isEmpty() ? "usuario, " : "") +
                    (contrasena.isEmpty() ? "contrasena, " : "") +
                    (contrasena2.isEmpty() ? "Verificacion" : "");
            Toast.makeText(this, mensage, Toast.LENGTH_SHORT).show();
            return false;


        }
        if (!contrasena.equals(contrasena2)) {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!nombre.matches("[a-zA-Z]+") || !apellido.matches("[a-zA-Z]+")) {

            mensage = !nombre.matches("[a-zA-Z]") ? "Nombre, " + (!apellido.matches("[a-zA-Z]") ? "Apellido" : "") + " solo permiten letras" : "";
            Toast.makeText(this, mensage, Toast.LENGTH_SHORT).show();
            return false;
        }

        for (Persona persona : personas) {
            if (persona.getUser().equalsIgnoreCase(user)) {
                Toast.makeText(this, "User ya registrado", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        return true;


    }

    public void saveUser(View v) {
        if (verificarDatos(v)) {
            String mensage = "";
            String nombre = this.nombre.getText().toString();
            String apellido = this.apellido.getText().toString();
            String user = this.user.getText().toString();
            String contrasena = this.contrsaena.getText().toString();

            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setUser(user);
            persona.setPassword(contrasena);

            personas.add(persona);

            System.out.println(personas);
            Toast.makeText(this, "Registrado Correctamente", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }


    private void openCamara() {
        Intent camara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camara, 1);
    }

}
