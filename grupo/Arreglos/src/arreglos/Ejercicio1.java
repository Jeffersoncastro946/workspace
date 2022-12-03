/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        for (int i=0;i<5;i++ ) {
            System.out.println("ingresa el valor del campo = " +(i+1));
            numeros[i]=entrada.nextInt();
        }
        
          for(int j:numeros){
            System.out.println( j);
}
          
    }

  
    
}
