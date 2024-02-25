/*
 * Reto 5: Farmacia
 * Por: Alan Bauza Alfonso
 */
import java.util.ArrayList;

public class reto5 {

    public static void main(String[] args) {
        //creacion del arraylist
        ArrayList<Object> carritoCompra = new ArrayList<>();
        int contadorProductos = 0;
        double precioTotal = 0.0;

        /* Ejemplo con strings
        carritoCompra.add("Camisa");
        carritoCompra.add("Pantalon");
        carritoCompra.add("Pantalon");
        carritoCompra.add("Pantalon");
        carritoCompra.add(1, "Cinturon");
        System.out.println(carritoCompra.size());
        System.out.println(carritoCompra);
        System.out.println(carritoCompra.get(0));
        System.out.println(carritoCompra.isEmpty());
        */

        //creacion y compra de producto "camisa"
        Producto c = new Producto("Camisa", 2, 450.89);
        carritoCompra.add(c);

        //creacion y compra del producto "cinturon"
        carritoCompra.add(new Producto("Cinturon", 2, 356.90));

        System.out.println("Productos en el carrito:");

        for (Object p : carritoCompra) {
                Producto producto = (Producto) p;
                System.out.println("Producto " + producto.nombreProducto + " pagar: "
                + (producto.cantidadProducto * producto.precio));
            /*Producto c2 = (Producto)carrito_compra.get(0);
            System.out.println(c2.nombreProducto);*/
                contadorProductos += producto.cantidadProducto;
                precioTotal += (producto.cantidadProducto * producto.precio);
        }

        System.out.println("Total de productos en el carrito: " + contadorProductos);
        System.out.println("Precio total de la compra: " + precioTotal);
    }

    public static class Producto {
        public String nombreProducto;
        public int cantidadProducto;
        public double precio;

        /*
         * Constructores para diversos tipos de productos
         */
        public Producto() {
        }

        public Producto(String nombreProducto, int cantidadProducto) {
            this.nombreProducto = nombreProducto;
            this.cantidadProducto = cantidadProducto;
        }

        public Producto(String nombreProducto, int cantidadProducto, double precio) {
            this.nombreProducto = nombreProducto;
            this.cantidadProducto = cantidadProducto;
            this.precio = precio;
        }
    }
}