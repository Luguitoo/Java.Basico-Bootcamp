package com.lugo;
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class EjercicioFinal {
    public static void main(String[] args) {
        String cadena;
        String cadena_invertida;
        //Invertir cadena.
        System.out.println("Escriba el texto:  ");
        Scanner leer = new Scanner(System.in);
        cadena = leer.nextLine();
        cadena_invertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("La cadena invertida es: " + cadena_invertida);

        //Array unidimensional y recorrelo.
        System.out.println("\nArray unidemensional: ");
        String lenguajes[] = {"Python", "Java", "C", "JavaScript"};
        for (int i = 0; i < lenguajes.length; i++) {
            System.out.println(i + 1 + ".- " + lenguajes[i]);
        }
        //Crea un array bidimensional enteros y recorrelo.
        System.out.println("\nArray bidimensional: ");
        int matriz[][] = new int[2][3];
        matriz[0][0] = 3;
        matriz[0][1] = 2;
        matriz[0][2] = 1;
        matriz[1][0] = 1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                if (j == 0) {
                    System.out.println("Fila: " + i);
                }
                System.out.println("Columna " + j + ": " + matriz[i][j]);
            }
        }
        //Crea un Vector de 5 elementos. Elimina el 2o y 3er elemento.
        System.out.println("\nModificar un vector:");
        Vector<Integer> vector = new Vector<Integer>(5, 5);
        vector.add(1);
        vector.add(2); //segundo
        vector.add(3); //tercero
        vector.add(4);
        vector.add(5);
        System.out.println("Vector sin modificar: " + vector);
        vector.remove(1);
        vector.remove(3);
        System.out.println("Vector modificado: " + vector);

        //cuál es el problema de utilizar un Vector con la capacidad por defecto.
        System.out.println("\nCuál es el problema de utilizar un Vector con la capacidad por defecto?");
        System.out.println("Rta: El problema es que estas malgastando memoria, ya que al llegar a la capacidad este incrementa");

        //ArrayList String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos.
        System.out.println("\nCopiar elementos de un array a una linkedlist:");
        List<String> nombres = new ArrayList<>();
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        LinkedList<String> copia = new LinkedList<String>();
        //copiando
        for (String nombre : nombres) {
            copia.add(nombre);
        }
        //recorriendo
        System.out.println("Vector nombres: ");
        for (String nombre : nombres) {

            System.out.println(nombre);
            ;
        }
        System.out.println("LinkedList nombres copiados: ");
        for (String nombre : copia) {
            System.out.println(nombre);
            ;
        }
        //ArrayList de tipo int, utilizando un bucle rellénalo con elementos 1..10. con otro bucle, recórrelo y elimina los numeros pares.
        System.out.println("\nArrayList del 1 a 10 eliminando numeros pares:");
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) { //Directamente si no es par no lo agrego :)
                numeros.add(i);
            }
        }
        System.out.println(numeros);

        //Función DividePorCero, excepción ("throws") a ArithmeticException. Si se dispara mostraremos
        // el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código"
        System.out.println("\nFuncion DividePorCero:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = scanner.nextInt();
        try {
            int resultado = DividePorCero(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        System.out.println("\nCopiar ficheros:");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo a copiar: ");
        String fileIn = scanner2.nextLine();
        System.out.println("Ingrese el nombre del nuevo archivo: ");
        String fileOut = scanner2.nextLine();
        copiarfichero(fileIn, fileOut);

        //Crear un programa que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        //Crud clientes
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
                List<String> nombresc = new ArrayList<>();                   //Array
                System.out.println("\nCrud de clientes:");
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Que desea realizar? ");
                System.out.println("1. Cargar cliente ");
                System.out.println("2. Listar clientes ");
                System.out.println("3. Eliminar clientes ");
                int a = scanner3.nextInt();
                while (a != 0) {
                    if (a == 2) {
                        nombresc.clear();
                        for (Map.Entry<String, String> pair : clientes.entrySet()){
                            nombresc.add(pair.getKey() + ".-" + pair.getValue());
                        }
                        for (String clientess : nombresc){
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
                        nombresc.clear();
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


    }
    private static int DividePorCero(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }
    //copiar ficheros
    private static void copiarfichero(String fileIn, String fileOut) {
        try{
            FileInputStream fichero = new FileInputStream(fileIn);
            byte[] datos = fichero.readAllBytes();
            fichero.close();

            PrintStream copiar = new PrintStream(fileOut);
            copiar.write(datos);
            copiar.close();

        }catch (FileNotFoundException e){
            out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

