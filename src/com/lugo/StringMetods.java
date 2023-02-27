package com.lugo;

public class StringMetods {
    public static void main(String[] args) {
        String nombre = "Carlos";
        String apellido = "Lugo";
        System.out.println(nombre.length()); //cantidad de caracteres
        System.out.println(nombre.toUpperCase()); //En mayusculas
        System.out.println(nombre.trim()); //elimina los espacios

        if (nombre.equals(apellido)){ //Comparar dos cadenas //equalsIgnoreCase ignora las mayusculas
            System.out.println("Verdadero");
        }

    }
}
