package Ejercicio4_16;

public class Ejercicio4_16 {

    public static void main(String[] args) {
        int x = 1;
         int total = 0;
 
    while (x <= 10) {
        int y = x * x;
        System.out.println(y);
        total += y;
        ++x;
     }
    System.out.printf("El total es %d%n", total);
    }
}
