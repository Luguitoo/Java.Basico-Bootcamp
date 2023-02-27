package Clases.com.interfaces;

import Clases.com.Coche;
import Clases.com.CocheElectrico;
import Clases.com.interfaces.CocheService;

public class CocheServiceClassic implements CocheService {
    @Override
    public Coche crearCoche() {
        System.out.println("Coche clasico");
        return new CocheElectrico();
    }
}
