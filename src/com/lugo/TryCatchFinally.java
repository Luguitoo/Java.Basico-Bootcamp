package com.lugo;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            int result = 5 / 0; //codigo que puede dar problemas
        } catch (ArithmeticException e) {
            e.printStackTrace(); //imprimimos la exception, pero el programa continua
        } finally {
            System.out.println("Cierre de  recursos"); //siempre se ejecuta
        }
        System.out.println("Fin");
    }
}
