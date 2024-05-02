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
import java.util.Random;
import java.io.*;

public class encuentraCarita extends partida{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public encuentraCarita() throws IOException{
        super();
        setTipoPartida(2);
        iniciarJuego();
    }
    public encuentraCarita(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida, boolean estatusPartida) throws IOException{
        super(nombre, correo, telefono, fechaNacimiento, tipoPartida, estatusPartida);
        iniciarJuego();
    }

    public void iniciarJuego(){
        this.estatusPartida = false;
        System.out.println("Juego numero: " + getTipoPartida());
        String matriz [][] = new String[3][3];
        Random random = new Random();
        //calculo de la posicion aleatoria de la carita en el programa
        int posicionCaritaFila = random.nextInt(2) + 1;
        int posicionCaritaColumna = random.nextInt(2) + 1;
        String carita = ":)";
        //Impresion del vector para el usuario
        for(int f = 0; f < 3; f ++){
            for(int c = 0; c < 3; c ++){
                matriz[f][c] = "X";
                System.out.print(matriz[f][c]);
            }
            System.out.println(" ");
        }
        matriz[posicionCaritaFila][posicionCaritaColumna] = carita;
        try{
            System.out.println("Indica la fila: ");
            int filaSeleccionada = Integer.parseInt(entrada.readLine());
            System.out.println("Ahora indica la columna: ");
            int columnaSeleccionada = Integer.parseInt(entrada.readLine());
            //filaseleccionada > 0 && filaseleccionada < 4
            if ((filaSeleccionada < 0 || filaSeleccionada > 3) || (columnaSeleccionada < 0 || columnaSeleccionada > 3)){
                System.out.println("Indica un numero entre el 1 y 3");
                estatusPartida = false;
            }

            if ((filaSeleccionada == 1 || filaSeleccionada == 3) || (columnaSeleccionada == 1 || columnaSeleccionada == 3)){
                filaSeleccionada --;
                columnaSeleccionada --;
            }

            if(posicionCaritaFila == filaSeleccionada && posicionCaritaColumna == columnaSeleccionada){
                System.out.println("FELICIDADES! GANASTE EL JUEGO");
                estatusPartida = true;
            }
        else{
            System.out.println("LO SIENTO:( PERDISTE");
            System.out.println("La carita estaba en la fila: " + (posicionCaritaFila - 1) + " y en la columna: " + (posicionCaritaColumna - 1));
            for(int f = 0; f < 3; f ++){
                for(int c = 0; c < 3; c ++){
                    System.out.print(matriz[f][c]);
                }
                System.out.println(" ");
            }
        }
        }
        catch (IOException ex){
            System.out.println("Valor incorrecto, debe ser del 1 al 3");
        }
    }
}
