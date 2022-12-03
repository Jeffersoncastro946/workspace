package test;

import domain.Persona;
import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {

     public static void main(String[] args){
         Persona persona1=new Persona("Juan");
         System.out.println(persona1);
         Empleado empleado1=new Empleado("juan",5000);
         System.out.println(empleado1);
         
         /*Cliente(Date fechaRegistro, boolean vip, String nombre, 
            String direccion, char genero, int edad){*/
           System.out.println("creacion de pruebas de empleado");
           Cliente cl= new Cliente(new Date(), true, "juan", "j",'a', 5);
           System.out.println("cl = " + cl);
     }
    
}
