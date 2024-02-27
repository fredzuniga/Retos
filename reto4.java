/*
 * Reto 4: Venta de boletos de autobuses
 * Por: Alan Bauza Alfonso
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class reto4 {
    private static ArrayList <Pasajero> pasajeros = new ArrayList<Pasajero>(); 
    private static double precioBoleto = 1250.50;
    int cantidadPasajerosTotal = 0;
    public static void main(String[] args) throws IOException{
        //objeto para incluir la funcion iniciar()
        reto4 v = new reto4();
        Venta programa = v.new Venta();
        programa.iniciar();
        }

        public class Venta {
            char opcion = 'c';
            
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
                            int cantidadPasajerosVenta = 1;
                            System.out.println("----VENTA DE BOLETO----");
                            System.out.println("Ingrese el nombre del comprador: ");
                            String nombre_comprador = sc.next();
                            System.out.println("Ingrese el numero de pasajeros adicionales: ");
                            int cantidad_pasajeros = sc.nextInt();
                            //objeto comprador donde se guarda la cantidad de pasajeros adicionales y sus nombres
                            Pasajero comprador = new Pasajero();
                            comprador.nombrePasajero = nombre_comprador;
                            //creacion de vector que tiene el tamaño de la cantidad_pasajeros
                            String[] nombre_pasajeros_adicionales = new String[cantidad_pasajeros];
                            for(int i = 0; i < cantidad_pasajeros; i++){
                                System.out.println("Ingrese el nombre del pasajero adicional " + (i+1));
                                nombre_pasajeros_adicionales[i] = sc.next();
                            }
                            //agregar los pasajeros adicionales
                            comprador.pasajerosAdicionales = nombre_pasajeros_adicionales;
                            pasajeros.add(comprador);
                            cantidadPasajerosVenta += cantidad_pasajeros;
                            /*
                             * Impresion de ticket de venta
                             */
                            System.out.println("------Ticket de venta------");
                            System.out.println("Cantidad de boletos: " + cantidadPasajerosVenta);
                            System.out.println("Importe de venta: $" + cantidadPasajerosVenta * precioBoleto);
                            System.out.println("Nombre del comprador: " + nombre_comprador);
                            System.out.println("Pasajeros adicionales: " + comprador.pasajerosAdicionales.length);
                            //conteo de pasajeros totales
                            cantidadPasajerosTotal += cantidadPasajerosVenta;   
                        }
                        case 'B' ->{
                            /*
                             * Impresion de la lista de pasajeros
                             */
                            int conteo = 0;
                            System.out.println("-----LISTA DE PASAJEROS-----");
                            for(Pasajero comprador : pasajeros){
                                conteo++;
                                System.out.println("Pasajero " + conteo + " (comprador): " + comprador.nombrePasajero);
                                for(int i = 0; i < comprador.pasajerosAdicionales.length; i++){
                                    conteo++;
                                    System.out.println("Pasajero " + conteo + " " + comprador.pasajerosAdicionales[i]);
                                }
                            }
                            System.out.println("Total de pasajeros: " + cantidadPasajerosTotal);
                            System.out.println("Monto total de ventas: $" + cantidadPasajerosTotal * precioBoleto);
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
        class Pasajero{
            public String nombrePasajero;
            public String[] pasajerosAdicionales;
        }
    }