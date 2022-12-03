package domain;
/**
 *
 * @author jeffe
 */
public class Persona {
    //Atributos
    protected String nombre;
    protected String direccion;
    protected char genero;
    protected int edad;
   
    
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public Persona(String nombre, String direccion, char genero, int edad){
        this.nombre=nombre;
        this.direccion=direccion;
        this.genero=genero;
        this.edad=edad;
    }
    
    String getNombre(){
    return this.nombre;
}
    
   void setNombre(String nombre){
       this.nombre=nombre;
   }
   
   char getGenero(){
       return this.genero;
   }
   void setGenero(char genero){
       this.genero=genero;
   }
   int getEdad(){
       return this.edad;
   }
   void setEdad(int edad){
       this.edad=edad;
   }
   String getDireccion(){
       return this.direccion;
   }
   void setDireccion(String direccion){
       this.direccion=direccion;
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

   
   
   
}