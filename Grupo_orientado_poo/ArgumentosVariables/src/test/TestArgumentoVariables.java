
package test;
//varArgs
//argumentos variables consiste en pasar argumentos hacia un metodo  sin saber
//cuantos argumentos hasta que se ejecute

//static dentro de clase se comporta como un metodo normal
public class TestArgumentoVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(1,2,3);
        imprimirNumeros(4,5,6,7);
        variosParametros("juan", 1,4,5,6,7,8,10);
    }
    
    private static void imprimirNumeros(int...numeros){
    //de manera interna los argumetos variables se comporta como arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento = " + numeros[i]);
        }
    
    }
    private static void variosParametros(String nombre, int...numeros){
        System.out.println(nombre);
        imprimirNumeros(numeros);
    }
    
}
