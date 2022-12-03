package com.mundopc;


public class Monitor {
//atributos
private int idMonitor;
private String marca;
private double tamano;
private static int contadorMarca;

//metodos
private Monitor(){
    this.idMonitor=++Monitor.contadorMarca;
}

public Monitor(String marca, double tamano){
    this();
    this.marca=marca;
    this.tamano=tamano;
}

public String getMarca(){
    return this.marca;
}
public double getTamano(){
    return this.tamano;
}
public void setMarca(String marca){
    this.marca=marca;
    
}
public void setTamano(double tamano){
    this.tamano=tamano;
}
@Override
public String toString(){
    return "Monitor ( " + "Id "+ this.idMonitor + " Marca "+ this.marca+ " Tamaño "+ this.tamano + " )";
}
}

