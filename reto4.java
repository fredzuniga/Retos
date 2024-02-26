/*
 * Reto 4: Venta de boletos de autobuses
 * Por: Alan Bauza Alfonso
 */
import java.io.IOException;
import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) throws IOException{
        //objeto para incluir la funcion iniciar()
        reto4 v = new reto4();
        Venta programa = v.new Venta("", 0);
        programa.iniciar();
        }

        public class Venta {
            private String nombre_comprador;
            private int cantidad_boletos;
            char opcion = 'c';

            //constructor
            Venta(String nombre_comprador, int cantidad_boletos){
                this.nombre_comprador = nombre_comprador;
                this.cantidad_boletos = cantidad_boletos;
            }
            
            /*
             * Iniciar el sistema de registro de ventas de boletos
             */
            public void registro_ventas(){
                Scanner sc = new Scanner(System.in);
                do{
                    System.out.println("------Sistema de registro de ventas------");
                    System.out.println("A. Realizar venta de boleto. \nB. Mostrar datos de la lista de ventas. \nS. Finalizar el programa.");
                    opcion = sc.next().charAt(0);
                    switch (opcion) {
                        case 'A' ->{
                            System.out.println("----VENTA DE BOLETO----");
                            System.out.println("Ingrese el nombre del comprador: ");

                            //el atributo nombre_comprador cambiara cuando el comprador escriba su nombre
                            nombre_comprador = sc.next();
                            System.out.println("Ingrese el numero de pasajeros adicionales: ");
                            cantidad_boletos = sc.nextInt();
                            
                        }
                        case 'B' ->{
                            System.out.println("B");
                        }
                        case 'S' ->{
                            System.out.println("----FIN DEL PROGRAMA----");
                        }
                        default -> {
                            System.out.println("Escribe una opcion valida");
                            break;
                        }
                    }
                }while(opcion != 'S');
                sc.close();
            }

            /*
             * Iniciar el programa 
             */
            public void iniciar(){
                registro_ventas();
            }
        }
    }