package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos =new ImplementacionMysql(); //no se puede crear objetos ya que este no tiene costructores
        //puede guardar en el tipo de interfaces ya que la clase usa sus implemnetaciones 
        datos.listar();
        imprimir(datos);
        datos=new ImplementacionOracle();
        datos.listar();
         imprimir(datos);
    }
    
    private static void imprimir(IAccesoDatos datos){
        //recibe una referencia tipo de dato de interfaces
        //depende el apuntador se ejecutara la implementacion correspondiente
        
        datos.eliminar();
    }
}
