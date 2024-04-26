package reto7;

import java.io.IOException;

/*
 * Reto 7: Venta de cafe y simulacion de cafetera
 * Por: Alan Bauza Alfonso
 */
public class VentaCafe {
    public static void main(String[] args) throws IOException {
        Cafetera cafeTecmi = new Cafetera(3000, 2000, 2000);

        //cafeTecmi.servirTaza(new VasoCafe(120, 50, 1,"Vaso de cafe pequeño sin azucar", false, 0, 10.50));
        //cafeTecmi.mostrarInsumos();
        cafeTecmi.comprar();
        cafeTecmi.cambioPago();
    }
}
