package com.lugo;

public class IfElse {
    public static void main(String[] args) {
        boolean check = true;
        boolean re = 5 < 10;
        int n1, n2, n3;
        n1 = 5;
        n2 = 10;
        n3 = 15;
        //if
        if (re){
            System.out.println("Verdadero..");
        } else {
            System.out.println("Falso");
        }
        //Condiciones anilladas con else
        if (n1 < n2 && n3 > n2){
            System.out.println("Verdadero..");
        } else if (n3 < n2) {
            System.out.println("Else if..");
        } else {
            System.out.println("Else..");
        }
        //Depurar es importante por que ejecuta el codigo linea por linea

    }
}
