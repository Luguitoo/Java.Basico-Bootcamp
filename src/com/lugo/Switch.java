package com.lugo;

public class Switch {
    public static void main(String[] args) {
        //sintaxis
        //String clima = "" //Sale el default
        String clima = "calor";

        switch (clima){
            case "lluvia":
                System.out.println("Hoy tenemos lluvia");
                break;
            case "calor":
                System.out.println("Mucho calor");
                break; //necesario el break para que no ejecute el sgte codigo
            default:
                System.out.println("No se encontro el clima de hoy");
                break;
        }
    }
}
