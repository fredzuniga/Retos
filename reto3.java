//Reto 3    **Diccionario y matriz**    Alan Bauza
import java.io.*;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Escoge el programa que quieres ejecutar: \n1.- Simulador de diccionario."
        + "\n2.- Contador de numeros pares e impares.");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1->{
                System.out.println("--------DICCIONARIO--------"
                +"\nBienvenido al diccionario, escoge una opcion: "
                +"\nA. Listar palabras del diccionario."
                +"\nB. Buscar palabra en el diccionario."
                +"\nC. Detalle del diccionario."
                +"\nS. Finalizar programa.");
            }
            case 2->{

            }
            default -> System.out.println("Por favor elija una opcion disponible");
        }
    }
}
