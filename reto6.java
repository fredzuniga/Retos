/*
 * Por: Alan Bauza Alfonso
 * Reto 6: Nomina basica de empleados utilizando constructores
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Date;

public class reto6 {
    public static void main(String[] args) throws IOException{
        //acceder a la clase SistemaNomina desde el reto6
        SistemaNomina software1 = new SistemaNomina();
        software1.registrarEmpleados();
        software1.calcularNomina();
    }
}

//!Clase SistemaNomina
class SistemaNomina{
    //array de categorias
    private Categoria listaCategorias[];
    private Empleado listaEmpleados[];
    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    //Definicion de las categorias dentro de sus posiciones
    public SistemaNomina(){
        listaCategorias = new Categoria[3];
        listaEmpleados = new Empleado[5];   //5 empleados de la empresa


        //en posicion [0] hay un objeto tipo Categoria
        //opcion 1 de declaracion de categorias
        listaCategorias[0] = new Categoria("Empleado ventas", "VENT", 100.00, 50.00); 

        //opcion 2 de declaracion de categorias
        Categoria administrador = new Categoria("Administrador", "Admin", 180.00, 100.00);
        listaCategorias[1] = administrador;

        listaCategorias[2] = new Categoria("Gerente", "GERT", 250.00, 150.00);
    }
    public void registrarEmpleados() throws IOException{
        for(int i = 0; i < 5; i++){
            System.out.println("Indica el nombre del empleado: ");
            String nombre = entrada.readLine();

            System.out.println("Indica ahora las horas trabajadas: ");
            int horasTrabajadas = Integer.parseInt(entrada.readLine());

            System.out.println("Ahora escribe las horas extras trabajadas: ");
            int horasTrabajadasExtra = Integer.parseInt(entrada.readLine());

            System.out.println("Escribe el telefono del empleado: ");
            String telefono = entrada.readLine();

            //TODO: Aprender a ocupar el Date
            /*System.out.println("Escribe la fecha de nacimiento del empleado: ");
            Date fechaNacimiento = entrada.readLine();
            */
            System.out.println("Indica la categoria del empleado: \nCategoria 1: Empleado ventas.\nCategoria 2: Administrador\nCategoria 3: Gerente.");
            int categoriaSeleccionada = Integer.parseInt(entrada.readLine());

            //colocar la respuesta en su respectiva posicion y llenar parametros
            Categoria categoriaAsignar = listaCategorias[categoriaSeleccionada - 1];
            listaEmpleados[i] = new Empleado(nombre, horasTrabajadas, horasTrabajadasExtra, telefono, categoriaAsignar);
        }
    }

    //metodo de calculo de nomina
    public void calcularNomina() throws IOException{
        //Calculo y generacion de reporte
        int totalHorasExtrasTrabajadas;
        double sueldoAPagar;
        for(int i = 0; i < 5; i++){
            Empleado empleado = listaEmpleados[i];
            //entrar a categoria y devolver el sueldo base, horasTrabajadas se convierte en double
            sueldoAPagar = (double)empleado.getHorasTrabajadas() * empleado.getCategoria().getSueldoBase();
            //TODO: terminar de juntar los datos e imprimir
        }
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
class Empleado{
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
class Categoria{
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


