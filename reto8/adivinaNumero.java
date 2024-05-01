package reto8;

import java.util.Date;

public class adivinaNumero extends partida {
    public adivinaNumero(){
        super();
        iniciarJuego();
    }
    public adivinaNumero(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida, boolean estatusPartida){
        super(nombre, correo, telefono, fechaNacimiento, tipoPartida, estatusPartida);
        iniciarJuego();
    }
    public void iniciarJuego(){
        this.estatusPartida = false;
    }
}
