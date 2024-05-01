/*
 * Encuentra la carita: el juego consiste en mostrar al cliente una tabla de 3 filas por 3 columnas, en esta tabla se mostrará
 * solamente símbolos de X, el cliente seleccionara una fila y una columna (una un array bidimensional), el juego se encargará
 * de buscar en la tabla si en esa posición se encuentra la carita feliz, deberás fijar en alguna posición de las filas y
 * columnas el símbolo de la carita feliz y verificar que el cliente acierte correctamente.  
 */
package reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class encuentraCarita extends partida{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public encuentraCarita() throws IOException{
        super();
        iniciarJuego();
    }
    public encuentraCarita(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida, boolean estatusPartida) throws IOException{
        super(nombre, correo, telefono, fechaNacimiento, tipoPartida, estatusPartida);
        iniciarJuego();
    }

    public void iniciarJuego(){
        this.estatusPartida = false;
        
    }
}
