
//@author usuario

import java.io.*;


public class Ejercicio1 {
    /* crea un fichero txt llamado ejer1 que escriba el siguiente array de 8 posiciones
        String[] linea ={"uno","dos","tres","cuatro","cinco","seis","siete","..."}
        a continuacion debe mostrar el contenido del fichero por pantalla
    */
    
    public static void main(String[] args) {
        
        try {
            
            FileWriter fw = new FileWriter(new File("C:\\Users\\usuario\\Desktop\\daw1\\fichero.txt"));
            FileReader fr = new FileReader(new File("C:\\Users\\usuario\\Desktop\\daw1\\fichero.txt"));
           
            String[] linea ={"uno","dos","tres","cuatro","cinco","seis","siete","..."};
            
            for (int i = 0; i <linea.length ; i++) {
                fw.write(linea[i]+" ");
            }
            fw.close();
            
            int valor = 0;
            while (valor!= -1) {
                valor = fr.read();
                System.out.print((char)valor);  
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error de mierda"+ e);
        }
    }
}
