
package test;

import enumeraciones.*;



public class TestEnum {

    public static void main(String[] args) {
        //no puedo darles valores a la varaible que cree
        //crear un swwitch que me diga que dia uso
     /*  Dias []day=Dias.values(); //.value regresa un array
        for (Dias day1 : day) {  //day1 estara copiando los valores de day
            //los itera y aumenta 
            System.out.println("day1 = " + day1);
        }
        System.out.println("creando lo mismo con otro ciclo");
        for (int i = 0; i < day.length; i++) {
            System.out.println("i = " + day[i]); //
            
        }*/
       // System.out.println("day = " + day);
      //  System.out.println("dia 1 = " + Dias.DOMINGO );
      //Continente a=Continente.AFRICA;
       /* System.out.println("a = " + a);
        System.out.println(a.getPais());*/
        //System.out.println("afriica"+  Continente.AFRICA.getPais() + Continente.AFRICA.getVocal() );
        
        String code = "#00FF00";
        String code2 = "#FF8300";
        System.out.println(Color.NO_DEFINIDO.getColor(code));
        System.out.println(Color.NO_DEFINIDO.getColor(code2));

      
    }
    
}
