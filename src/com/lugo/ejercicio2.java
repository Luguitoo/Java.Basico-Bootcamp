package com.lugo;

public class ejercicio2 {

        //funciones
        float precio = 44.50f;
        double resultado = obtener_iva(precio);


        public static double obtener_iva(float precio) {
            //suponiendo que el iva es 21% por ej
            double iva = precio * 1.21;
            System.out.println("Resultado: " + iva);
            return iva;
        }
    }

