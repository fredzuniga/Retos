package evidencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.lang.StringBuilder;

public class playlist {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
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

    public void agregarPlaylist() throws IOException{
        System.out.println("Escribe el nombre de tu playlist: ");
        nombrePlaylist = entrada.readLine();
        System.out.println("Ahora escribe el numero de canciones que se van a agregar");
        numeroCanciones = Integer.parseInt(entrada.readLine());
        
        //clave generada con crearClave()
        System.out.println("La clave de tu playlist es: ");
        clavePlaylist = crearClave(nombrePlaylist);
        System.out.println(clavePlaylist);
    }

    //tomar un string y devolver su clave con la primer letra de las palabras
    public static String crearClave(String nombrePlaylist){
        StringBuilder clave = new StringBuilder();
        String[] palabras = nombrePlaylist.split("\\s+");   //\\s+ significa "por cada espacio en blanco"

        //cada palabra dentro del array palabras[]
        for (String palabra : palabras) {
            //evitar caracteres adicionales por espacios consecutivos
            if(!palabra.isEmpty()){
                clave.append(palabra.charAt(0));
            }
        }
        return clave.toString();
    }

    public void reproducirPlaylist(){
        
    }

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

