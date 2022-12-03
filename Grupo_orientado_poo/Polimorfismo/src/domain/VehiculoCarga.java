package domain;
public class VehiculoCarga extends Vehiculo {
    private int carga;

    public VehiculoCarga(String marca, String modelo, String matricula, int carga) {
        super(marca, modelo, matricula);
        this.carga=carga;
    }
    @Override
     public String mostrarDatos(){
        return (super.mostrarDatos()+ " Carga= "+this.carga);
    }
}
