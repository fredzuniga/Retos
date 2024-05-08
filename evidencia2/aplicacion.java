package evidencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aplicacion {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("-----SPOTIFY FOR JAVA-----");
        System.out.println("Elige una opcion para entrar: \nA. Agregar playlist \nB. Reproducir musica \nC. Terminar aplicacion");
        char opcion = entrada.readLine().charAt(0);
        playlist ejecutar = new playlist();
        while (opcion != 'C' || opcion != 'c'){
            switch (opcion){
                case ('A')-> {
                    ejecutar.agregarPlaylist();
                }
                case ('a')-> {
                    ejecutar.agregarPlaylist();
                }
                case('B')-> {
                    ejecutar.reproducirPlaylist();
                }
                case('b')->{
                    ejecutar.reproducirPlaylist();
                }
                default-> System.out.println("Escribe una letra valida");
            }
        }
        System.out.println("-----GRACIAS POR USAR ESTE PROGRAMA!-----");
    }
}
