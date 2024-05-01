/*
 * Adivina el número: este juego consiste en adivinar un número aleatorio del 1 al 10, el cliente solo tiene 3 oportunidades para ganar.  
 */
package reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

public class adivinaNumero extends partida {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public adivinaNumero() throws IOException{
        super();
        iniciarJuego();
    }
    public adivinaNumero(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida, boolean estatusPartida) throws IOException{
        super(nombre, correo, telefono, fechaNacimiento, tipoPartida, estatusPartida);
        iniciarJuego();
    }
    public void iniciarJuego() throws IOException{
        this.estatusPartida = false;    //significa que aun no se inicia el juego
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int intentos = 3;
        System.out.println("Bienvenido a adivina un numero!");
        while (intentos > 0) {
            System.out.println("Adivina un numero del 1 al 10: ");
            int intentoUsuario = Integer.parseInt(entrada.readLine());

            if (intentoUsuario < 1 || intentoUsuario > 10){
                System.out.println("El numero tiene que estar entre el 1 y el 10 :(");
                intentos--;
                System.out.println("Te quedan: " + intentos + " intentos.");
            }
            //victoria
            if(intentoUsuario == numeroAleatorio){
                //intentos ++ para evitar que salga el texto de "lo sentimos se agotaron los intentos"
                intentos ++;
                System.out.println("FELICIDADES! ADIVINASTE EL NUMERO");
                estatusPartida = true;  //como se ganó el juego es true, para contabilizar cuantos trues hay
                break;
            }
            //cuando perdemos en el juego
            else{
                intentos--;
                System.out.println("FALLASTE ! todavia te quedan: " + intentos + " intentos.");
                estatusPartida = false; //se perdió el juego
            }
        }
        System.out.println("Lo sentimos, se agotaron tus intentos:( El numero era: " + numeroAleatorio);
    }
}
