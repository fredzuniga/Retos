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
        tiposVasosCafetera[0] = new VasoCafe(120, 50, 1,"Vaso de cafe pequeño sin azucar", false, 0, 10.50);
        tiposVasosCafetera[1] = new VasoCafe(120, 50, 2,"Vaso de cafe pequeño con azucar", true, 20, 14.50);
        tiposVasosCafetera[2] = new VasoCafe(220, 80, 3,"Vaso de cafe mediano con azucar", true, 35, 24.50);
        tiposVasosCafetera[3] = new VasoCafe(220, 80, 4, "Vaso de cafe mediano sin azucar", false, 0, 34.50);
        tiposVasosCafetera[4] = new VasoCafe(320, 100, 5, "Vaso de cafe grande con azucar", true, 50, 34.50);
        tiposVasosCafetera[5] = new VasoCafe(320, 100, 6, "Vaso de cafe grande sin azucar", false, 0, 39.50);
    }

    public void servirTaza(VasoCafe vasoAServir){
        cantidadActualAgua -= vasoAServir.getCapacidadAgua();
        cantidadActualCafe -= vasoAServir.getCapacidadCafe();
        //restar el azucar solo si contiene azucar la taza
        if(vasoAServir.getContieneAzucar()){
            cantidadActualAzucar -= vasoAServir.getCapacidadAzucar();
            detalleVasosVendidos.add(vasoAServir);
        }
    }

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
