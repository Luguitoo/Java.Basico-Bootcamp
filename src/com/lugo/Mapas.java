package com.lugo;
import java.util.HashMap;
import java.util.Map;
public class Mapas {
    public static void main(String[] args) {
        //string para las claves, string para los valores
        // clave valor
        Map<String, String> personas = new HashMap<>();

        personas.put("001", "Nombre y Apellido 1");
        personas.put("002", "Nombre y Apellido 2");
        personas.put("003", "Nombre y Apellido 3");
        System.out.println(personas);
        //printeando claves
        for (String key : personas.keySet()){
            System.out.println(key);
        }
        //printeando valores
        for (String values : personas.values()){
            System.out.println(values);
        }
        //par de clave valor
        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}
