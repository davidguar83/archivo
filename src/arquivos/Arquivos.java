/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cadea a1 = new Cadea();
        Cadea a2 = new Cadea();

        // a1.eDirectorio();
        a2.creaDirectorio();

    }
}

class Cadea {

    public static String ruta;

    public String r = JOptionPane.showInputDialog("Introduce ruta");

    ;
    
    
    public void eDirectorio() {

        File ruta = new File(r);

       // String ruta_destino = ruta.getAbsolutePath();

        System.out.println(ruta.getAbsolutePath());

        System.out.println(ruta.exists());

        if (ruta.exists()) {

            if (ruta.isDirectory()) {

                System.out.println("E un directorio");

            } else {

                System.out.println(" Non existe directorio");

            }

            if (ruta.isFile()) {

                System.out.println("E un archivo");

            } else {

                System.out.println("Non e un archivo");

            }

        } else {

            System.out.println("Ruta no exisitente");

        }

    }
    
    public void creaDirectorio() {

        File ruta = new File(r);

        if (ruta.exists()) {

            if (ruta.isDirectory()) {

                System.out.println("El directorio ya existe, imposible crearlo, cambie el nombre ");

            }

        } else {

            ruta.mkdir();
            System.out.println(ruta.getAbsolutePath());

        }

    }
    
    
    public void creafichero(){
    
     File ruta = new File(r);
    
    if (ruta.exists()) {
       
        
         try {
             ruta.createNewFile();
         } catch (IOException e) {
             e.printStackTrace();
         }
        
    }else{
        
        System.out.println("Imposible crear el archivo ruta incorrecta");
        
        
    }
    
    }
    
    
    
    
    
    

}
