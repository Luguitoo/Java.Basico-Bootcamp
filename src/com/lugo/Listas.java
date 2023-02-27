package com.lugo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class Listas {
    public static void main(String[] args) {
        //listas
        List<String> nombres = new ArrayList<>();

        //agregar elementos a la lista
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");

        //System.out.println(nombres);
        //foreach
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        //Vectores //parametros: capacidad inicial y al llegar a la capacidad cuantos elementos agrega
        Vector<Integer> vector = new Vector<Integer>(5, 5);
        vector.add(1);
        vector.add(5);
        vector.add(3);
        System.out.println(vector);
        //vector.remove(2); //posicion del elemento que quiero eliminar
        //System.out.println(vector);
        System.out.println("Tamaño: " + vector.size() + " Capacidad: " + vector.capacity());

        LinkedList<String> lista2 = new LinkedList<String>();
    }
}
