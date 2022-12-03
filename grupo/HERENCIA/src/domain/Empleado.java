
package domain;

/**
 *
 * @author jeffe
 */
public class Empleado extends Persona {
    //atributos
   private int idEmpleado;
   private double sueldo;
   private static int contadorEmpleado;  //privado solo la clase me dara acceso a ella
//metodos y contructotes   
   public Empleado(String nombre, double sueldo){
      // super(nombre);
      super(nombre);
       this.idEmpleado=++Empleado.contadorEmpleado;
       this.sueldo=sueldo;
   }

  public int getIdEmpleado(){
      return this.idEmpleado;
  }
 
public double getSueldo(){
    
       return this.sueldo;
    
}

public void setSueldo(double sueldo){
    this.sueldo=sueldo;
}

    @Override
    public String toString() {
        //return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
        return "Empleado[ " + "idEmpleado= "+ idEmpleado + ", sueldo="+ sueldo + "persona= " + super.toString() ;
    }

   //psvm soutv
   
  
}


