//Reto 3    **Diccionario y matriz**    Alan Bauza
import java.util.Scanner;
import java.io.IOException;
public class reto3 {
            //String que tiene un array en el que se guardan los datos del diccionario
            static String [] palabras = {"Lapiz", "Microfono", "Laptop", "Servilleta", "Arbol", "Plato", "Agua", "Cable", "Tijeras", "Libreta"};
            //definiciones de cada palabra
            static String [] significados = {"Utensilio para escribir o dibujar formado por un cilindro o prisma de madera con una barra de grafito en su interior.",
            "Aparato que transforma las ondas sonoras en corrientes eléctricas para su amplificacion.",
            "Computadora portatil de peso y tamanio ligero.",
            "Pieza de tela o papel que usa cada comensal para limpiarse los labios y las manos.",
            "Planta de tallo lenioso y elevado, que se ramifica a cierta altura del suelo.",
            "Pieza de la vajilla para comer.",
            "Liquido transparente, incoloro, inodoro e insipido en estado puro.",
            "Cordon formado con varios conductores aislados unos de otros y protegido generalmente por una envoltura flexible y resistente.",
            "Instrumento compuesto de dos hojas de acero, a manera de cuchillas de un solo filo.", 
            "Conjunto de hojas de papel, impresas o en blanco unidas que forman un libro delgado."};
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
                //objeto para mandar a llamar otro objeto
                reto3 r = new reto3();  //acceder a clase Diccionario
                Diccionario lista = r.new Diccionario(palabras, significados);  //objeto tipo Diccionario mandado a llamar con objeto tipo reto3
                while(opcion_diccionario != 'S'){
                    System.out.println("Escoge una opcion: "
                    +"\nA. Listar palabras del diccionario."
                    +"\nB. Buscar palabra en el diccionario."
                    +"\nC. Detalles del diccionario."
                    +"\nS. Finalizar programa.");
                    opcion_diccionario = sc.next().charAt(0);
                    switch (opcion_diccionario) {
                        case 'A' ->{
                            System.out.println("-----ENLISTAR PALABRAS-----");
                            //lista de palabras
                            lista.enlistar_palabras();
                        }
                        //buscar una palabra del diccionario
                        case 'B' ->{
                            System.out.println("-----BUSCAR PALABRA DENTRO DEL DICCIONARIO-----");
                            String palabra;
                            //ejecucion
                            lista.enlistar_palabras();
                            System.out.println("Escribe la palabra a buscar: ");
                            palabra = sc.next();
                            System.out.println(lista.buscar_palabras(palabra));
                        }
                        case 'C' ->{
                            //Detalles del diccionario
                            System.out.println("-----DETALLES-----");
                            System.out.println("Nombre: Diccionario Alan Bauza version 1.3");
                            System.out.println("Palabras dentro del diccionario: " + palabras.length);
                            for(int i = 0; i < palabras.length; i++){
                                //imprimir cada palabra y sus caracteres y los caracteres de los significados
                                System.out.println("Palabra: " + palabras[i] + " Numero de caracteres: " + palabras[i].length() + ". Numero de caracteres del significado: " + significados[i].length());
                            }
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
                reto3 m = new reto3();
                Matriz matriz = m.new Matriz();
                matriz.iniciar();
            }
            default -> System.out.println("Por favor elija una opcion disponible");
        }
        sc.close();
    }
    public class Diccionario{
        Scanner sc = new Scanner(System.in);
        private String[] palabras = new String[]{};
        private String[] significados = new String[]{};

        //constructor
        public Diccionario(String[] palabras, String[] definiciones){  
            this.palabras = palabras;
            this.significados = definiciones;
        }

        public void enlistar_palabras(){
            for(int i = 0; i < palabras.length; i++){
                System.out.println("* " + palabras[i]);
            }
            System.out.println("-------------------");
        }

        //buscar y comprobar el index de la palabra para confirmar coincidencia con su significado
        public String buscar_palabras(String palabra){
            String palabra_buscada = "";
            for(int i = 0; i < this.palabras.length; i++){
                /*si la palabra escrita es igual a alguna palabra dentro del vector
                entonces imprimir su definicion en el mismo index*/
                if(this.palabras[i].equals(palabra)){
                    palabra_buscada = palabra + ": \n" + this.significados[i];
                    break;
                }
            }
            if(palabra_buscada != ""){
                return palabra_buscada;
            }
            else{
                return "La palabra no esta registrada en el diccionario";
            }
        }
    }
    public class Matriz{
        private int opcion_filas;
        private int opcion_columnas;
        /*
         * creacion de matriz que tiene los valores especificados de filas y columnas
         */
        private int vector [][] = new int [opcion_filas][opcion_columnas];
        Scanner sc = new Scanner(System.in);

        private void conteo_matriz(){
        System.out.println("-----CONTADOR DE NUMEROS PARES E IMPARES-----");
        do{
        System.out.println("------Por favor imprima valores iguales de filas y columnas para continuar------");
        System.out.print("Indica la cantidad de filas: ");
        opcion_filas = sc.nextInt();
        System.out.print("Indica la cantidad de columnas: ");
        opcion_columnas = sc.nextInt();
    }
        while(opcion_filas != opcion_columnas);
        }

        public static void desplegar_matriz(int vector[][]){
            for(int x = 0; x < vector.length; x++){
                for(int y = 0; y < vector[0].length; y++){
                    System.out.println(vector[x][y] + " ");
                }
                System.out.println();
            }
        }

        public void iniciar(){
            conteo_matriz();
            desplegar_matriz(vector);
        }        
    }
}