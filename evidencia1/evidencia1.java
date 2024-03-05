package evidencia1;
/*
 * Evidencia 1 **Empresa farmaceutica**
 * Por: Alan Bauza Alfonso
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//importar la clase medicamento para la evidencia
import evidencia1.Medicamento;

public class evidencia1 {
    private static String admin_usuario = "alan";
    private static String admin_password = "bauza";
    //Arraylist del tipo de clase Medicamento
    private static ArrayList <Medicamento> listaMedicamentos = new ArrayList <Medicamento>();
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        iniciar_programa();
    }
    private static void inicio_sesion(String user, String pass)throws IOException{
        String usuario = "alan", password = "bauza";
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
        }
}
    public static void iniciar_programa() throws IOException{
        inicio_sesion(admin_usuario, admin_password);
        char opcion = ' ';
        do{
            System.out.println("Evidencia 1 --- Registro de medicamentos --- ");
            System.out.println("Indica una opcion. \nA. Registrar medicamento \nS. Salir del programa");
                opcion = entrada.readLine().charAt(0);
                switch(opcion){
                    /*
                     * Pedir datos de medicinas y meterlos en el ArrayList las veces que sean necesarias
                     */
                    case 'A' ->{
                        System.out.println("Indica el nombre quimico: ");
                        String nombreQuimico = entrada.readLine();

                        System.out.println("Indica el nombre generico: ");
                        String nombreGenerico = entrada.readLine();

                        System.out.println("Indica el nombre registrado: ");
                        String nombreRegistrado = entrada.readLine();

                        System.out.println("Indica el precio para el publico: ");
                        float precioPublico = Float.parseFloat(entrada.readLine());

                        System.out.println("Ingresa el tipo de presentacion o forma farmaceutica: \n1. solida\n2. solida semisolida\n3. solida liquida");
                        char presentacionTipo = entrada.readLine().charAt(0);

                        Medicamento medicamentoNuevo = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, presentacionTipo); // Create medicament object
                        listaMedicamentos.add(medicamentoNuevo);
                    }
                    case 'S' ->{
                        System.out.println("Gracias por usar este programa");
                        mostrarLista();
                    }
                    default -> System.out.println("Escoje una opcion valida.");
                }
        }while(opcion != 'S');
    }
    private static void mostrarLista(){
        //mostrar la lista con su horario e informacion completa
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            System.out.println("Reporte generado el dia: " + dtf.format(LocalDateTime.now()));
            System.out.println("Medicamentos registrados: " + listaMedicamentos.size());
            if(listaMedicamentos.isEmpty()){
                System.out.println("La lista de medicamentos esta vacia, es necesario agregar medicamentos");
            }
            for(int i = 0; i < listaMedicamentos.size(); i++){
                System.out.println("------- MEDICAMENTO " + (i + 1) + " ---------");
                System.out.println("Registrado por: " + admin_usuario);
                listaMedicamentos.get(i).imprimirDatos();
            }
        }
}
