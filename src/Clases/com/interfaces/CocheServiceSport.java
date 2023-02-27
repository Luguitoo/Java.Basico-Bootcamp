package Clases.com.interfaces;

import Clases.com.Coche;
import Clases.com.interfaces.CocheService;

public class CocheServiceSport implements CocheService {
    @Override
    public Coche crearCoche() {
        System.out.println("Coche carreras");
        return new Coche();
    }
}
