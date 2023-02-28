package com.lugo;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

import static java.lang.System.out;


public class InputStream {
    public static void main(String[] args) throws FileNotFoundException {
        //Leer un fichero
        try{
            BufferedReader ficherob = new BufferedReader(new FileReader("clientes.txt"));
            try {
                Map<String, String> clientes = new HashMap<>(); //HashMap
                //Leer un fichero de clientes
                String texto = ficherob.readLine();
                String clave = "";
                String nombre = "";
                while(texto != null) { //if  not EOF
                    //System.out.println(texto);
                    //out.print((char)dato); //letra por letra
                    String[] parts = texto.split(",");
                    if (texto.length() > 0){
                        clave = parts[0];
                        nombre = parts[1];
                        clientes.put(clave, nombre);
                    }
                    // Leer la siguiente línea
                    texto = ficherob.readLine();
                    //out.println(ultimo);
                }
                PrintStream info = new PrintStream("clientes.txt"); //PrintStream
                List<String> nombres = new ArrayList<>();                   //Array
                System.out.println("\nCrud de clientes:");
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Que desea realizar? ");
                System.out.println("1. Cargar cliente ");
                System.out.println("2. Listar clientes ");
                System.out.println("3. Eliminar clientes ");
                int a = scanner3.nextInt();
                while (a != 0) {
                    if (a == 2) {
                        nombres.clear();
                        for (Map.Entry<String, String> pair : clientes.entrySet()){
                            nombres.add(pair.getKey() + ".-" + pair.getValue());
                        }
                        for (String clientess : nombres){
                            System.out.println(clientess);
                        }
                    }
                    if (a == 1){
                        Integer ultimo = Integer. valueOf(clave);
                        Scanner nombre_scanner = new Scanner(System.in);
                        System.out.println("Ingrese el nombre del cliente: ");
                        String nombre_cliente = nombre_scanner.nextLine();
                        clientes.put(String.valueOf(ultimo + 1), nombre_cliente);
                        for (Map.Entry<String, String> pair : clientes.entrySet()){
                            info.println(pair.getKey() + "," + pair.getValue());
                        }
                        System.out.println("Cargado con exito... ");

                    }
                    if (a == 3){
                        Scanner id = new Scanner(System.in);
                        out.println(clientes);
                        System.out.println("Ingrese el numero del cliente: ");
                        String id_cliente = id.nextLine();
                        clientes.remove(id_cliente);
                        out.println(clientes);
                        for (Map.Entry<String, String> pair : clientes.entrySet()){
                            info.println(pair.getKey() + "," + pair.getValue());
                        }
                        nombres.clear();
                        System.out.println("Eliminado con exito... ");
                    }
                    System.out.println("Que desea realizar? ");
                    System.out.println("1. Cargar cliente ");
                    System.out.println("2. Listar clientes ");
                    System.out.println("3. Eliminar clientes ");
                    a = scanner3.nextInt();
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
