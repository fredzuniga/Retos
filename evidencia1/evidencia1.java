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
    private String admin_usuario, admin_password;
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
    public void inicio_sesion(){
        String usuario = " ", password = " ";
        try {
            while(admin_usuario.equals(usuario) == false && (admin_password.equals(password) == false)){
                System.out.println("Ingrese el usuario: ");
                usuario = entrada.readLine();
                System.out.println("Ingrese la contrasenia: ");
                password = entrada.readLine();
                if(admin_usuario.equals(usuario) == true && (admin_password.equals(password) == true)){
                    System.out.println("------GRACIAS POR INICIAR SESION " + admin_usuario + "------");
                    break;
                }
                else{
                    System.out.println("Reintentar el inicio");
                }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        }
    }
}
