
//Hicham
/*
Crea un programa que pida al usuario el nombre de un fichero y una palabra a buscar
en él. Debe mostrar en pantalla todas las líneas del fichero que contengan esa palabra.
*/
import java.io.*;
import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
       try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\daw1\\Ejercicio7.txt"));
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la palabra que quiere buscar ");
            String palabra = sc.nextLine();
            
            String linea = br.readLine();
            while ((linea =br.readLine()) != null) { 
                
                if (linea.contains(palabra)) {
                    System.out.println(linea);
                }
            }br.close();
        } catch (Exception e) {
            System.out.println("Esto es un error de mierda: "+e);
        } 
    }
}