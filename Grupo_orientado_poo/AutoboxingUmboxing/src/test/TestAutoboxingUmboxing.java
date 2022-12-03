
package test;
/*Autoboxing Ya que estamos envolviendo el tipo primitivo en un tipo object y
el proceso inverso se le conoce como unboxing. envolver con un primitivo un object*/
public class TestAutoboxingUmboxing {
    public static void main(String[] args) {
    Integer numero=10;// Autoboxing el objecto se inicia con el valor de 10 
        System.out.println("numero = " + numero);
        int numero1=numero; //unboxing en un primitivo pasamos el valor de un obj
        System.out.println("numero1 = " + numero1);
    }
    
}
