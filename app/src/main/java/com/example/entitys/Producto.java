package com.example.entitys;

import java.io.Serializable;

public class Producto implements Serializable {

    private static int ids = 0;
    private String nombre;
    private String descripcion;
    private String precio;
    private int img;
    private int id;


    public Producto() {
        this.id = ++ids;
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        Producto.ids = ids;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
