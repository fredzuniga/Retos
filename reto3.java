//Reto 3    **Diccionario y matriz**    Alan Bauza
import java.io.*;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int opcion;
        //mensaje de inicio para escoger la opcion
        System.out.println("Escoge el programa que quieres ejecutar: \n1.- Simulador de diccionario."
        + "\n2.- Contador de numeros pares e impares.");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1->{
                //programa de diccionario
                char opcion_diccionario = 'x';

                System.out.println("--------DICCIONARIO--------"
                +"\nBienvenido al diccionario, escoge una opcion: "
                +"\nA. Listar palabras del diccionario."
                +"\nB. Buscar palabra en el diccionario."
                +"\nC. Detalle del diccionario."
                +"\nS. Finalizar programa.");
                opcion_diccionario = sc.next().charAt(0);
                while(opcion_diccionario != 'S'){
                    switch (opcion_diccionario) {
                        case 'A' ->{
                            //String que tiene un array en el que se guardan los datos del diccionario
                            String [] palabras;
                            System.out.println("-----ENLISTAR PALABRAS-----");
                            System.out.println("Introduce la palabra que quieres enlistar: ");
                            //readLine();
                            sc.next();
                            
                        }
                        case 'B' ->{
    
                        }
                        case 'C' ->{
    
                        }
                        case 'S' ->{
                            break;  //rompe el while
                        }
                        default -> System.out.println("Elije una opcion disponible");
                    }
                }
                //codigo de salida del while
                System.out.println("-----FIN DEL PROGRAMA-----");

            }
            case 2->{
                //programa de matriz
                int opcion_filas;
                int opcion_columnas;

                System.out.println("-----CONTADOR DE NUMEROS PARES E IMPARES-----");
                do{
                    System.out.println("------Por favor imprima valores iguales de filas y columnas para continuar------");
                    System.out.println("Indica la cantidad de filas: ");
                    opcion_filas = sc.nextInt();
                    System.out.println("Indica la cantidad de columnas: ");
                    opcion_columnas = sc.nextInt();
                }
                while(opcion_filas != opcion_columnas);
                //Math.random()* 10 da valores de 0.0 a 10.0, excluido el 10.0

            }
            default -> System.out.println("Por favor elija una opcion disponible");
        }
        sc.close();
    }
}
