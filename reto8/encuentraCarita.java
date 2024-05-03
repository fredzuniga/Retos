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

    public void iniciarJuego() throws IOException{
        this.estatusPartida = false;
        System.out.println("Juego numero: " + getTipoPartida());
        String matriz [][] = new String[3][3];
        Random random = new Random();
        //calculo de la posicion aleatoria de la carita en el programa
        int posicionCaritaFila = random.nextInt(2) + 1;
        int posicionCaritaColumna = random.nextInt(2) + 1;
        String carita = ":) ";

        System.out.println("-----ENCUENTRA CARITA-----");
        System.out.println("BIENVENIDO A ENCUENTRA CARITA. ADIVINA DONDE ESTA LA CARITA: ");
        //Impresion del vector para el usuario
        for(int f = 0; f < 3; f ++){
            for(int c = 0; c < 3; c ++){
                matriz[f][c] = "X ";
                System.out.print(matriz[f][c]);
            }
            System.out.println(" ");
        }
        //colocar la cara en el sitio correspondiente
        matriz[posicionCaritaFila][posicionCaritaColumna] = carita;
        System.out.println("Indica la fila: ");
        int filaSeleccionada = Integer.parseInt(entrada.readLine());
        System.out.println("Ahora indica la columna: ");
        int columnaSeleccionada = Integer.parseInt(entrada.readLine());
        //si escribe 1 va al valor en la posicion [0]
        filaSeleccionada --;    
        columnaSeleccionada --;

        if(posicionCaritaFila == filaSeleccionada && posicionCaritaColumna == columnaSeleccionada){
            System.out.println("FELICIDADES! GANASTE EL JUEGO");
            for(int f = 0; f < 3; f ++){
                for(int c = 0; c < 3; c ++){
                    System.out.print(matriz[f][c]);
                }
                System.out.println(" ");
            }
            estatusPartida = true;
        }

        if(posicionCaritaFila != filaSeleccionada && posicionCaritaColumna != columnaSeleccionada){
            System.out.println("LO SIENTO:( PERDISTE");
            System.out.println("RAZON DE PERDIDA: ");
            System.out.println("No encontraste donde estaba la carita");
            System.out.println("La carita estaba en la fila: " + (posicionCaritaFila + 1) + " y en la columna: " + (posicionCaritaColumna + 1));
            for(int f = 0; f < 3; f ++){
                for(int c = 0; c < 3; c ++){
                    System.out.print(matriz[f][c]);
                }
            System.out.println(" ");
            }

            //!si el valor introducido no esta en la posicion [0] a [2] del vector entonces no se escribio un numero entre el 1 y 3
            if(filaSeleccionada < 0 || filaSeleccionada > 2 || columnaSeleccionada < 0 || columnaSeleccionada > 2){
                System.out.println("RAZON DE PERDIDA:");
                System.out.println("Debiste escribir un numero entre el 1 y el 3");
            }
            estatusPartida = false;
        }
    }
}

