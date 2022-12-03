// Ejercicio 2.30
// Separación de lo dígito en un entero
// ingresar un número de 5 dígitos y separar
// sus cifras por tres espacios.
import java.util.Scanner;

public class Ejercicio_30
{
    public static void main(String[]args)
    {
        int a,b,c,d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un numero de 5 cifras: ");
        a = entrada.nextInt();
        // vamos a condicionar para que el cálculo solo se
        // realice con números de 5 cifras.
        if (a>9999)
            if (a<100000)
            
            /* el printf se separó para poder ver mejor el
            código y saber cómo se calcula cada cifra.
            Por precedencia los cálculos se realizan de 
            izquierda a derecha para estos operadores, 
            le puse los () solo por apariencia*/

            System.out.printf("%d   %d   %d   %d   %d",
            
             a/10000,
      
            (a%10000)/1000,
       
            (a%10000%1000)/100,

            (a%10000%1000%100)/10,

            (a%10000%1000%100%10));

        if (a>99999)
            System.out.print("Este numero tiene mas de 5 cifra!!!");
        if (a<10000)
            System.out.print("Este numero tiene menos de 5 cifras!!");
    }
}