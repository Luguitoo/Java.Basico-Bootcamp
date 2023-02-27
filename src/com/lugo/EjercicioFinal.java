package com.lugo;
import java.util.*;

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
    }
    private static int DividePorCero(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }
}

