package com.mundopc;

public class Teclado extends DispositivoEntrada{
private final int idTeclado;
private static int contadorTeclados;

public Teclado(String marca, String tipo){
    super( marca,tipo);
    
    this.idTeclado=++Teclado.contadorTeclados;
}
@Override
public String toString(){
    return "Teclado "+ " IdTeclado "+ this.idTeclado + super.toString();
}
}
