    //Reto 1 **Indice de masa corporal**    Alan Bauza
import java.io.*;
public class reto1 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        //throws IOException evita errores de lectura de datos
        char opcion;
        System.out.println("Elija una opcion: \tA: Calculo del indice de masa corporal "
                + "\tB: Calculo del indice de masa corporal magra"
                + "\tC: Calculo de gasto energetico basal");
        opcion = entrada.readLine().charAt(0);
        //charAt busca el un char dentro de un string en la posicion indicada
        switch(opcion){
            case 'A' -> {
                //Calculo del IMC
                float peso_kilos;
                float estatura_cm;
                System.out.println("Escriba su peso en kg: ");
                peso_kilos = Float.parseFloat(entrada.readLine());
                //convertir "entrada" en un float
                System.out.println("Ahora escriba su estatura en cm: ");
                estatura_cm = Float.parseFloat(entrada.readLine());
                float IMC;
                IMC = peso_kilos/(estatura_cm * estatura_cm);
                if (IMC < 18.5){
                    System.out.println("Tiene un peso bajo");
                }
                else if (IMC > 18.5 && IMC < 24.99){
                    System.out.println("Tiene un peso normal");
                }
                else if (IMC > 25 && IMC < 29.99){
                    System.out.println("Tiene sobrepeso");
                }
                else if (IMC > 30 && IMC < 34.99){
                    System.out.println("Tiene obesidad leve");
                }
                else if (IMC > 35 && IMC < 39.99){
                    System.out.println("Tiene obesidad media");
                }
                else if (IMC > 40){
                    System.out.println("Tiene obesidad morbida");
                }
                else {
                    System.out.println("Estos datos no son correctos");
                }
            }
            case 'B' -> {
                //Calculo de masa corporal magra
                float peso_kg;
                float estatura_cm;
                //MCM = Masa Corporal Magra
                float MCM;
                char sexo;
                System.out.println("Escriba su sexo: \tM: Masculino \tF: Femenino");
                sexo = entrada.readLine().charAt(0);
                switch(sexo){
                    case 'M' -> {
                        //Calculo masculino
                        System.out.println("Escriba su peso en kilogramos: ");
                        peso_kg = Float.parseFloat(entrada.readLine());
                        System.out.println("Escriba su estatura en centimetros: ");
                        estatura_cm = Float.parseFloat(entrada.readLine());
                        MCM = (float) ((1.1 * peso_kg) - (128.0 * (Math.pow(peso_kg,2) / Math.pow(estatura_cm,2))));
                        System.out.println("Su indice de masa corporal magra es: " + MCM);
                    }
                    case 'F' -> {
                        //Calculo femenino
                        System.out.println("Escriba su peso en kilogramos: ");
                        peso_kg = Float.parseFloat(entrada.readLine());
                        System.out.println("Escriba su estatura en centimetros: ");
                        estatura_cm = Float.parseFloat(entrada.readLine());
                        MCM =  (float) ((1.07 * peso_kg) - (148.0 * (Math.pow(peso_kg,2) / Math.pow(estatura_cm,2))));
                        System.out.println("Su indice de masa corporal magra es: " + MCM);
                    }
                    default -> System.out.println("Sexo no identificado en este programa");
                }
            }
            case 'C' -> {
                //Calculo del metabolismo basal
                float peso_kg;
                float estatura_cm;
                int edad;
                char sexo;
                //Gasto Energetico Basal
                float GEB;
                System.out.println("Escriba su peso: ");
                peso_kg = Float.parseFloat(entrada.readLine());
                System.out.println("Escriba su estatura en cm: ");
                estatura_cm = Float.parseFloat(entrada.readLine());
                System.out.println("Escriba su edad: ");
                edad = Integer.parseInt(entrada.readLine());
                System.out.println("Escriba su sexo: \tM: Masculino \tF: Femenino");
                sexo = entrada.readLine().charAt(0);
                switch(sexo){
                    case 'M' -> {
                        GEB = (float) (66.5 + (13.75 * peso_kg) + (5.003 * estatura_cm) - (6.775 * edad));
                        System.out.println("Su GEB es de " + GEB + " calorias.");
                    }
                    case 'F' -> {
                        GEB = (float) (655.1 + (9.563 * peso_kg) + (1.85 * estatura_cm) - (4.676 * edad));
                        System.out.println("Su GEB es de " + GEB + " calorias.");
                    }
                }
            }
            default -> System.out.println("Opción no válida");
        };
    }
}

