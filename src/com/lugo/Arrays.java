package com.lugo;

public class Arrays {
    public static void main(String[] args) {
        //declarar
        //int[] notas = new int[10];
        int[] notas = {10,9,8,7,6,5};
        //String nombres[] = {"Carlos", "Lugo", "Zacarias"};
        //notas[0] = 1;
        //notas[1] = 5;
        //notas[2] = 3;
        //recorrer
        //System.out.println(notas.binarySearch(notas, 8));
         //for (int i = 0; i < notas.length; i++){
         //    System.out.println(notas[i]);
        // }

         //for(int item:notas){
         //    System.out.println(item);
         //}
        //Matrices
        int matriz[][] = new int[2][2];
         matriz[0][0] = 2;
         matriz[0][1] = 1;
         matriz[1][0] = 1;
         matriz[1][1] = 2;
        //Debido a que estas malgastando memoria, entonces deberiamos intentar trabajar con la medida justa
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[1].length; j++) {
                 if (j == 0){
                     System.out.println("Fila: " + i);
                 }
                 System.out.println("Columna: " + j + " Valor : " + matriz[i][j]);
             }
         }
    }
}
