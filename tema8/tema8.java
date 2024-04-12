package tema8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tema8 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        /*Personaje personaje1 = new Personaje(100,"DeadlyTaco27");
        Personaje personaje2 = new Personaje();

        //se crea el personaje basado en el personaje 1 o 2 (objeto constituido por otro objeto)
        Personaje personaje3 = new Personaje(personaje1);*/
        //creacion del personaje
        System.out.println("Personaje 1: ");
        Personaje personaje1 = new Personaje();
        System.out.println("Indica el nivel de vida del personaje: ");
        int nivelVida = Integer.parseInt(entrada.readLine());
        System.out.println("Indica el nombre de tu personaje: ");
        String nameTag = entrada.readLine();
        personaje1.setNivelVida(nivelVida);
        personaje1.setNameTag(nameTag);

        System.out.println("Personaje 2: ");
        Personaje personaje2 = new Personaje();
        System.out.println("Indica el nivel de vida del personaje: ");
        int nivelVida2 = Integer.parseInt(entrada.readLine());
        System.out.println("Indica el nombre de tu personaje: ");
        String nameTag2 = entrada.readLine();
        personaje2.setNivelVida(nivelVida2);
        personaje2.setNameTag(nameTag2);

        System.out.println("Personaje 3: ");
        Personaje personaje3 = new Personaje();
        System.out.println("Indica el nivel de vida del personaje: ");
        int nivelVida3 = Integer.parseInt(entrada.readLine());
        System.out.println("Indica el nombre de tu personaje: ");
        String nameTag3 = entrada.readLine();
        personaje3.setNivelVida(nivelVida3);
        personaje3.setNameTag(nameTag3);


        System.out.println("El nombre del personaje 1 es: "+ personaje1.getNameTag());
        System.out.println("El nivel de vida del personaje 1 es: " + personaje1.getNivelVida());
        System.out.println("El nombre del personaje 2 es: " + personaje2.getNameTag());
        System.out.println("El nivel de vida del personaje 2 es: " + personaje2.getNivelVida());
        System.out.println("El nombre del personaje 3 es: " + personaje3.getNameTag());
        System.out.println("El nivel de vida del personaje 3 es: " + personaje3.getNivelVida());
        /*
         * Si no tuvieramos un constructor con parametros:
         * personaje1.setNivelVida(nivelVida);
         * personaje1.setNameTag(nameTag);
         */

        //Personaje personaje2 = new Personaje(nivelVida, nameTag);
        //personaje2 = null;     elimina los datos dentro del personaje2

        //Personaje personaje3 = new Personaje(new Personaje(nivelVida, nameTag));

        //imprimir la vida y nombre del personaje
        //System.out.println(personaje2.getNivelVida());
        //System.out.println(personaje2.getNameTag());

        Juego tablero1 = new Juego();

        //añadir datos del jugador 1 accediendo a el dentro del tablero1 por composicion
        //tablero1.getJugador1().setNameTag(nameTag);
        //tablero1.getJugador1().setNivelVida(nivelVida);

        //Juego tablero2 = new Juego(personaje1, personaje2, personaje3); //agregacion
    }

}
