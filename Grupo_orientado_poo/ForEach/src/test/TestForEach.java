
package test;

import domain.Persona;

/*es un for mejorado simplica el recorrer los arreglos y colecciones

for(variable que almecena el arreglo : arreglo que quiero recorrer  )

lo que hace es que crea una copia para que se recorra en automatico*/
public class TestForEach {
    public static void main(String[] args) {
        int edades[]={5,4,6,7};
        for (int edad : edades) {
            System.out.println("edades"+ edad);
        }
        
        Persona persona1[]={new Persona("juan"), new Persona("pabblo"), new Persona("antonio")};
        for (Persona persona : persona1) {
            System.out.println("persona = " + persona);
        }
    } 

    
    
    
}
