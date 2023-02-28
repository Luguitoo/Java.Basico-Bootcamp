package com.lugo;

import javax.imageio.IIOException;
import java.io.*;

import static java.lang.System.out;


public class InputStream {
    public static void main(String[] args) throws FileNotFoundException {
        //Leer un fichero
        try{
            FileInputStream fichero = new FileInputStream("test.txt");
            BufferedInputStream ficherob = new BufferedInputStream(fichero); //toma los datos como array?
            try {
                int dato = ficherob.read();
                while (dato != -1) { //if  not EOF
                    out.print((char)dato); //letra por letra
                    dato = ficherob.read();
                }
            } catch (IOException e){
                out.println("Error reading");
            }
        } catch (FileNotFoundException e){
            out.println("File not found");
        }

        //Imprimir en un fichero
        PrintStream info = new PrintStream("test2.txt");
        info.println("Probar imprimir fichero");

        //copiar un fichero a otro
        try{
            FileInputStream fichero = new FileInputStream("test.txt");
            byte[] datos = fichero.readAllBytes();
            fichero.close();

            PrintStream copiar = new PrintStream("copia.txt");
            copiar.write(datos);
            copiar.close(); //no olvidar cerrar el fichero

        }catch (FileNotFoundException e){
            out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
