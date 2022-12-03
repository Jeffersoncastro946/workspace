
package com.mundopc;

public class Orden {
private final int idOrden;//final
private Computadora[] computadoras;
private static int contadorOrdenes;
private static final int MAX_COMPUTADORAS=10;
private int contadorComputadoras; //saber cuantos se ga agregado al array

public Orden(){
    this.idOrden=++Orden.contadorOrdenes;
    this.computadoras=new Computadora[Orden.MAX_COMPUTADORAS];
     
}

public void agregarComputadora(Computadora computadora){
    //validacion por si esta lleno
    if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
       this.computadoras[this.contadorComputadoras++]=computadora;
    }
    else {
        System.out.println("sin espacacio");
    }
    
}

public void mostrarOrden(){
    System.out.println("Orden "+ "idOrden"+this.idOrden);
    for (int i = 0; i < contadorComputadoras; i++) {
        System.out.println(computadoras[i]);
        
    }
}
    
}
