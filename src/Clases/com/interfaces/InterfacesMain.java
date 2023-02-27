package Clases.com.interfaces;

import Clases.com.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service = new CocheServiceClassic();
        CocheService service2 = new CocheServiceSport();

        Coche coche = service.crearCoche();
    }
}
