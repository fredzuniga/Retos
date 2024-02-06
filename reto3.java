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
                            String [] palabras = {"lapiz", "microfono", "laptop", "servilleta", "arbol", "plato",
                            "agua", "cable", "tijeras", "libreta"};
                            //definiciones de cada palabra
                            String [] significados = {"Utensilio para escribir o dibujar formado por un cilindro o prisma de madera con una barra de grafito en su interior.",
                            "Aparato que transforma las ondas sonoras en corrientes eléctricas para su amplificacion.",
                            "Computadora portatil de peso y tamanio ligero.", "Pieza de tela o papel que usa cada comensal para limpiarse los labios y las manos.",
                            "Planta de tallo lenioso y elevado, que se ramifica a cierta altura del suelo.", "Pieza de la vajilla para comer.",
                            "Liquido transparente, incoloro, inodoro e insipido en estado puro.", "Cordon formado con varios conductores aislados unos de otros y protegido"
                            +" generalmente por una envoltura flexible y resistente.","Instrumento compuesto de dos hojas de acero, a manera de cuchillas de un solo filo.", 
                            "Conjunto de hojas de papel, impresas o en blanco unidas que forman un libro delgado."};
                            System.out.println("-----ENLISTAR PALABRAS-----");
                            
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
