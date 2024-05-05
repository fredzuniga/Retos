package reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class partida {
    
    private String nombre;
    private String correo;
    private String telefono;
    private Date fechaNacimiento;
    private int tipoPartida;
    protected boolean estatusPartida; //ganar o perder
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    //cuando empieza la partida se ejecuta primero
    public partida() throws IOException{
        registrarDatos();
    }

    public partida(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida,
            boolean estatusPartida) throws IOException {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoPartida = tipoPartida;
        this.estatusPartida = estatusPartida;
        registrarDatos();
    }

    public void registrarDatos() throws IOException{
        //pedir datos de los usuarios
        System.out.println("-----REGISTRO DE DATOS-----");
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.readLine();
        System.out.println("Indica tu correo electronico: ");
        correo = entrada.readLine();
        System.out.println("Indica tu telefono: ");
        telefono = entrada.readLine();
        //System.out.println("Escribe tu fecha de nacimiento: ");
        //fechaNacimiento = entrada.readLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(int tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public boolean isEstatusPartida() {
        return estatusPartida;
    }

    public void setEstatusPartida(boolean estatusPartida) {
        this.estatusPartida = estatusPartida;
    }
    
    
}
