
package arreglos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int []array=new int[5];
        
        for(int i=0; i<5;i++){
            System.out.println("Ingrese el digito "+ (i+1)+ " ");
            array[i]=entrada.nextInt();
        }
        System.out.println("salidad de datos");
        
         for(int i=(array.length-1); i>=0; i--){
             System.out.println(array[i]);
            
        }
    }
    
}
