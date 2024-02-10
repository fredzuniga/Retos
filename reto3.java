//Reto 3    **Diccionario y matriz**    Alan Bauza
import java.util.Scanner;
import java.io.IOException;
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
                + "\nBienvenido al diccionario, escoge una opcion: ");
                while(opcion_diccionario != 'S'){
                    System.out.println("Escoge una opcion: "
                    +"\nA. Listar palabras del diccionario."
                    +"\nB. Buscar palabra en el diccionario."
                    +"\nC. Detalle del diccionario."
                    +"\nS. Finalizar programa.");
                    opcion_diccionario = sc.next().charAt(0);
                    switch (opcion_diccionario) {
                        case 'A' ->{
                            System.out.println("-----ENLISTAR PALABRAS-----");
                            reto3 lista = new reto3();  //objeto nuevo
                            //mandar a llamar la clase
                            funciones programa = lista.new funciones();
                            programa.enlistar_palabras();   //usar enlistar_palabras()
                            System.out.println("-------------------");
                        }
                        //buscar una palabra del diccionario
                        case 'B' ->{
                            String palabra_buscada;
                            System.out.println("-----BUSCAR PALABRA DENTRO DEL DICCIONARIO-----");
                            //ejecucion
                            reto3 lista = new reto3();  //objeto nuevo
                            funciones programa = lista.new funciones();
                            programa.enlistar_palabras();
                            System.out.println("Escribe la palabra que quieres buscar en el diccionario: ");
                            palabra_buscada = sc.next();
                            

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
    public class funciones{
        //String que tiene un array en el que se guardan los datos del diccionario
        String [] palabras = {"Lapiz", "Microfono", "Laptop", "Servilleta", "Arbol", "Plato", "Agua", "Cable", "Tijeras", "Libreta"};
        //definiciones de cada palabra
        String [] significados = {"Utensilio para escribir o dibujar formado por un cilindro o prisma de madera con una barra de grafito en su interior.",
        "Aparato que transforma las ondas sonoras en corrientes eléctricas para su amplificacion.",
        "Computadora portatil de peso y tamanio ligero.",
        "Pieza de tela o papel que usa cada comensal para limpiarse los labios y las manos.",
        "Planta de tallo lenioso y elevado, que se ramifica a cierta altura del suelo.",
        "Pieza de la vajilla para comer.",
        "Liquido transparente, incoloro, inodoro e insipido en estado puro.",
        "Cordon formado con varios conductores aislados unos de otros y protegido generalmente por una envoltura flexible y resistente.",
        "Instrumento compuesto de dos hojas de acero, a manera de cuchillas de un solo filo.", 
        "Conjunto de hojas de papel, impresas o en blanco unidas que forman un libro delgado."};
        public void enlistar_palabras(){
            for(int i = 0; i < palabras.length; i++){
                System.out.println("* " + palabras[i]);
            }
        }
    }
}
