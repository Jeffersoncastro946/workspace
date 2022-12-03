
package com.mundopc;

/**
 *
 * @author jeffe
 */
public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    public Raton(String marca, String tipoDeEntrada){
        super(marca,tipoDeEntrada);
        this.idRaton=++Raton.contadorRatones;
    }
    
    @Override
    public String toString(){
        return "Raton "+"IdRaton "+ this.idRaton + super.toString()+"}";
    } 
    
}
