package evidencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.lang.StringBuilder;

public class playlist {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    private int numeroCanciones;
    private Date fechaRegistro;
    private String nombrePlaylist;
    private String clavePlaylist;
    public ArrayList<cancion> listaCanciones = new ArrayList<cancion>();
    //aplicacion x = new aplicacion();
    

    public playlist(String nombrePlaylist){
        this.nombrePlaylist = nombrePlaylist;
        this.clavePlaylist = crearClave(nombrePlaylist);
    }

    //constructor vacio
    public playlist(){}

    public void agregarPlaylist(ArrayList<generoMusical> generos, ArrayList<playlist> listaPlaylists) throws IOException{
        System.out.println("Escribe el nombre de tu playlist: ");
        nombrePlaylist = entrada.readLine();
        playlist playlistGenerada = new playlist(nombrePlaylist);   //nuevo objeto de playlist para meter en el arraylist

        System.out.println("Ahora escribe el numero de canciones que se van a agregar");
        numeroCanciones = Integer.parseInt(entrada.readLine());
        
        //clave generada con crearClave()
        System.out.println("La clave de tu playlist es: ");
        clavePlaylist = crearClave(nombrePlaylist);
        System.out.println(clavePlaylist + "\n");
        
        listaPlaylists.add(playlistGenerada);   //agregar la playlist a la lista

        System.out.println("-----AGREGAR CANCIONES-----");
        cancion cancion = new cancion();
        for(int i = 0; i < numeroCanciones; i++){
            System.out.println("Cancion numero " + (i + 1));
            System.out.println("Escribe el nombre de tu cancion: ");
            cancion.setNombreCancion(entrada.readLine());
            System.out.println("Escribe la duracion de la cancion: ");
            cancion.setDuracion(entrada.readLine());
            System.out.println("Escoge el genero musical de la cancion: ");
            for (generoMusical generoMusical : generos) {
                System.out.println(generoMusical.getClaveGeneroMusical() + ": " + generoMusical.getNombreGeneroMusical());
            }
            String claveEscrita = entrada.readLine();
            for(int k = 0; k < generos.size(); k++){
                if(generos.get(k).getClaveGeneroMusical() == claveEscrita){
                    cancion.setGeneroMusical(generos.get(k));
                }
            }
            System.out.println("Escribe el nombre del cantante (o los cantantes): ");
            cancion.setNombreCantante(entrada.readLine());
            System.out.println("Escribe cuantos autores tiene la cancion: ");
            int numAutores = Integer.parseInt(entrada.readLine());

            ArrayList<String> nombreAutores = new ArrayList<String>();
            for(int e = 0; e < numAutores; e++){
                System.out.println("Escribe el nombre del autor numero " + (e + 1) + ": ");
                nombreAutores.add(entrada.readLine());
            }
            cancion.setAutores(nombreAutores);
        }
        listaCanciones.add(cancion);
        numeroCanciones = listaCanciones.size();
    } 

    public void agregarCancion(cancion cancion) throws IOException{
        listaCanciones.add(cancion);
        numeroCanciones = listaCanciones.size();
    }
    
    //tomar un string y devolver su clave con la primer letra de las palabras
    public static String crearClave(String nombrePlaylist){
        StringBuilder clave = new StringBuilder();
        String[] palabras = nombrePlaylist.split("\\s+");   // !\\s+ significa "por cada espacio en blanco"

        //cada palabra dentro del array palabras[]
        for (String palabra : palabras) {
            //evitar caracteres adicionales por espacios consecutivos
            if(!palabra.isEmpty()){
                clave.append(palabra.charAt(0));
            }
        }
        return clave.toString().toUpperCase();  //devolver en mayusculas
    }

    public void reproducirPlaylist(ArrayList <playlist> listaPlaylists) throws IOException{
        System.out.println("-----REPRODUCCION DE PLAYLIST-----");
        System.out.println("Lista de playlist disponibles: ");
        for (playlist playlists : listaPlaylists) {
            System.out.println(playlists.getClavePlaylist() +": " + playlists.getNombrePlaylist());
        }

        System.out.println("Escribe el codigo de identificacion de la playlist: ");
        String codigoEscrito = entrada.readLine();
        for (playlist claves : listaPlaylists) {
            if (codigoEscrito.equals(claves.getClavePlaylist())){
                System.out.println("Playlist actual: " + claves.getNombrePlaylist());
                System.out.println("Cantidad de canciones: " + claves.getNumeroCanciones());
                for (cancion cancionActual : claves.listaCanciones) {
                    System.out.println("-----REPRODUCCION-----\nNombre de la cancion: " + cancionActual.getNombreCancion());
                    System.out.println("Interprete(s): " + cancionActual.getNombreCantante());
                    System.out.println("Duracion: " + cancionActual.getDuracion());
                    if(cancionActual != null){
                        System.out.println("Genero musical: " + cancionActual.getGeneroMusical().getNombreGeneroMusical());
                    }
                    System.out.println("Autores: " + String.join("," , cancionActual.getAutores()));
                    System.out.println("---------------------------------------");
                }
            }
        }
    }

    //mostrar el contenido de la playlist
    public int getNumeroCanciones() {
        numeroCanciones = listaCanciones.size();
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

