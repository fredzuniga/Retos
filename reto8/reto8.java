package reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class reto8 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int juegoSeleccionado;
        ArrayList<partida> partidas = new ArrayList<partida>();
        partida juego = null;
        for(int i = 0; i < 10; i ++){
            System.out.println("Cliente No." + (i + 1));
            System.out.println("Selecciona un juego: \n1.- Adivina el numero \n2.- Encuentra la carita \n3.- Gira una carta");
            juegoSeleccionado = Integer.parseInt(entrada.readLine());
            switch (juegoSeleccionado) {
                //herencia de "juego"
                case 1-> juego = new adivinaNumero();
                case 2-> juego = new encuentraCarita();
                case 3-> juego = new giraCarta();
                default -> System.out.println("Escribe un numero valido.");
            }
            //juego.registrarDatos();
            System.out.println(juego.isEstatusPartida());
            partidas.add(juego);
        }
    }
}
