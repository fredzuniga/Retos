/*
 * Gira una carta: el juego consiste en mostrar en una sola línea 5 símbolos de X separados por un espacio, el cliente indicará
 * una posición donde considere que se encuentra un símbolo de diamante de póquer con código ASCII (usa un array unidimensional),
 * deberás fijar en alguna posición el símbolo y verificar que el cliente acierte correctamente.
 */
package reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

public class giraCarta extends partida{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public giraCarta() throws IOException{
        super();
        setTipoPartida(3);
        iniciarJuego();
    }
    public giraCarta(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida, boolean estatusPartida) throws IOException{
        super(nombre, correo, telefono, fechaNacimiento, tipoPartida, estatusPartida);
        iniciarJuego();
    }

    public void iniciarJuego() throws IOException{
        this.estatusPartida = false;
        System.out.println("Juego numero: " + getTipoPartida());
        String lineaCartas[] = new String[5];
        Random random = new Random();
        int posicionDiamante = random.nextInt(4) + 1;
        String diamante = "<> ";

        System.out.println("-----GIRA CARTA-----");
        System.out.println("Bienvenido a Gira Carta! Adivina donde esta el diamante en la linea de cartas: ");
        for(int i = 0; i < 5; i ++){
            lineaCartas[i] = "X ";
            System.out.println(lineaCartas[i]); 
        }
        //colocar el diamante en el sitio correspondiente
        lineaCartas[posicionDiamante] = diamante;
        
        System.out.println("Indica el numero de carta en la que crees que esta el diamante (elige del 1 al 5): ");
        int numeroCarta = Integer.parseInt(entrada.readLine());
        //si escribe 1 entonces estara buscando en la posicion [0] del vector
        numeroCarta --;

        if(numeroCarta == posicionDiamante){
            System.out.println("FELICIDADES! GANASTE EL JUEGO");
            System.out.println("Gracias por participar");
            for(int i = 0; i < 5; i ++){
                System.out.println(lineaCartas[i]);  
            }
            estatusPartida = true;
        }

        //si no adivina
        else{
            System.out.println("LO SIENTO:( PERDISTE EL JUEGO");
            System.out.println("El diamante estaba realmente en la carta numero: " + (posicionDiamante + 1));
            for(int i = 0; i < 5; i ++){
                System.out.println(lineaCartas[i]);  
            }
            System.out.println("Gracias por participar");

            //!Se refiere a la posicion en el vector[], no a su valor real escrito por el usuario
            if(numeroCarta < 0 || numeroCarta > 4){
                System.out.println("RAZON DE PERDIDA: ");
                System.out.println("Debiste escribir un numero entre el 1 y el 5 \n");
            }
        }
    }
}