/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
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

        Cadea a1 = new Cadea();

        a1.eDirectorio();

    }
}

class Cadea {

    public static String ruta;

    public String r = JOptionPane.showInputDialog("Introduce ruta");

    ;
    
    
    public void eDirectorio() {

        File ruta = new File(r);

        String ruta_destino = ruta.getAbsolutePath();

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
}
