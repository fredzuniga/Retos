/*
 * Por: Alan Bauza Alfonso
 * Tema 5: try and catch con uso de archivos
 */

package tema5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class tema5 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int valor;
        System.out.println("Ingresa un dato: ");
        /*
         * Identificar si hay un archivo especifico o no
         */
        try{
            valor = Integer.parseInt(entrada.readLine());
            //
            File file = new File("C:\\Users\\Alan0\\OneDrive\\Documentos\\Tecmilenio 2do\\Programación orientada a objetos\\Retos\\tema5\\test1.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                //tomar el primer valor de los datos en el archivo
                String line = scanner.nextLine();
                String [] datos = line.split(",");
                if(datos[0].equals("groseria")){
                    throw new GroseriaDetectada("El nombre contiene una palabra no debida: " + datos[0]);
                }
                System.out.println(datos[0]);
            }
            scanner.close();
        }
        /*
         * Errores por si no esta el archivo o excepciones del input
         * ArrayIndexOutOfBounds significa cuando falta un dato dentro del archivo
         */
        catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException");
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println("IOException");
            System.out.println(ex.getMessage());
        }
        catch (NumberFormatException ex){
            System.out.println("NumberFormatException");
            System.out.println(ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(ex.getMessage());
        }
        //excepcion creada por mi
        catch (GroseriaDetectada ex){
            System.out.println("GroseriaDetectada");
            System.out.println(ex.getMessage());
        }
    }
}
