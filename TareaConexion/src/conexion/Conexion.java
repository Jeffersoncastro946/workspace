
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//
//import java.sql.Connection;
//import java.sql.DriverManager;

;


public class Conexion {
    //nombre de la base //url   //user y pas //driver com.mysql.cj.jdbc.Driver
    //variable conexion da error cuando es conexion
String bd= "conectividad";   
String url="jdbc:mysql://localhost:3306/conectividad";
String user="root";
String password=null;
String driver="com.mysql.cj.jdbc.Driver";
Connection cx;

public Conexion(/*String bd*/){
  //  this.bd=bd;
}
public Connection conectar(){
    
    try {
        Class.forName(driver);
        cx=DriverManager.getConnection(url,user,password);
            System.out.println("Se logro conectar a "+bd);
            
     } catch (ClassNotFoundException | SQLException ex) {
         System.out.println("No se logro conectar a "+ bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       
     }
    return cx;
}

public void deconectar(){
    try {
        cx.close();
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    public static void main(String[] args) {
        Conexion test=new Conexion();
        test.conectar();
    }
    
    //otra forma de conectarme?
    public Connection getConexion(){
        Connection con = null;
        try{
             Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    
    
    
}