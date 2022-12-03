package polimorfismo;
//polimorfismo las diferentes formas que un metodo responde a un llamado
//se aplica junto la herencia y la sobriescritura
import domain.*;


public class Polimorfismo {


    public static void main(String[] args) {
      Vehiculo []arreglo = new Vehiculo[4];
      
    arreglo[0]=new Vehiculo("Corolla", "l25", "pb55");
    arreglo[1]=new VehiculoTurismo("ford", "l26", "pb56",4);   //upcasting
    arreglo[2]=new VehiculoDeportivo("Nissan", "l27", "pb57",5);
     arreglo[3]=new VehiculoCarga("ford", "l28", "pb56",400);
     
        for (Vehiculo vehiculo : arreglo) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
        
        //upcasting subir un grado de la jerarquia  ->cuando el padre almacena a la clase hija 
    
        //downcast bajar un grado de la jerarquia  ->cuando la clase hija almacena al padre 
        //pero primero tuvo que haberce realizado un upcasting
        Vehiculo miCarro=new VehiculoTurismo("nissan", "asc4", "asc4", 4);
        VehiculoTurismo micarro1=(VehiculoTurismo) miCarro;
        
        System.out.println(micarro1.mostrarDatos());
        
        
    }
    
}
