package test;
///hacer autoboxing 
//elementos genericos
import java.util.*;

public class TestColecciones<T,S> {

    public static void main(String[] args) {
        List milista = new ArrayList();
        Set miset = new HashSet();
        System.out.println("Imprimiendo lista");
        milista.add("lunes");
        milista.add(1);
        milista.add("miercoles");
        milista.add("jueves");
        milista.add("viernes");
        milista.add("lunes");
        TestColecciones.imprimir(milista);
        miset.add("lunes");
        miset.add("martes");
        miset.add("miercoles");
        miset.add("jueves");
        miset.add("viernes");
        miset.add("lunes");
        System.out.println("imprimir set");
        
        imprimir(miset);
        System.out.println("prueba 1");
        miset.addAll(milista);
         imprimir(miset);
        //crear funciones para imprimir usando el uso de refrencia e intancia
        //colecciones son padre de lista y set
        //hashset agrega pero sin repetir y sin orden

        //uso de set este es Set miset= new HashSet
        Map<Integer,String> miMapa=new HashMap<>();
        miMapa.put(01, "lunes");
        miMapa.put(02, "martes");
         miMapa.put(03, "miercoles");
         
         String mapa= miMapa.get(1);
         System.out.println(mapa);
    }

    //map 
    /*Map mimapa =new HasMap()
    meto con put y guardo una llave y el valor*/
    private static void imprimir(Collection lista) {
        for (Object datos : lista) {
            System.out.println("datos = " + datos);
        }
    }

    
    
    
}
