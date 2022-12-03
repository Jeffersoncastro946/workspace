
import java.util.Scanner;
public class Ejercicio_25
{       // Abre Deitel 2_25
public static void main(String args[])
{ // Abre metodo main

int numero;
Scanner entrada = new Scanner(System.in);
  
System.out.println("Introduzca un numero y sabra si es par o impar.");
numero = entrada.nextInt();
  
if( 0 == numero % 2 )
System.out.println("El numero es par.");
  
if ( 0 != numero % 2)
System.out.println("El numero es impar.");
 

}      
}