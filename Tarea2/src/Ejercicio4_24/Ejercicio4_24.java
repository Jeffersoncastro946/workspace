
import java.util.Scanner; // esta clase utiliza la clase Scanner

public class Ejercicio4_24
{
public static void main( String[] args ){
    // crea objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner( System.in );

    // inicialización de las variables en declaraciones
    int aprobados = 0; // número de aprobados
    int reprobados = 0; // número de reprobados
    int contadorEstudiantes = 1; // contador de estudiantes
    int resultado; // un resultado del examen (obtiene el valor del usuario)

    // procesa 10 estudiantes, usando ciclo controlado por contador
    while ( contadorEstudiantes <= 10 ){
        // pide al usuario la entrada y obtiene el valor
        System.out.print( "Escriba el resultado (1 = aprobado, 2 = reprobado): " );
        resultado = entrada.nextInt();
            while((resultado!=1)&&(resultado!=2)){
                System.out.println("Opción errónea");System.out.print( "Escriba el resultado (1 = aprobado, 2 = reprobado): " );
                resultado = entrada.nextInt();
            }
        // if...else anidado en la instrucción while
        if ( resultado == 1 ) // si resultado 1,
        aprobados = aprobados + 1; // incrementa aprobados;
        else // de lo contrario, resultado no es 1, por lo que
        reprobados = reprobados + 1; // incrementa reprobados

        // incrementa contadorEstudiantes, para que el ciclo termine en un momento dado
        contadorEstudiantes = contadorEstudiantes + 1;
    } // fin de while

    // fase de terminación; prepara y muestra los resultados
    System.out.printf( "Aprobados: %d\nReprobados: %d\n", aprobados, reprobados );

    // determina si más de 8 estudiantes aprobaron
    if ( aprobados > 8 )
    System.out.println( "Bono para el instructor!" );
    } 
  } 