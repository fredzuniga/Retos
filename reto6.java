/*
 * Por: Alan Bauza Alfonso
 * Reto 6: Nomina basica de empleados
 */
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class reto6 {
    public static void main(String[] args) throws IOException{
        ArrayList <Empleados> empleadosRegistrados = new ArrayList<>();
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/mm/aa");
    }

    private class Empleados{
        String nombreCompleto;
        int horasTrabajadas;
        int horasTrabajadasExtras;
        int telefono;
        Date fechaNacimiento;
        ArrayList <categoria> categoriaEmpleado = new ArrayList<>();

    }

    private class categoria{
        String nombreCategoria;
        String claveCategoria;
        double sueldoBase;
        double horaExtra;
    }
}
