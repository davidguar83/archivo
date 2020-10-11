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

        //  Cadea ejercicio1 = new Cadea(); 
        // Cadea ejercicio2 = new Cadea();
        //Cadea ejercicio3 = new Cadea();
        //Cadea ejercicio3b = new Cadea();
        // Cadea ejercicio4 = new Cadea(); 
        // Cadea ejercicio5a = new Cadea(); 
        //Cadea ejercicio6 = new Cadea(); 
        //  Cadea ejercicio7 = new Cadea(); 
        // Cadea ejercicio8 = new Cadea(); 
        //Cadea ejercicio9a = new Cadea();
        //Cadea ejercicio9b = new Cadea();
         // Cadea ejercicio10 = new Cadea(); 
         
         
         // PARA CADA EJERCICIO CONSTRUI UN OBJETO, LA RUTA LA PIDE SIEMPRE POR CONSOLA, SI ACTIBAS TOODS LOS OBJETEOS TE PIDE LAS RUTA DE LOS 10
         
         
                                        //CONSEJO     PROBAR DE UNO EN UNO
         

        /*   
        ejercicio1.creaDirectorio();                                            //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir
        ejercicio1.eDirectorio_eFicheiro();
         */
 /* 
        ejercicio2.creafichero();                                            //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\Products1.txt
        ejercicio2.eDirectorio_eFicheiro();
         */
 /*
        ejercicio3.creaDirectorio();                                                //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\subdir   
        ejercicio3b.creafichero();                                                   //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\subdir\Products2.txt
         */
 /* 
        ejercicio4.mContido();                                                  //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir
         */
 /* 
        ejercicio5a.modoAcceso();
        ejercicio5a.comprobarLonxitude();                                        //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\Products1.txt
         */
 /*
        ejercicio6.mEscritura();                                                  //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\Products1.txt
         */
 /*
        ejercicio7.mEscritura();                                                  //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\Products1.txt
         */
 /*
        ejercicio8.borrarFichero();                                                 //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\Products1.txt
         */
        /*
          ejercicio9a.borrarDirectorio();                                           //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\subdir
          ejercicio9b.borrarFichero();                                                     //  F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\subdir\texto2.txt
          ejercicio9a.borrarDirectorio();                                           //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir\subdir
          ejercicio9a.borrarDirectorio();                                           //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir
          ejercicio9a.borrarDirectorio();                                           //F:\Users\david\Documents\NetBeansProjects\arquivos
          */
        
        //ejercicio10.recur();                                            //F:\Users\david\Documents\NetBeansProjects\arquivos\arquivosdir
    }
}

class Cadea {

    public static String ruta;

    public String r = JOptionPane.showInputDialog("Introduce ruta");

    public void eDirectorio_eFicheiro() {

        File ruta = new File(r);

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

            System.out.println("Directorio creado en la ruta: ");
            System.out.println(ruta.getAbsolutePath());

        }

    }

    public void creafichero() {

        File ruta = new File(r);

        if (ruta.isFile()) {

            System.out.println("El archivo ya existe");

        } else {

            try {
                ruta.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (ruta.exists()) {

                System.out.println("Archivo creado correctamente");

            } else {

                System.out.println("Archivo no credo");

            }

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
        if (ruta.canWrite()) {

            ruta.setWritable(false);

            System.out.println("permisos escritura cambiado = A no permitido");
        } else {

            ruta.setWritable(true);

            System.out.println("permisos escritura cambiado = A permitido");

        }

    }

    public void borrarFichero() {

        File ruta = new File(r);

        if (ruta.exists()) {

            if (ruta.isFile()) {

                ruta.delete();

                System.out.println("Archivo borrado");
                System.out.println(" Ruta antigua = " + ruta.getAbsoluteFile());

            } else {

                System.out.println("No se puede borrar es un directorio");

            }
            System.out.println(" Ruta modificada = " + ruta.getParent());

        } else {

            System.out.println("Ruta no existe ");

        }
    }

    public void borrarDirectorio() {

        File ruta = new File(r);

        if (ruta.exists()) {

            if (ruta.isFile()) {

                System.out.println("No se puede borrar, es un archivo");

            } else {

                ruta.delete();

                if (ruta.exists()) {

                    System.out.println("No se puede borrar directorio con descendencia");

                    File[] listaCarpetas1 = ruta.listFiles();

                    System.out.println(" numero de subcarpetas = " + listaCarpetas1.length);

                    for (int i = 0; i < listaCarpetas1.length; i++) {

                        System.out.println(" rutas de las subcarpetas " + listaCarpetas1[i]);
                    }

                } else if (ruta.exists() == false) {

                    System.out.println("directorio eliminado");

                }

            }

        } else {

            System.out.println("Ruta no existe");

        }

    }

    public void mContido() {

        File ruta = new File(r);

        String[] nombre_Contenido = ruta.list();

        if (ruta.exists()) {

            for (int i = 0; i < nombre_Contenido.length; i++) {

                System.out.println(nombre_Contenido[i]); ////muestra el contenido de la ruta dada, tanto directorios como archivos

            }
        }
    }

    public void recur() {

        File ruta = new File(r);

        String[] nombre_Contenido = ruta.list();

        if (ruta.exists()) {

            for (int i = 0; i < nombre_Contenido.length; i++) {

                System.out.println(nombre_Contenido[i]); ////muestra el contenido de la ruta dada, tanto directorios como archivos

                File subruta = new File(ruta.getAbsolutePath(), nombre_Contenido[i]); // almacena en el objeto  cada archivo o directorio de la ruta principal

                if (subruta.isDirectory()) { // sirve para saber si la subruta tiene directorios, si es asi  lo almacena en el siguiente array

                    String[] archivos_Subcarpetas = subruta.list(); // almacena en el array los subdirectorios y archivos de la subruta

                    for (int j = 0; j < archivos_Subcarpetas.length; j++) {

                        System.out.println(archivos_Subcarpetas[j]);  // muestra los archivos y directorios de los subdirectorios

                        File sub_sub_ruta = new File(subruta.getAbsolutePath(), archivos_Subcarpetas[j]);  // almacena en el objeto la nueva ruta del subdirectorio encontrado en la ruta anterior

                        if (sub_sub_ruta.isDirectory()) {

                            String[] archivos_sub_sub_carpetas = sub_sub_ruta.list(); // almacena en el array los directorios y archivos de sub subruta

                            for (int a = 0; a < archivos_sub_sub_carpetas.length; a++) {

                                System.out.println(archivos_sub_sub_carpetas[a]);  // muestra los archivos y directorios encontrado en  las sub su

                            }

                        }

                    }

                }
            }

        }
    }

}
