package evidencia1;

public class Medicamento {
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    //private double precioVenta;
    private int formaFarmaceutica;

    /*
     * seleccionar todas las variables y crear constructor con el foquito
     */
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico,
            double precioVenta, int formaFarmaceutica) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.formaFarmaceutica = formaFarmaceutica;
        //this.precioVenta = precioVenta;
    }

    //constructor vacio
    public Medicamento(){}

    //constructor exclusivo del nombreQuimico
    public Medicamento(String nombreQuimico) {
        this.nombreQuimico = nombreQuimico;
    }

    public String getNombreQuimico() {
        return nombreQuimico;
    }
    public void setNombreQuimico(String nombreQuimico) {
        this.nombreQuimico = nombreQuimico;
    }
    public String getNombreGenerico() {
        return nombreGenerico;
    }
    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }
    public String getNombreRegistrado() {
        return nombreRegistrado;
    }
    public void setNombreRegistrado(String nombreRegistrado) {
        this.nombreRegistrado = nombreRegistrado;
    }
    public double getPrecioPublico() {
        return precioPublico;
    }
    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }
    /*public double getPrecioVenta() {
        //TODO modificar para devolver con porcentaje
        return precioVenta;
    }*/
    public double getPrecioVentaPorcentaje(){
        double precioFinal = 0;
        switch(formaFarmaceutica){
            case 1 ->{
                precioFinal = precioPublico * 0.09;
            }
            case 2 ->{
                precioFinal = precioPublico * 0.12;
            }
            case 3 ->{
                precioFinal = precioPublico * 0.13;
            }
        }
        return precioFinal;
    }
    public int getFormaFarmaceutica() {
        return formaFarmaceutica;
    }
    public void setFormaFarmaceutica(int formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }   
    
}