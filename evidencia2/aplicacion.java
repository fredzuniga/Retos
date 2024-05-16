package evidencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aplicacion {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        playlist ejecutar = new playlist();
        ArrayList<playlist> listaPlaylists = new ArrayList<playlist>();
        ArrayList<generoMusical> generos = new ArrayList<generoMusical>();

        // ! playlist precargadas
        playlist corridosTumbados = new playlist("Corridos Tumbados");
        generoMusical corridosTumbadosGenero = new generoMusical("Corridos Tumbados");
        generos.add(corridosTumbadosGenero);
        corridosTumbados.agregarCancion(new cancion("El de la codeina", "2:09", corridosTumbadosGenero, "Natanael Cano","Natanael Cano"));
        corridosTumbados.agregarCancion(new cancion("Y LLORO", "2:59", corridosTumbadosGenero, "Junior H"));
        corridosTumbados.agregarCancion(new cancion("LADY GAGA", "3:32", corridosTumbadosGenero, "Peso Pluma, Gabito Ballesteros, Junior H"));
        corridosTumbados.agregarCancion(new cancion("AMG", "2:54", corridosTumbadosGenero, "Natanael Cano, Peso Pluma, Gabito Ballesteros"));
        corridosTumbados.agregarCancion(new cancion("LA PEOPLE", "2:33", corridosTumbadosGenero, "Peso Pluma, Tito Double P"));
        listaPlaylists.add(corridosTumbados);
        
        playlist rapPlaylist = new playlist("Rap Y Hip-hop");
        generoMusical rapGenero = new generoMusical("Rap Y Hip-hop");
        generos.add(rapGenero);
        rapPlaylist.agregarCancion(new cancion("CARNIVAL", "4:24", rapGenero, "¥$, Kanye West, Ty Dolla $ign, Rich The Kid, Playboi Carti"));
        rapPlaylist.agregarCancion(new cancion("euphoria", "6:23", rapGenero, "Kendrick Lamar"));
        rapPlaylist.agregarCancion(new cancion("Type Shit", "3:48", rapGenero, "Future, Metro Boomin, Travis Scott, Playboi Carti"));
        rapPlaylist.agregarCancion(new cancion("90210 (feat. Kacy Hill)", "5:39", rapGenero, "Travis Scott, Kacy Hill"));
        rapPlaylist.agregarCancion(new cancion("The Hillbillies", "3:25", rapGenero, "Baby Keem, Kendrick Lamar"));
        listaPlaylists.add(rapPlaylist);
        
        generoMusical popGenero = new generoMusical("Pop");
        generos.add(popGenero);
        generoMusical reguetonGenero = new generoMusical("Reggaeton");
        generos.add(reguetonGenero);

        char opcion = ' ';
        do{
            System.out.println("-----SPOTIFY FOR JAVA-----");
            System.out.println("Elige una opcion para entrar: \nA. Agregar playlist \nB. Reproducir musica \nC. Terminar aplicacion");
            opcion = entrada.readLine().charAt(0);
            //System.out.println(opcion);
                switch (opcion){
                    case 'A'-> {
                        ejecutar.agregarPlaylist(generos, listaPlaylists);
                    }
                    case 'a'-> {
                        ejecutar.agregarPlaylist(generos, listaPlaylists);
                    }
                    case 'B'-> {
                        ejecutar.reproducirPlaylist(listaPlaylists);
                    }
                    case 'b'-> {
                        ejecutar.reproducirPlaylist(listaPlaylists);
                    }
                    case 'C'-> {
                        break;
                    }
                    case 'c'-> {
                        break;
                    }
                    default-> {
                        System.out.println("Escribe una letra valida");
                    }
                }
            } while ((opcion != 'C')&&(opcion != 'c'));
        System.out.println("-----GRACIAS POR USAR ESTE PROGRAMA!-----");
    }
}
