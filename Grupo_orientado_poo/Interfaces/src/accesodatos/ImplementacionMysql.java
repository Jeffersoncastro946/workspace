/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author jeffe
 */
public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertat() {
        System.out.println("insertar desde MYSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("listar desde MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MYSQL");
    }

}
