/*
 * Reto 7: Emulacion de cafetera CAFETECMI
 * Por: Alan Bauza Alfonso
 */

package reto7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VentaCafe {
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static Cafetera cafeTecmi;

    public static void main(String[] args) throws IOException {
        cafeTecmi = new Cafetera(3000, 2000, 2000); // Ejemplo de capacidades máximas

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = Integer.parseInt(entrada.readLine());

            switch (opcion) {
                case 1 -> cafeTecmi.agregarCafe();
                case 2 -> cafeTecmi.vaciarInsumos();
                case 3 -> cafeTecmi.mostrarInsumos();
                case 4 -> {
                    cafeTecmi.comprar();
                    cafeTecmi.cambioPago();
                }
                case 5 -> {
                    mostrarReporteVentas();
                    salir = true;
                    System.out.println("Gracias por utilizar CAFETECMI. ¡Hasta luego!");
                }
                default-> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- BIENVENIDO A CAFETECMI: MENÚ PRINCIPAL ---");
        System.out.println("1. Agregar café a la cafetera");
        System.out.println("2. Vaciar insumos de la cafetera");
        System.out.println("3. Mostrar insumos disponibles");
        System.out.println("4. Realizar compra");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opción:");
    }

    private static void mostrarReporteVentas(){
        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println("Importe total de venta: $" + cafeTecmi.calcularTotalVenta());
        System.out.println("Total de tazas vendidas: " + cafeTecmi.getConteoVasosCafe());
        System.out.println("Desglose detallado de las tazas vendidas:");
        for (VasoCafe vaso : cafeTecmi.getDetalleVasosVendidos()) {
            System.out.println("- " + vaso.getNombreTipoVaso() + " - Precio: $" + vaso.getPrecioVaso());
        }
        System.out.println("INSUMOS SOBRANTES EN LA CAFETERA: ");
        cafeTecmi.mostrarInsumos();
    }
}