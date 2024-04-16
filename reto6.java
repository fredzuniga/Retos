/*
 * Por: Alan Bauza Alfonso
 * Reto 6: Nomina basica de empleados
 */
import java.io.IOException;

public class reto6 {
    public static void main(String[] args) throws IOException{
        SistemaNomina software1 = new SistemaNomina();
        software1.calcularNomina();
    }

//!Clase SistemaNomina
public class SistemaNomina{
    //array de categorias
    Categoria listaCategorias[];

    //Definicion de las categorias dentro de sus posiciones
    public SistemaNomina(){
        listaCategorias = new Categoria[3];
        //en posicion [0] hay un objeto tipo Categoria
        //opcion 1 de declaracion de categorias
        listaCategorias[0] = new Categoria("Empleado ventas", "VENT", 100, 50); 

        //opcion 2 de declaracion de categorias
        Categoria administrador = new Categoria("Administrador", "Admin", 180, 100);
        listaCategorias[1] = administrador;

        listaCategorias[2] = new Categoria("Gerente", "GERT", 250, 150);
    }
    public void calcularNomina(){
        //Calculo y generacion de reporte
    }
}
/*public class SistemaNomina{
    //private int cantidadEmpleados
    public SistemaNomina(){
        calcularNomina();   //al crear un objeto de tipo SistemaNomina se calcula automaticamente
    }
    private void calcularNomina(){
        //Calculo y generacion de reporte
    }
}*/

//!Clase Empleado
public class Empleado{
    private String nombre;
    private int horasTrabajadas;
    private int horasTrabajadasExtra;
    private String telefono;
    //private date
    private Categoria categoria;    //categoria en que se encuentra el empleado

    public Empleado(){}
    public Empleado(String nombre, int horasTrabajadas, int horasTrabajadasExtra, String telefono, Categoria categoria){
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasTrabajadasExtra = horasTrabajadasExtra;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    /*
     * Getters y setters dentro de Empleado para definir parametros
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadasExtra() {
        return horasTrabajadasExtra;
    }

    public void setHorasTrabajadasExtra(int horasTrabajadasExtra) {
        this.horasTrabajadasExtra = horasTrabajadasExtra;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }    
}

//!Clase Categoria
public class Categoria{
    private String nombreCategoria;
    private String claveCategoria;
    private double sueldoBase;
    private double pagoHoraExtra;

    //constructor vacio
    public Categoria(){}
    //constructor con parametros de cada variable 
    public Categoria(String nombreCategoria, String claveCategoria, double sueldoBase, double pagoHoraExtra){
        this.nombreCategoria = nombreCategoria;
        this.claveCategoria = claveCategoria;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    /*
     * Getters y setters dentro de categoria para definir los parametros
     */
    public String getNombreCategoria(){
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }

    public String getClaveCategoria(){
        return claveCategoria;
    }

    public void setClaveCategoria(String claveCategoria){
        this.claveCategoria = claveCategoria;
    }

    public Double getSueldoBase(){
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase){
        this.sueldoBase = sueldoBase;
    }

    public Double getPagoHoraExtra(){
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(Double pagoHoraExtra){
        this.pagoHoraExtra = pagoHoraExtra;
    }
}

}
