
public class Ejercicio_33
{
    public static void main(String[]args)
    {

        int a,b,c;
        Scanner entero = new Scanner(System.in);

        System.out.print("Ingresa tu peso en Kilogramos: ");
        a = entero.nextInt();
        /* cambiaremos los m por cm, por que si ingresamos 1.8
        de altura saldra un error, ya que solo se acepta enteros ya q¡que java toma 
        decimales con la coma*/
        System.out.print("Ingresa tu altura en metros: ");
        b = entero.nextInt();

        /* se usará el printf para mostrar los resultados en decimales
        gracias al especificador de formato %f.

        Se multiplica por 10000 al dividendo debido a que se está
        usando centímetros en el divisor y en la fórmula original
        se usa metros. Este cambio evita que el usuario ingrese en 
        decigramos en lugar de kilogramos*/

        System.out.printf("%s %f %n", "BMI:", (a*10000.0)/(b*b));
        /* se una el decimal cero en 10000 para que el especificador %f
        reconozca la operación con valores decimales*/

        System.out.println("VALORES DE BMI");
        System.out.println("Bajo peso:\tmenos e 18.5");
        System.out.println("Normal:\t\tentre 18.5 y 24.9");
        System.out.println("Sobrepeso:\tentre 25 y 29.9");
        System.out.println("Obeso:\t\t30 a mas");


    }
}