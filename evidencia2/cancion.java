package evidencia2;

import java.util.ArrayList;

public class cancion {
    private String nombreCancion;
    private String duracion;
    private generoMusical generoMusical;
    private String nombreCantante;
    private ArrayList<String> autores = new ArrayList<String>();

    public cancion(String nombreCancion, String duracion, generoMusical generoMusical, String nombreCantante) {
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
        this.generoMusical = generoMusical;
        this.nombreCantante = nombreCantante;
    }

    public cancion(){}

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public generoMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(generoMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }
}
