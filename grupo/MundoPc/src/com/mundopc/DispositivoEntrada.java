
package com.mundopc;

public class DispositivoEntrada {
    //atributos
    private String tipoEntrada;
    private String marca;
    //contructores
    public DispositivoEntrada(String marca, String tipoEntrada ){
    this.marca=marca;
    this.tipoEntrada=tipoEntrada;
    }
    //metodos
    public String getMarca(){
        return this.marca ;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getTipoEntreada(){
        return this.tipoEntrada;
    }
    public void setTipoEntrada(String tipo){
        this.tipoEntrada=tipo;
    }
    
    //@Override
    @Override
    public String toString(){
        
        return "DispositivoEntrada { "+" Marca "+ this.marca + " " + "Tipo de entrada "+ this.tipoEntrada+" }"; 
    }
}
