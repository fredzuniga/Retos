package reto7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Cafetera {
    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private int capacidadMaximaAgua;
    private int capacidadMaximaCafe;
    private int capacidadMaximaAzucar;
    
    private int cantidadActualAgua;
    private int cantidadActualCafe;
    private int cantidadActualAzucar;

    private int conteoVasosCafe;
    private ArrayList<VasoCafe> detalleVasosVendidos;

    private VasoCafe[] tiposVasosCafetera;
    
    public Cafetera(int capacidadMaximaAgua, int capacidadMaximaCafe, int capacidadMaximaAzucar) {
        this.capacidadMaximaAgua = capacidadMaximaAgua;
        this.capacidadMaximaCafe = capacidadMaximaCafe;
        this.capacidadMaximaAzucar = capacidadMaximaAzucar;

        cantidadActualAgua = capacidadMaximaAgua;
        cantidadActualCafe = capacidadMaximaCafe;
        cantidadActualAzucar = capacidadMaximaAzucar;

        conteoVasosCafe = 0;
        detalleVasosVendidos = new ArrayList<VasoCafe>();

        tiposVasosCafetera = new VasoCafe[6];
        tiposVasosCafetera[0] = new VasoCafe(120, 30, 1, "Vaso de cafe pequeño sin azucar", false, 0, 10.50);
        tiposVasosCafetera[1] = new VasoCafe(120, 30, 2, "Vaso de cafe pequeño con azucar", true, 5, 14.50);
        tiposVasosCafetera[2] = new VasoCafe(220, 50, 3, "Vaso de cafe mediano con azucar", true, 10, 24.50);
        tiposVasosCafetera[3] = new VasoCafe(220, 50, 4, "Vaso de cafe mediano sin azucar", false, 0, 34.50);
        tiposVasosCafetera[4] = new VasoCafe(320, 80, 5, "Vaso de cafe grande con azucar", true, 15, 34.50);
        tiposVasosCafetera[5] = new VasoCafe(320, 80, 6, "Vaso de cafe grande sin azucar", false, 0, 39.50);
    }

    public void servirTaza(VasoCafe vasoAServir){
        cantidadActualAgua -= vasoAServir.getCapacidadAgua();
        cantidadActualCafe -= vasoAServir.getCapacidadCafe();
        //restar el azucar solo si contiene azucar la taza
        if(vasoAServir.getContieneAzucar()){
            cantidadActualAzucar -= vasoAServir.getCapacidadAzucar();
        }
        detalleVasosVendidos.add(vasoAServir);
        conteoVasosCafe++;
    }
    public void agregarCafe() throws IOException {
        System.out.println("Indique la cantidad de café a agregar: ");
        int cantidadAgregarCafe = Integer.parseInt(entrada.readLine());
        
        int sumaCafe = cantidadActualCafe + cantidadAgregarCafe;
        
        if (sumaCafe > capacidadMaximaCafe) {
            System.out.println("No se puede agregar más café, la cafetera se desbordaría.");
            System.out.println("Solo se puede agregar: " + (capacidadMaximaCafe - cantidadActualCafe) + " gramos.");
        } else {
            cantidadActualCafe += cantidadAgregarCafe;
            System.out.println("Se agregaron " + cantidadAgregarCafe + " gramos de café.");
            System.out.println("Cantidad actual de café: " + cantidadActualCafe + " gramos.");
        }
    }
    /*
    //agregar cafe dependiendo de cuanto quiera agregar
    public void agregarCafe(int cantidadAgregarCafe) throws IOException{
        int sumaCafe = cantidadActualCafe + cantidadAgregarCafe;
        if(cantidadActualCafe == capacidadMaximaCafe){
            System.out.println("No se puede agregar mas cafe --> cafetera llena");
        }
        else{
            System.out.println("Indique la cantidad de cafe a agregar: ");
            cantidadAgregarCafe = Integer.parseInt(entrada.readLine());
            
            if(sumaCafe > capacidadMaximaCafe){
                System.out.println("No se puede agregar mas cafe --> se desborda la cafetera");
                System.out.println("Solo se puede agregar: " + (capacidadMaximaCafe - sumaCafe));
            }
            cantidadActualCafe += cantidadAgregarCafe;
            System.out.println("Cantidad actual: " + cantidadActualCafe + " gramos");
        }
    }
    */
    //limpieza de maquina
    public void vaciarInsumos(){
        cantidadActualAgua = 0;
        cantidadActualCafe = 0;
        cantidadActualAzucar = 0;
        System.out.println("Insumos vaciados");
    }

    public void mostrarInsumos(){
        System.out.println("Cantidad de agua disponible: " + cantidadActualAgua);
        System.out.println("Cantidad de cafe disponible: " + cantidadActualCafe);
        System.out.println("Cantidad de azucar disponible: " + cantidadActualAzucar);
    }

    //compra de cafe
    public void comprar() throws IOException {
        System.out.println("Bienvenido al sistema de cafetera");
        System.out.println("Indica la cantidad de vasos que vas a comprar: ");
        int cantidadTazas = Integer.parseInt(entrada.readLine());
        
        for (int i = 0; i < cantidadTazas; i++) {
            System.out.println("Elige el tipo de vaso de café a comprar: ");
            System.out.println(tiposVasosCafetera[0].getTipoVaso() +".- " + tiposVasosCafetera[0].getNombreTipoVaso() + " - Precio: $"+ tiposVasosCafetera[0].getPrecioVaso());
            System.out.println(tiposVasosCafetera[1].getTipoVaso() +".- " + tiposVasosCafetera[1].getNombreTipoVaso() + " - Precio: $" + tiposVasosCafetera[1].getPrecioVaso());
            System.out.println(tiposVasosCafetera[2].getTipoVaso() +".- " + tiposVasosCafetera[2].getNombreTipoVaso() + " - Precio: $"+ tiposVasosCafetera[2].getPrecioVaso());
            System.out.println(tiposVasosCafetera[3].getTipoVaso() +".- " + tiposVasosCafetera[3].getNombreTipoVaso() + " - Precio: $" + tiposVasosCafetera[3].getPrecioVaso());
            System.out.println(tiposVasosCafetera[4].getTipoVaso() +".- " + tiposVasosCafetera[4].getNombreTipoVaso() + " - Precio: $"+ tiposVasosCafetera[4].getPrecioVaso());
            System.out.println(tiposVasosCafetera[5].getTipoVaso() +".- " + tiposVasosCafetera[5].getNombreTipoVaso() + " - Precio: $" + tiposVasosCafetera[5].getPrecioVaso());
            int opcion = Integer.parseInt(entrada.readLine());
            
            if (opcion >= 1 && opcion <= 6) {
                VasoCafe vaso = tiposVasosCafetera[opcion - 1];
                //si hay suficiente de cada insumo hacer la operación, si no, no hacerla
                if (cantidadActualAgua >= vaso.getCapacidadAgua() && cantidadActualCafe >= vaso.getCapacidadCafe() && cantidadActualAzucar >= vaso.getCapacidadAzucar()) {
                    servirTaza(vaso);
                    System.out.println("Taza de café servida: " + vaso.getNombreTipoVaso());
                } else {
                    System.out.println("Lo siento, no hay suficientes ingredientes para servir esta taza de café.");
                }
            } else {
                System.out.println("Opción inválida, por favor elige una opción válida (1-6).");
            }
        }
    }

    //realizar el calculo del cambio que se hara al usuario una vez comprado
    public void cambioPago() throws IOException {
        // Mostrar la cuenta detallada de los vasos de café vendidos
        System.out.println("Cuenta detallada:");
        for (int i = 0; i < detalleVasosVendidos.size(); i++) {
            VasoCafe vaso = detalleVasosVendidos.get(i);
            System.out.println("Taza " + (i + 1) + ": " + vaso.getNombreTipoVaso() + " - Precio: $" + vaso.getPrecioVaso());
        }
        
        // Calcular el total a pagar
        double totalPagar = 0;
        for (VasoCafe vaso : detalleVasosVendidos) {
            totalPagar += vaso.getPrecioVaso();
        }
        System.out.println("Total a pagar: $" + totalPagar);
        
        // Solicitar al usuario que ingrese la cantidad de dinero pagada
        System.out.println("Ingrese la cantidad de dinero pagada por el cliente: ");
        double montoPagado = Double.parseDouble(entrada.readLine());
        
        // Verificar si el monto pagado es suficiente
        if (verificarPagoSuficiente(montoPagado, totalPagar)) {
            // Calcular el cambio
            double cambio = montoPagado - totalPagar;
            System.out.println("Cambio a devolver: $" + cambio);
    
            // Calcular cantidad de monedas de cada denominación
            int[] denominaciones = {10, 5, 2, 1, 0}; // 0 para representar los 50 centavos
            int[] cantidadMonedas = new int[5];
            
            for (int i = 0; i < denominaciones.length; i++) {
                if (cambio >= denominaciones[i]) {
                    cantidadMonedas[i] = (int) (cambio / denominaciones[i]);
                    cambio -= cantidadMonedas[i] * denominaciones[i];
                }
            }
            
            // Mostrar el desglose de monedas
            String[] nombresDenominaciones = {"$10", "$5", "$2", "$1", "50c"};
            for (int i = 0; i < denominaciones.length; i++) {
                System.out.println("Cantidad de monedas de " + nombresDenominaciones[i] + ": " + cantidadMonedas[i]);
            }
        } else {
            System.out.println("Lo siento, el monto pagado es insuficiente. Se necesita pagar $" + totalPagar);
        }
    }    
    
    public boolean verificarPagoSuficiente(double montoPagado, double totalPagar) {
        return montoPagado >= totalPagar;
    }
    
    /*
     * Getters y setters
     */
    public int getCapacidadMaximaAgua() {
        return capacidadMaximaAgua;
    }

    public void setCapacidadMaximaAgua(int capacidadMaximaAgua) {
        this.capacidadMaximaAgua = capacidadMaximaAgua;
    }

    public int getCapacidadMaximaCafe() {
        return capacidadMaximaCafe;
    }

    public void setCapacidadMaximaCafe(int capacidadMaximaCafe) {
        this.capacidadMaximaCafe = capacidadMaximaCafe;
    }

    public int getCapacidadMaximaAzucar() {
        return capacidadMaximaAzucar;
    }

    public void setCapacidadMaximaAzucar(int capacidadMaximaAzucar) {
        this.capacidadMaximaAzucar = capacidadMaximaAzucar;
    }

    public int getCantidadActualAgua() {
        return cantidadActualAgua;
    }

    public void setCantidadActualAgua(int cantidadActualAgua) {
        this.cantidadActualAgua = cantidadActualAgua;
    }

    public int getCantidadActualCafe() {
        return cantidadActualCafe;
    }

    public void setCantidadActualCafe(int cantidadActualCafe) {
        this.cantidadActualCafe = cantidadActualCafe;
    }

    public int getCantidadActualAzucar() {
        return cantidadActualAzucar;
    }

    public void setCantidadActualAzucar(int cantidadActualAzucar) {
        this.cantidadActualAzucar = cantidadActualAzucar;
    }

    public int getConteoVasosCafe() {
        return conteoVasosCafe;
    }

    public void setConteoVasosCafe(int conteoVasosCafe) {
        this.conteoVasosCafe = conteoVasosCafe;
    }

    public ArrayList<VasoCafe> getDetalleVasosVendidos() {
        return detalleVasosVendidos;
    }

    public void setDetalleVasosVendidos(ArrayList<VasoCafe> detalleVasosVendidos) {
        this.detalleVasosVendidos = detalleVasosVendidos;
    }
    
}
