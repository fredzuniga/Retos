/*
 * Reto 4: Venta de boletos de autobuses
 * Por: Alan Bauza Alfonso
 */
import java.io.IOException;
import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        char opcion;
        System.out.println("------Sistema de registro de ventas------");
        System.out.println("A. Realizar venta de boleto. \nB. Mostrar datos de la lista de ventas. \nS. Finalizar el programa.");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A' ->{

            }
            case 'B' ->{

            }
            case 'S' ->{
                System.out.println("----FIN DEL PROGRAMA----");
            }
            default -> System.out.println("Escribe una opcion valida");
        }
        sc.close();
    }
}
