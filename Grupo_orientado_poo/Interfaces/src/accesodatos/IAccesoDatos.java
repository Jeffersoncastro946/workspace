package accesodatos;

public interface IAccesoDatos {
//lista de metodos abstractos que me obliga a incluir una funcionalidad
    int MAX_REGISTRO = 10;  //CONSTANTE PUBLICA STATICA

    void insertat(); //metodo publico que no se puede implementar

    void actualizar();

    void listar();

    void eliminar();
}
