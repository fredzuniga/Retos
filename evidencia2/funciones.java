package evidencia2;

public class funciones {
    public static String generarClave(String texto){
        String clave = " ";
        String [] palabras = texto.split(" ");

        for(int i = 0; i < palabras.length; i++){
            clave += palabras[i].charAt(0);
        }
        return clave.toUpperCase();
    }

    //Agregar un catalogo de generos
    
}
