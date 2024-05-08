package evidencia2;

import java.util.Date;

public class playlist {
    int numeroCanciones;
    Date fechaRegistro;
    String nombrePlaylist;
    String clavePlaylist;

    public playlist(int numeroCanciones, Date fechaRegistro, String nombrePlaylist, String clavePlaylist){
        this.numeroCanciones = numeroCanciones;
        this.fechaRegistro = fechaRegistro;
        this.nombrePlaylist = nombrePlaylist;
        this.clavePlaylist = clavePlaylist;
    }

    //constructor vacio
    public playlist(){}

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    public String getClavePlaylist() {
        return clavePlaylist;
    }

    public void setClavePlaylist(String clavePlaylist) {
        this.clavePlaylist = clavePlaylist;
    }
}

