// Ejercicio 2.15
// suma, producto, diferencia y cociente(división) de dos números
import java.util.Scanner;

public class Ejercicio_15
{
    public static void main (String[]args)
    {
        int a,b;

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingresa el primer numero: ");
        a = entrada.nextInt();
        System.out.print("ingresa el segundo numero: ");
        b = entrada.nextInt();

        System.out.println("La suma es: " + (a+b));
        System.out.println("El producto es: " + (a*b));
        System.out.println("La diferencia es: " + (a-b));
        System.out.println("El cociente es: " + (a/b));
    }
}