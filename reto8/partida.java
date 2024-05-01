package reto8;

import java.util.Date;

public class partida {
    private String nombre;
    private String correo;
    private String telefono;
    private Date fechaNacimiento;
    private int tipoPartida;
    protected boolean estatusPartida; //ganar o perder

    public partida(){
        registrarDatos();
    }

    public partida(String nombre, String correo, String telefono, Date fechaNacimiento, int tipoPartida,
            boolean estatusPartida) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoPartida = tipoPartida;
        this.estatusPartida = estatusPartida;
    }

    public void registrarDatos(){
        //TODO: REALIZAR EL PEDIDO DE DATOS
        //pedir datos de los usuarios
        System.out.println("Registro de datos ");
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
