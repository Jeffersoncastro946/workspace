 import java.util.Scanner;

  public class Ejercicio_17
 {         
  public static void main(String args[])
  {         
  Scanner entra = new Scanner(System.in);
  int numero1;
  int numero2;
  int numero3;
  int suma;
  int promedio;
  int producto;

  System.out.println("Por favor introduzca tres enteros.");
  System.out.println("\nIntroduzca el primer entero:");
  numero1 = entra.nextInt();

  System.out.println("Introduzca el segundo entero:");
  numero2 = entra.nextInt();

  System.out.println("\nIntroduzca el tercer entero:");
  numero3 = entra.nextInt();

  suma = numero1 + numero2 + numero3;
  promedio = suma/3;
  producto = numero1*numero2*numero3;

  //calculos

int menor = numero1;
int mayor=numero1 ;
//calcular el menor

if (menor>numero2) {
    menor=numero2;
}
else if(menor>numero3){
    menor=numero3;
}

//calcular el mayor
 if(numero2>mayor){
    mayor=numero2;
 }
 else if(numero3>mayor){
    mayor=numero3;
 }
//salidad de datos

 System.out.printf("\nEl producto de los numeros es: %d\n", producto);
 System.out.printf("\nLa suma de los numeros es: %d\n", suma);
 System.out.printf("\nEl promedio de los numeros es: %d\n", promedio);
 System.out.printf("\nEl mayor de los numeros es: %d\n", mayor);
 System.out.printf("\nEl menor de los numeros es: %d\n", menor);



  }         
}