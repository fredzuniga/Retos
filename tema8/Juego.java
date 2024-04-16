package tema8;

public class Juego {
    private Personaje jugador1;
    private Personaje jugador2;
    private Personaje jugador3;

    //agregacion
    public Juego(Personaje jugador1, Personaje jugador2, Personaje jugador3){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
    }

    //composicion para crear automaticamente el jugador 1 y 2
    public Juego(){
        jugador1 = new Personaje();
        jugador2 = new Personaje();
        jugador3 = new Personaje();
    }

    public Personaje getJugador1() {
        return jugador1;
    }
    public void setJugador1(Personaje jugador1) {
        this.jugador1 = jugador1;
    }
    public Personaje getJugador2() {
        return jugador2;
    }
    public void setJugador2(Personaje jugador2) {
        this.jugador2 = jugador2;
    }
    public Personaje getJugador3(){
        return jugador3;
    }
    public void setJugador3(Personaje jugador3) {
        this.jugador3 = jugador3;
    }
}
