import java.util.Scanner; 
public class Ejercicio_28

{ // Abre clase Ejercicio2_28
public static void main(String arg[])
{  // Abre el metodo main
Scanner entrada = new Scanner(System.in);
int radio;
System.out.println("Por favor introduzca un radio:");
radio = entrada.nextInt();
System.out.printf("\nEl diametro del circulo es: %d", 2*radio);
System.out.printf("\nEl perimetro del circulo es: %f", 2*Math.PI*radio);
System.out.printf("\nEl area del circulo es: %f\n", Math.PI*radio*radio);
}  // Cierra el metodo main
} 