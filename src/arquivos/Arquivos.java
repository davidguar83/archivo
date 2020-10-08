/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
///home/dam2a/Escritorio/prueba/boletin1.odt
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cadea a1 = new Cadea();
        Cadea a2 = new Cadea();

        // a1.eDirectorio();
        // a2.creaDirectorio();
        // a2.modoAcceso();
        a2.comprobarLonxitude();
        a2.mEscritura();
        a2.mLectura();
a2.borrarDirectorio();
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

    public void creafichero() {

        File ruta = new File(r);

        if (ruta.exists()) {

            try {
                ruta.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {

            System.out.println("Imposible crear el archivo ruta incorrecta");

        }

    }

    public void modoAcceso() {

        File ruta = new File(r);

        if (ruta.exists()) {

            if (ruta.isFile()) {

                if (ruta.canRead()) {

                    System.out.println(" Se pode leer");

                } else {

                    System.out.println(" Non se pode leer");

                }

                if (ruta.canWrite()) {

                    System.out.println("Se pode escribir");

                } else {

                    System.out.println("Non se pode escribir");

                }

            } else {
                System.out.println("La ruta no contiene ningun archivo");

            }
        } else {

            System.out.println("Ruta no exisitente");

        }

    }

    public void comprobarLonxitude() {

        File ruta = new File(r);

        System.out.println(ruta.length());

    }

    public void mLectura() {

        File ruta = new File(r);

        ruta.setReadOnly();

        System.out.println(" permiso lectura = " + ruta.canRead());

    }

    public void mEscritura() {

        File ruta = new File(r);

        ruta.setWritable(false);

        System.out.println("permisos escritura = " + ruta.canWrite());

    }

    public void borrarFichero() {

        File ruta = new File(r);

        ruta.delete();

    }

    public void borrarDirectorio() {

        File ruta = new File(r);

        if (ruta.exists()) {

            ruta.delete();
            

        } else {

            System.out.println("ruta inexistente ou con descencencia");

        }
    }

}
