package evidencia2;

public class generoMusical {
    private String nombreGeneroMusical;
    private String claveGeneroMusical;
    
    public generoMusical(String nombreGeneroMusical) {
        this.nombreGeneroMusical = nombreGeneroMusical;
        //al momento de crear un genero musical se esta creando la clave
        this.claveGeneroMusical = funciones.generarClave(nombreGeneroMusical);
    }

    

    public String getNombreGeneroMusical() {
        return nombreGeneroMusical;
    }

    public void setNombreGeneroMusical(String nombreGeneroMusical) {
        this.nombreGeneroMusical = nombreGeneroMusical;
    }

    public String getClaveGeneroMusical() {
        return claveGeneroMusical;
    }

    public void setClaveGeneroMusical(String claveGeneroMusical) {
        this.claveGeneroMusical = claveGeneroMusical;
    }

    
}
