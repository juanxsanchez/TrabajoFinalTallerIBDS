package modelo;

public class Servicio {
    
    //Tipo puede ser "Fijo"/"Por hora" ***IMPORTANTE QUE SE ESCRIBA CON MAYUSCULA LA PRIMERA LETRA CUANDO SE CREA***
    //Descripcion es el nombre del servicio. Ej: barrer
    private String descripcion,tipo;
    private int costo;

    public Servicio(String descripcion, String tipo, int costo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.costo = costo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    public Servicio() {
        super();
    }
}
