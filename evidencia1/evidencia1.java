package evidencia1;
/*
 * Evidencia 1 **Empresa farmaceutica**
 * Por: Alan Bauza Alfonso
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//!importar la clase medicamento para la evidencia
import evidencia1.Medicamento;
public class evidencia1 {
    //Arraylist del tipo de clase Medicamento
    private static ArrayList <Medicamento> medicamentos = new ArrayList <Medicamento>();
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        /*
         * Empieza el programa sin usuario o contrasenia
         * TODO agregar el inicio de sesion al programa
         */
        char opcion = 'p';
        System.out.println("Evidencia 1 --- Registro de medicamentos");
        do{
            System.out.println("Indica una opcion. \nA. Registrar medicamento \nS. Salir del programa");
            opcion = entrada.readLine().charAt(0);
        }while(opcion != 'S');
    }
}
