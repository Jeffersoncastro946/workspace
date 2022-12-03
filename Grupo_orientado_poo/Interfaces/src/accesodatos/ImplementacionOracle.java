
package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertat() {
        System.out.println("insertar desde ORACLE");
    }

    @Override
    public void actualizar() {
        System.out.println("ACTUALIZAR desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("listar desde ORACLE");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde ORACLE");
    }

    public ImplementacionOracle()
    {
        
    }
}
