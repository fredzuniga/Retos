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
        ArrayList <Object> empleadosRegistrados = new ArrayList<>();

    }

    private class Empleados{
        String nombreCompleto;
        int horasTrabajadas;
        int horasTrabajadasExtras;
        int telefono;
        Date fechaNacimiento;
        private static DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/mm/aa");
    }
}
