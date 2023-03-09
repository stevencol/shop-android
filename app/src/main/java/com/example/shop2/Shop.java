package com.example.shop2;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.entitys.Persona;
import com.example.entitys.Producto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

    private static final List<Producto> productos = Lista.ListaProductos();
    private final List<Producto> carrito = new ArrayList<>();
    private ListView listaProductos;
    private final int id = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        getLista();

        (findViewById(R.id.getPorfile)).setOnClickListener(v -> {
            Persona persona = (Persona) getIntent().getSerializableExtra("persona");
            Intent intent = new Intent(this, Perfil.class);
            intent.putExtra("persona", persona);
            startActivity(intent);


        });


        (findViewById(R.id.adcart)).setOnClickListener(v -> {
            Intent intent = new Intent(this, Carrito.class);

            intent.putExtra("carrito", (Serializable) carrito);
            startActivity(intent);


        });


    }

    private void getLista() {
        LinearLayout layoutPrincipal = findViewById(R.id.list);


        for (Producto p : productos) {
            System.out.println(p.getNombre());
            ImageView imgagen = new ImageView(this);
            imgagen.setImageResource(p.getImg());
            imgagen.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
            imgagen.setScaleType(ImageView.ScaleType.CENTER_INSIDE); // Para centrar la imagen dentro del ImageView
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) imgagen.getLayoutParams();
            params.gravity = Gravity.CENTER;
            imgagen.setLayoutParams(params);

            ImageView carrito = new ImageView(this);
            carrito.setImageResource(R.drawable.img);
            carrito.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
            carrito.setScaleType(ImageView.ScaleType.CENTER_INSIDE); // Para centrar la imagen dentro del ImageView
            carrito.setLayoutParams(new LinearLayout.LayoutParams(80, 80));


            carrito.setOnClickListener(v -> {
                if (this.carrito.size() < 5) {
                    addPro(p);
                } else {
                    Toast.makeText(this, "No se pueden agregar mas de 5 elementos", Toast.LENGTH_SHORT).show();
                }
            });


            TextView titlulo = new TextView(this);
            titlulo.setGravity(Gravity.CENTER);
            titlulo.setText(p.getNombre());
            titlulo.setTextSize(25); //
            titlulo.setTextColor(ContextCompat.getColor(this, R.color.black));
            titlulo.setTypeface(Typeface.DEFAULT_BOLD);


            TextView descripcion = new TextView(this);
            descripcion.setText(p.getDescripcion());
            descripcion.setGravity(Gravity.CENTER_HORIZONTAL);
            descripcion.setTextColor(ContextCompat.getColor(this, R.color.black));


            TextView precio = new TextView(this);
            precio.setText(p.getPrecio());
            precio.setGravity(Gravity.CENTER_HORIZONTAL);
            precio.setTextColor(ContextCompat.getColor(this, R.color.black));
            precio.setGravity(Gravity.END);
            precio.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 10);


            LinearLayout precioYCarrito = new LinearLayout(this);
            precioYCarrito.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            precioYCarrito.setOrientation(LinearLayout.HORIZONTAL);
            precioYCarrito.setGravity(Gravity.RIGHT);


            precioYCarrito.addView(precio);
            precioYCarrito.addView(carrito);

            layoutPrincipal.addView(titlulo);
            layoutPrincipal.addView(descripcion);
            layoutPrincipal.addView(imgagen);
            layoutPrincipal.addView(precioYCarrito);


        }
    }

    private void addPro(Producto producto) {

        carrito.add(producto);

    }


}


