//package Ejercicio4_15;
public class Ejercicio4_15 {
    
    public static void main(String[] args) throws Exception {
        int edad=70;
        int x = 1; 
        int total=0;

     if (edad >= 65){
        System.out.println(edad + " es mayor o igual que 65");
    }
    else{
        System.out.println(edad+" es menor  que 65");
    }

    while (x <= 10){
        total += x;
        x++;
    }
    System.out.println("cierre de ciclo");
}



}
