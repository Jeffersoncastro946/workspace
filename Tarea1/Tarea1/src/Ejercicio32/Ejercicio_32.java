package Ejercicio32;

/**
 * Programa que recibe 5 numeros y determina cuantos de ellos fueron     *
* positivos, negativos o cero.       
 */
import java.util.Scanner;
public class Ejercicio_32 {

public static void main(String arg[])
{   
    //definicion de variables
    int numeros;
    int ContadorPositivos=0;
    int ContadorNegativos=0;
    int ContadorCeros=0;
    Scanner entrada=new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("ingrese el digito "+ (i+1));
        numeros=entrada.nextInt();
        
        if (numeros>0) {
            ContadorPositivos++;
        }
        else if(numeros<0){
            ContadorNegativos++;
        }
        else{
            ContadorCeros++;
        }

        
    }
    //salidad de datos
    System.out.println("La cantidad de positivos son: "+ ContadorPositivos);
    System.out.println("La cantidad de negarivos son: "+ ContadorNegativos);
    System.out.println("La cantidad de ceros son : "+ ContadorCeros);
    entrada.close();
}  
}