package com.lugo;

public class Funciones {
    public static void main(String[] args) {
        //funciones
        holaMundo("Lugo");
        escribir();
        String d = devolver();
        //Misma funcion, solo que con parametros // sobrecarga
        escrbir("Lugo");
    }
//Si es protected solo pueden acceder los que estan en el mismo paquete, en este caso com.lugo del proyecto
    protected static String devolver() {

        return "Hola";
    }
//Cuando es publico se puede invocar en otra clase
    public static void escribir() {

        System.out.println("Estoy escribiendo pa");
    }

    private static void holaMundo(String name) {

        System.out.println("Hola mundo " + name + " desde un metodo");
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
    }
    //sobrecarga de funciones es cuando tenes varias funciones, con distintos parametros para evitar el error ej:
    // los parametros ya son distintos con otro tipo de dato
    //misma funcion con otro parametro.
    private static void escrbir(String name){

    }
}
