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

    public void iniciarJuego(){
        this.estatusPartida = false;
        
    }
}