package mundopc;

import com.mundopc.*;

public class MundoPc {

    public static void main(String[] args) {
        Monitor monitorhp=new Monitor("HP",13.00);
        Teclado tecladohp=new Teclado("HP","USB");
        Raton ratonHp=new Raton("HP", "USB");
        Computadora pc =new Computadora("HP",monitorhp,tecladohp,ratonHp);
        Orden pedido=new Orden();
        pedido.agregarComputadora(pc);
        pedido.mostrarOrden();
    }
    
}
