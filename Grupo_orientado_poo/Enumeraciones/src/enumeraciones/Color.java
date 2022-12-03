package enumeraciones;

/*ROJO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF"),
    GRIS("#888888"),
    NEGRO("#000000"),
    NARANJA("#FF8300"),
 */
public enum Color {
    AMARILLO("#FFFF00"), ROJO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF"),
    GRIS("#888888"),
    NEGRO("#000000"),
    NARANJA("#FF8300"),
    NO_DEFINIDO("#");
    //ATRIBUTOS

    private String codigo;

    private Color(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoHex() {
        return this.codigo;
    }

    public Color getColor(String code) 
    {

        for (Color col : values()) 
        {
            if (col.getCodigoHex().equals(code)) 
                return col;
         }
 

          return NO_DEFINIDO;  
    }
}
