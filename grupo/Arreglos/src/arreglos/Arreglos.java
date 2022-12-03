
package arreglos;


public class Arreglos {

    
    public static void main(String[] args) {
      String nombres[] = {"d", "c", "a"};
      
     /*
      ciclos for 
      for(int i=0; i<nombres.length; i++){
      }
        */
     /*ciclo for each
     for (tipo_de_Dato nombrevaraible: nombreDeArreglo ); dentro de la varaible se copiara el arreglo
      
     */
      for(String i:nombres){
          System.out.println("i = " + i);
      } 
      
    }
    
}
