package evidencia1;

public class Medicamento{
    private String nombreQuimico, nombreGenerico, nombreRegistrado;
    private float precioPublico, precioVenta;
    Presentaciones presentacion;
    //numeracion de presentaciones para comparar
    private enum Presentaciones {
        SOLIDO,
        SEMISOLIDO,
        LIQUIDO,
        NODEF
    }
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, float precioPublico, char presentacionTipo){
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        switch(presentacionTipo){
            case '1'->{
                this.presentacion = Presentaciones.SOLIDO;
                this.precioVenta = precioPublico + (precioPublico * 0.09f);
            }
            case '2'->{
                this.presentacion = Presentaciones.SEMISOLIDO;
                this.precioVenta = precioPublico + (precioPublico * 0.12f);
            }
            case '3'->{
                this.presentacion = Presentaciones.LIQUIDO;
                this.precioVenta = precioPublico + (precioPublico * 0.13f);
            }
            default-> {
                this.presentacion = Presentaciones.NODEF;
                this.precioVenta = precioPublico + (precioPublico * 0.1f);
            }
        }
    }
    public void imprimirDatos(){
        String definirPresentacion;
        System.out.println("Nombre Químico: " + nombreQuimico);
        System.out.println("Nombre Genérico: " + nombreGenerico);
        System.out.println("Nombre Registrado: " + nombreRegistrado);
        System.out.println("Precio al público: $" + precioPublico);
        System.out.println("Precio de venta: $" + precioVenta);
        definirPresentacion = switch(presentacion){
            case Presentaciones.SOLIDO->"Sólido";
            case Presentaciones.LIQUIDO->"Líquido";
            case Presentaciones.SEMISOLIDO->"Semi Sólido";
            default->"No tiene presentacion definida";
        };
        System.out.println("Presentación: " + definirPresentacion);
    }
}
