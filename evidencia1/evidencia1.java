package evidencia1;
/*
 * Evidencia 1 **Empresa farmaceutica**
 * Por: Alan Bauza Alfonso
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//importar la clase medicamento para la evidencia
import evidencia1.Medicamento;

public class evidencia1 {
    //Arraylist del tipo de clase Medicamento
    private static ArrayList <Medicamento> listaMedicamentos = new ArrayList <Medicamento>();
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        /*
         * Empieza el programa sin usuario o contrasenia
         * //TODO agregar el inicio de sesion al programa
         * //TODO terminar caso A de agregar medicamentos
         */
        char opcion = ' ';
        System.out.println("Evidencia 1 --- Registro de medicamentos");
        do{
            System.out.println("Indica una opcion. \nA. Registrar medicamento \nS. Salir del programa");
            try {
                opcion = entrada.readLine().charAt(0);
                switch(opcion){
                    case 'A' ->{
                        System.out.println("Indica el nombre quimico: ");
                        String nombreQuimico = entrada.readLine();
                        Medicamento medicamento = new Medicamento(nombreQuimico);
                        listaMedicamentos.add(medicamento);
                    }
                    case 'S' ->{

                    }
                    default -> System.out.println("Escoje una opcion valida.");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }while(opcion != 'S');
    }
}
