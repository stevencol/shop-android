package com.example.shop2;

import com.example.entitys.Producto;

import java.util.Arrays;
import java.util.List;

public class Lista {


    public static List<Producto> ListaProductos() {
        Producto producto1 = new Producto();
        producto1.setNombre("Coca-Cola");
        producto1.setDescripcion("Bebida gaseosa con alto contenido de azúcar: el principal causante de diabetes en el mundo. A pesar de su nueva imagen, sigue siendo igual de perjudicial y busca atraer nuevos clientes.");
        producto1.setPrecio("3400");
        producto1.setImg(R.drawable.img_1);

        Producto producto2 = new Producto();
        producto2.setNombre("Quatro");
        producto2.setDescripcion("Bebida gaseosa con alto contenido de azúcar: el principal causante de diabetes en el mundo. A pesar de su nueva imagen, sigue siendo igual de perjudicial y busca atraer nuevos clientes.");
        producto2.setPrecio("3400");
        producto2.setImg(R.drawable.img_2);

        Producto producto3 = new Producto();
        producto3.setNombre("Corona");
        producto3.setDescripcion("La cerveza es perjudicial para la salud debido a su contenido de alcohol, lo que puede conducir a problemas de salud a largo plazo, como enfermedades del hígado, cáncer y trastornos psiquiátricos.");
        producto3.setPrecio("4600");
        producto3.setImg(R.drawable.img_3);


        Producto producto4 = new Producto();
        producto4.setNombre("Arroz");
        producto4.setDescripcion("Su consumo frecuente puede provocar un aumento en los niveles de azúcar en sangre, lo que aumenta el riesgo de desarrollar diabetes tipo 2 y otros problemas de salud crónicos");
        producto4.setPrecio("2600");
        producto4.setImg(R.drawable.img_4);

        Producto producto5 = new Producto();
        producto5.setNombre("Pasta");
        producto5.setDescripcion("La pasta tiene un bajo contenido de nutrientes, lo que puede llevar a problemas de salud como obesidad, diabetes y enfermedades del corazón, ya que puede causar un aumento de azúcar en la sangre.");
        producto5.setPrecio("4600");
        producto5.setImg(R.drawable.img_5);

        Producto producto6 = new Producto();
        producto6.setNombre("Frijoles");
        producto6.setDescripcion("Los frijoles pueden causar problemas digestivos y malestar estomacal en algunas personas debido a su alto contenido de fibra y oligosacáridos, que pueden ser difíciles de digerir para algunas personas.");
        producto6.setPrecio("9400");
        producto6.setImg(R.drawable.img_6);

        Producto producto7 = new Producto();
        producto7.setNombre("Sopa Instantane");
        producto7.setDescripcion("La sopa instantánea es alta en sodio, grasas y aditivos poco saludables.");
        producto7.setPrecio("2500");
        producto7.setImg(R.drawable.img_7);

        Producto producto8 = new Producto();
        producto8.setNombre("Cloro");
        producto8.setDescripcion("El cloro es un producto químico tóxico que puede causar irritación y enfermedades respiratorias");
        producto8.setPrecio("7800");
        producto8.setImg(R.drawable.img_8);

        Producto producto9 = new Producto();
        producto9.setNombre("Detergente liquido");
        producto9.setDescripcion("puede contener productos químicos nocivos que pueden ser perjudiciales para la salud.");
        producto9.setPrecio("6300");
        producto9.setImg(R.drawable.img_9);

        Producto producto10 = new Producto();
        producto10.setNombre("Salsa de tomate");
        producto10.setDescripcion("La salsa de tomate puede contener altos niveles de sodio y azúcar, así como aditivos y conservantes artificiales.");
        producto10.setPrecio("7500");
        producto10.setImg(R.drawable.img_10);

        Producto producto11 = new Producto();
        producto11.setNombre("Salsa BBQ");
        producto11.setDescripcion("La salsa BBQ puede contener altos niveles de azúcar y sodio, y aditivos químicos.");
        producto11.setPrecio("7000");
        producto11.setImg(R.drawable.img_11);
        Producto producto12 = new Producto();
        producto12.setNombre("Condones");
        producto12.setDescripcion("Algunas personas pueden tener reacciones alérgicas a los materiales utilizados en los condones, lo que puede provocar irritaciones o inflamaciones");
        producto12.setPrecio("10600");
        producto12.setImg(R.drawable.img_12);

        Producto producto13 = new Producto();
        producto13.setNombre("Desodotante");
        producto13.setDescripcion(" El uso excesivo también puede irritar la piel y causar erupciones cutáneas.");
        producto13.setPrecio("5600");
        Producto producto14 = new Producto();
        producto13.setImg(R.drawable.img_13);

        producto14.setNombre("Chocolate");
        producto14.setDescripcion("El chocolate es rico en calorías, grasas saturadas y azúcares, lo que aumenta el riesgo de obesidad y diabetes.");
        producto14.setPrecio("5300");
        producto14.setImg(R.drawable.img_14);

        Producto producto15 = new Producto();
        producto15.setNombre("malvaviscos ");
        producto15.setDescripcion(" contienen grandes cantidades de azúcar y calorías, lo que puede aumentar el riesgo de obesidad, diabetes y caries dentales");
        producto15.setPrecio("7800");
        producto15.setImg(R.drawable.img_15);

        return Arrays.asList(producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto5, producto10, producto11, producto12, producto13, producto14, producto15);
    }
}
