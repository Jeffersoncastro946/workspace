package com.gm.ventas;

public class Producto {

    //bloque de variables privadas
    private final int idProducto; // de esa manera solo se asigna una vez cada 
    //cada vez que cree un producto
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;

    }

    public int getProducto() { //obtenemos el id
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Producto("+this.idProducto+" "+this.nombre+ " vale "+ this.precio +" )";
    }

   /* @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }*/
    
}
