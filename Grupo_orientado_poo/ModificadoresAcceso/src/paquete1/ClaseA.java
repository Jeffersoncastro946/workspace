package paquete1;
public class ClaseA {

    public ClaseA() {
        
    }
    //public permite acceso a todo
    /*protected las clases hijas heredan como public lo que yo defina como public
  tambien se puede acceder desde el nivel del paquete con el contructor seria privado para clases 
    que no se heredan y para llamarlos en una clase hija sera con super
    */
    /* default solo puede ser usada dentro del mismo paquete y cuando heredan sera
    como si fuese protected dentro del mismo paquete, las demas clases accederan como si fuese public
    */
    /*private  este es accesible solamente dentro de las clases */
}