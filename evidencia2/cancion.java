package evidencia2;

public class cancion {
    String nombreCancion;
    double duracion;
    String generoMusical;
    String nombreCantante;
    String autores;

    public cancion(String nombreCancion, double duracion, String generoMusical, String nombreCantante, String autores) {
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
        this.generoMusical = generoMusical;
        this.nombreCantante = nombreCantante;
        this.autores = autores;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

}
