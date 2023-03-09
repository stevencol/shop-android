package com.example.shop2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.entitys.Producto;

import java.util.List;

public class Carrito extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        productos = (List<Producto>) getIntent().getSerializableExtra("carrito");
        getLista();


    }

    private void getLista() {
        LinearLayout layoutPrincipal = findViewById(R.id.list);
        int total = 0;
        for (Producto p : productos) {
            System.out.println(p.getNombre());
            ImageView imgagen = new ImageView(this);
            imgagen.setImageResource(p.getImg());
            imgagen.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
            imgagen.setScaleType(ImageView.ScaleType.CENTER_INSIDE); // Para centrar la imagen dentro del ImageView
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) imgagen.getLayoutParams();
            params.gravity = Gravity.CENTER;
            imgagen.setLayoutParams(params);


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

            layoutPrincipal.addView(titlulo);
            layoutPrincipal.addView(descripcion);
            layoutPrincipal.addView(imgagen);
            layoutPrincipal.addView(precioYCarrito);

            total += Integer.parseInt(p.getPrecio());


        }
        TextView precio = new TextView(this);
        precio.setText("Total: " + total);
        precio.setGravity(Gravity.CENTER);
        precio.setTextColor(ContextCompat.getColor(this, R.color.black));
        precio.setGravity(Gravity.CENTER);
        precio.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);


        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(16, 16, 16, 16);

        precio.setLayoutParams(params);

        layoutPrincipal.addView(precio);

    }

}
