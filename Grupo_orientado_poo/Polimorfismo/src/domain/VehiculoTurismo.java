package domain;

public class VehiculoTurismo extends Vehiculo {
private int numeroPuertas;

public VehiculoTurismo(String marca, String modelo, String matricula, int numeroPuertas){
    super(marca, modelo,matricula);
    this.numeroPuertas=numeroPuertas;
}

@Override
public String mostrarDatos(){
     //  return "Vehiculo[ "+"Marca: "+this.marca+" Matricula: "+ this.matricula+" Modelo: "+this.modelo+" Numeros de puertas"+this.numeroPuertas;
       return( super.mostrarDatos() + " Numeros de puertas"+this.numeroPuertas);
       
}


}
