//Reto 2    **calificaciones de alumnos**   Alan Bauza
import java.io.*;
import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Escoja el programa a utilizar: \n1: Calculadora de promedios "
                + "\n2: Compra y venta de cajas");
        opcion = sc.nextInt();
        switch(opcion){
            case 1->{
                //programa calificaciones
                int num_calificaciones;
                double promedio = 0;
                double promedio_final;
                double calificacion;
                System.out.println("Escriba el numero de calificaciones que desea capturar: ");
                //leer la cantidad de calificaciones
                num_calificaciones = sc.nextInt();
                for(int contador = 1; contador <= num_calificaciones; contador++){
                    //contar y convertir los valores en double
                    System.out.println("Ingrese la calificacion numero " + contador + ": ");
                    //leer la calificacion de cada ciclo
                    calificacion = sc.nextDouble();
                    //sumar al final de cada ciclo para guardar nuevos valores a promedio
                    promedio = promedio + calificacion;
            }
                //utilizar nueva variable para guardar el verdadero promedio
                promedio_final = promedio / num_calificaciones;
                System.out.println("El promedio final es: " + promedio_final);
            }
            case 2->{
                //programa de gestion de compra y venta de cajas
                reto2 ventas = new reto2(); //objeto nuevo
                ventaCajas programa = ventas.new ventaCajas("alan", "123");
                programa.iniciar_programa();
            }
            default -> System.out.println("Selección no válida");
        }
        sc.close();
    }
    public class ventaCajas{
        Scanner sc = new Scanner(System.in);
        //variables de registro de administrador y operaciones totales
        private String admin_usuario, admin_password;
        private int num_compras = 0;
        private int num_operaciones = 0;
        //egresos e ingresos por compras y ventas
        private double egresos_compras = 0;
        private double ingresos_ventas = 0;
        
        //constructor donde se declaran variables de usuario y contrasenia
        public ventaCajas(String user, String pass){
            this.admin_password = pass;
            this.admin_usuario = user;
        }
        
        private void inicio_sesion(){
            //inicializacion de variables de usuario y contrasenia 
            String usuario = "", pass = "";
            //si el usuario o contraseña que introduce es incorrecto entonces se preguntará de nuevo
            while(admin_usuario.equals(usuario) == false && (admin_password.equals(pass) == false)){
                System.out.println("Ingrese el usuario: ");
                usuario = sc.next();
                System.out.println("Ingrese la contrasenia: ");
                pass = sc.next();
                //cuando el usuario y contraseña son correctos correr programa
                if(admin_usuario.equals(usuario) == true && (admin_password.equals(pass) == true)){
                    System.out.println("Inicio de sesion");
                    break;
                }
                else{
                    System.out.println("Reintentar el inicio");
                }
            }
        }
        public void iniciar_programa(){
            inicio_sesion();
            System.out.println("Bienvenido al control de compra y venta de cajas");
            char opcion = '.';
            while (opcion!= 'S'){
                System.out.println("Escoge una opcion: \nA: Comprar cajas de papel \nB: Vender cajas de papel"
                        + " \nC: Mostrar reporte \nS: Salir del programa");
                //lectura de cada char para iniciar mi operacion
                opcion = sc.next().charAt(0);
                switch(opcion){
                    case 'A' ->{
                        //variables exclusivas de esta opcion
                        int num_compras;
                        double precio;
                        double monto;
                        System.out.println("Bienvenido a la seccion de compra de cajas."
                                + "\nEscribe las cajas que vas a comprar: ");
                        num_compras = sc.nextInt();
                        System.out.println("Escribe el precio de cada caja: ");
                        precio = sc.nextFloat();
                        monto = precio * num_compras;
                        System.out.println("La compra realizada por " + num_compras + " cajas al costo: $" + precio + " es igual a: $" + monto);
                        //la variable de compras totales aumenta cada vez que esta operacion se realice
                        num_compras ++;
                        //la variable num_operaciones funciona para guardar todas las operaciones realizadas durante el programa
                        num_operaciones ++;
                        //los egresos se guardan y se restan por cada compra realizada
                        egresos_compras = egresos_compras - monto;
                    }
                    case 'B' ->{
                        int num_ventas;
                        double precio_ventas;
                        double monto_ventas;
                        System.out.println("Bienvenido a la seccion de venta de cajas \nEscribe las cajas que vas a vender: ");
                        num_ventas = sc.nextInt();
                        System.out.println("Escribe el precio de cada caja: ");
                        precio_ventas = sc.nextFloat();
                        monto_ventas = precio_ventas * num_ventas;
                        System.out.println("La venta realizada por " + num_ventas + " cajas al costo: $" + precio_ventas + " es igual a: $" + monto_ventas);
                        num_ventas ++;
                        num_operaciones ++;
                        ingresos_ventas = ingresos_ventas + monto_ventas;
                        
                    }
                    case 'S' ->{
                        break;
                    }
                    default -> System.out.println("Seleccion no valida");
                }
            }
                //codigo de salida
                System.out.println("Reporte de control:");

                }
    }
}