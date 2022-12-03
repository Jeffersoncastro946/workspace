package com.gm.ventas;


public class Orden {

private int idOrden;
private Producto[] productos; //declaramos como si fuese una sola variable tipo array
private static int contadorOrdenes;
private int contadorProductos;
private static final int  MAX_PRODUCTOS=10;    

public Orden(){
    this.idOrden=++Orden.contadorOrdenes;
    this.productos=new Producto[MAX_PRODUCTOS]; //le decimo de cuanto sea el array   
}
public void agregarProduto(Producto producto){
    
    //agregar al arreglo 
    if(this.contadorProductos<Orden.MAX_PRODUCTOS){
      this.productos[this.contadorProductos]=producto;
      this.contadorProductos++;
       // return 0;
    }
    else{
           System.out.println("ya no se puede agregar");
       
    }
}

//Calcular total
public double calcularTotal(){
    double total=0;
    for(int i=0; i<this.contadorProductos; i++){
        total+=productos[i].getPrecio(); 
    }
    return total;
}
public void mostrarOrden(){
    double total=this.calcularTotal();
    System.out.println("Id Orden"+this.idOrden) ;
    System.out.println("$"+ total);
    for (int i = 0; i < this.contadorProductos; i++) {
        System.out.println(this.productos[i]);
    }
} 
}
