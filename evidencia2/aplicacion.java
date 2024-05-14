package evidencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aplicacion {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("-----SPOTIFY FOR JAVA-----");
        System.out.println("Elige una opcion para entrar: \nA. Agregar playlist \nB. Reproducir musica \nC. Terminar aplicacion");
        char opcion = entrada.readLine().charAt(0);
        playlist ejecutar = new playlist();
        ArrayList<playlist> listaPlaylists = new ArrayList<playlist>();

        // ! playlist precargadas
        playlist corridosTumbados = new playlist("Corridos Tumbados");
        generoMusical corridosTumbadosGenero = new generoMusical("Corridos Tumbados");
        corridosTumbados.agregarCancion(new cancion("El de la codeina", "2:09", corridosTumbadosGenero, "Natanael Cano"));
        corridosTumbados.agregarCancion(new cancion("Y LLORO", "2:59", corridosTumbadosGenero, "Junior H"));
        corridosTumbados.agregarCancion(new cancion("LADY GAGA", "3:32", corridosTumbadosGenero, "Peso Pluma, Gabito Ballesteros, Junior H"));
        corridosTumbados.agregarCancion(new cancion("AMG", "2:54", corridosTumbadosGenero, "Natanael Cano, Peso Pluma, Gabito Ballesteros"));
        corridosTumbados.agregarCancion(new cancion("LA PEOPLE", "2:33", corridosTumbadosGenero, "Peso Pluma, Tito Double P"));
        listaPlaylists.add(corridosTumbados);
        
        playlist rapPlaylist = new playlist("Rap Y Hip-hop");
        generoMusical rapGenero = new generoMusical("Rap Y Hip-hop");
        rapPlaylist.agregarCancion(new cancion("CARNIVAL", "4:24", rapGenero, "¥$, Kanye West, Ty Dolla $ign, Rich The Kid, Playboi Carti"));
        rapPlaylist.agregarCancion(new cancion("euphoria", "6:23", rapGenero, "Kendrick Lamar"));
        rapPlaylist.agregarCancion(new cancion("Type Shit", "3:48", rapGenero, "Future, Metro Boomin, Travis Scott, Playboi Carti"));
        rapPlaylist.agregarCancion(new cancion("90210 (feat. Kacy Hill)", "5:39", rapGenero, "Travis Scott, Kacy Hill"));
        rapPlaylist.agregarCancion(new cancion("The Hillbillies", "3:25", rapGenero, "Baby Keem, Kendrick Lamar"));
        listaPlaylists.add(rapPlaylist);

        while (opcion != 'C' || opcion != 'c'){
            switch (opcion){
                case ('A')-> {
                    ejecutar.agregarPlaylist();
                }
                case ('a')-> {
                    ejecutar.agregarPlaylist();
                }
                case('B')-> {
                    ejecutar.reproducirPlaylist(listaPlaylists);
                }
                case('b')->{
                    ejecutar.reproducirPlaylist(listaPlaylists);
                }
                default-> {
                    System.out.println("Escribe una letra valida");
                    break;
                }
            }
        }
        System.out.println("-----GRACIAS POR USAR ESTE PROGRAMA!-----");
    }
}
