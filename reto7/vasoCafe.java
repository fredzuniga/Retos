package reto7;

public class vasoCafe{
    private int capacidadAgua;
    private int capacidadCafe;
    private int tipoVaso;   //1...6
    private boolean contieneAzucar;
    private double precioVaso;

    //constructor vacio
    public vasoCafe(){}

    public vasoCafe(int capacidadAgua, int capacidadCafe, int tipoVaso, boolean contieneAzucar, double precioVaso) {
        this.capacidadAgua = capacidadAgua;
        this.capacidadCafe = capacidadCafe;
        this.tipoVaso = tipoVaso;
        this.contieneAzucar = contieneAzucar;
        this.precioVaso = precioVaso;
    }

    public int getCapacidadAgua() {
        return capacidadAgua;
    }

    public void setCapacidadAgua(int capacidadAgua) {
        this.capacidadAgua = capacidadAgua;
    }

    public int getCapacidadCafe() {
        return capacidadCafe;
    }

    public void setCapacidadCafe(int capacidadCafe) {
        this.capacidadCafe = capacidadCafe;
    }

    public int getTipoVaso() {
        return tipoVaso;
    }

    public void setTipoVaso(int tipoVaso) {
        this.tipoVaso = tipoVaso;
    }

    public boolean isContieneAzucar() {
        return contieneAzucar;
    }

    public void setContieneAzucar(boolean contieneAzucar) {
        this.contieneAzucar = contieneAzucar;
    }

    public double getPrecioVaso() {
        return precioVaso;
    }

    public void setPrecioVaso(double precioVaso) {
        this.precioVaso = precioVaso;
    }
    
}