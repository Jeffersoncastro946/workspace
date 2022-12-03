
package com.gm.ventas.test;
import com.gm.ventas.*;
/**
 *
 * @author jeffe
 */
public class VentasTest {
    public static void main(String[] args) {
    Producto producto1=new Producto("camisa", 500);
     Producto producto2=new Producto("jean", 100.00);
     Orden orden1=new Orden();
     orden1.agregarProduto(producto2);
     orden1.agregarProduto(producto1);
     orden1.mostrarOrden();
    }
}
