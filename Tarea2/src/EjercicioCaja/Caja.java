public class Caja {
    //declaracion de las variables
    int ancho=0;
    int alto=0;
    int profundo=0;

    //creacion del constructor acceso - Nombre de la clase(argumentos)
    public Caja(){
        System.out.println("el contructor default se ha creado");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.alto=alto;
        this.ancho=ancho;
        this.profundo=profundo;
    }

    //Creacion de un metodo para el volumne
    public int GetVolumen(){
       int volumen=0;
       volumen=(alto*profundo*ancho);
        return volumen;
    }
}
