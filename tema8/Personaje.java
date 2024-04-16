package tema8;

public class Personaje {
    private int nivelVida;  // 1-100
    private String nameTag;

    //constructor vacio despues siendo llenado (parametros obligatorios)
    public Personaje(int nivelVida, String nameTag){
        this.nivelVida = nivelVida; //referencia al atributo local al que se le asigna un parametro (= nivelVida)
        this.nameTag = nameTag;
    }
    //constructor vacio (sin parametros)
    public Personaje(){}

    //sobrecarga de constructores (parametro de objeto tipo Personaje)
    /*
     * asignar valores de otro objeto a este nuevo objeto
     */
    public Personaje(Personaje PersonajeParametro){
        nivelVida = PersonajeParametro.getNivelVida();  //getnivelVida para obtener la vida del objeto Personaje
        nameTag = PersonajeParametro.getNameTag();
    }

    //getters y setters (get para obtener y set para modificar)
    public int getNivelVida() {
        return nivelVida;
    }
    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
    public String getNameTag() {
        return nameTag;
    }
    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }
    
}
