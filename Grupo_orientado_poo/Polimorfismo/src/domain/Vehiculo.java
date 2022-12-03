
package domain;
//string matricula, marca, modelo 
    //mostrar datps
//hijas turismo numero de puertas y mostrar datos
//hija deportiva int cilindrada mostrar datos
//hija furgoneta int carga mostrar datos
public class Vehiculo {
protected String marca;
protected String matricula;
protected String modelo;

public Vehiculo(String marca, String modelo, String matricula){
    this.marca=marca;
    this.matricula=matricula;
    this.modelo=modelo;
}
   public String mostrarDatos(){
       return "Vehiculo[ "+"Marca: "+this.marca+" Matricula: "+ this.matricula+" Modelo: "+this.modelo;
   }
}
