package com.lugo;

public class WhileBucle {
    public static void main(String[] args) {
        // continue y break
        //continue ya no se realice el codigo a continuacion osea la salta
        //break lo que hace es romper el bucle, osea salir del bucle
        //sintaxis
        int count = 0;

        while (count <= 10) {
            count++; //sumar el contador
            if (count == 5) {
                //break; //rompre el flujo de la ejecucion
                continue; //salta el valor 5 y continua

            }
            System.out.println("Numero: " + count);
        }
        //Si hacemos un while true, seria infinito
        System.out.println("Fin");
    }
}
