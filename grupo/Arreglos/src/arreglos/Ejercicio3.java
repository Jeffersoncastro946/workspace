package arreglos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] array = new float[5];
        int mediaPositivos, mediaNegativos;
        int contadorCeros = 0, centinelaPositivos = 0, centinelaNegativos = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("ingresa el numero "+i);
            array[i] = entrada.nextInt();
            if (array[i] > 0) {
                centinelaPositivos += array[i];
            } else if (array[i] < 0) {
                centinelaNegativos += array[i];
            } else {
                contadorCeros++;
            }
        }
        mediaPositivos = (centinelaPositivos / array.length);
        System.out.println("la media positiva es: " + mediaPositivos);
        mediaNegativos = (centinelaNegativos/ array.length);
        System.out.println("la media positiva es: " + mediaNegativos);
        System.out.println("ceros  = " + contadorCeros );
    }
}
