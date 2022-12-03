package domain;
public class VehiculoDeportivo extends Vehiculo {
private int cilindrada;

    public VehiculoDeportivo(String marca, String modelo, String matricula, int cilindrada) {
        super(marca, modelo, matricula);
        this.cilindrada=cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
        return (super.mostrarDatos()+ " Cilindrada= "+this.cilindrada);
    }

}
