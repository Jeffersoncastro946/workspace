/*las enumeracions sirven definir datos constantes en forma de lista
en lugar de class usare enum, por defecto son string
crar enum de continenetes 

despues de eum  poner ; 

atributo para saber cuantos paises tendra cada continete tipo final

cada enum en una clase en resumen es un object por lo tanto pueden tener atributos 
que acceden con el simbolo de acceso(.)*/
package enumeraciones;


public enum Continente {
    AFRICA(45,"a"), AMERICA(46,"e"), ASIA(47,"i"),EUROPA(48,"o"),OCEANIA(49, "u");
    private final int pais;
    private String vocal;
    //DECLARACION DE CANTIDAD DE PAISAES;
   private Continente(int pais,String vocal ){
       this.pais=pais;
       this.vocal=vocal;
   }

    

    public int getPais() {
        return this.pais;
    }

    public String getVocal() {
        return vocal;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }
    
   
}
