package Clases.com.interfaces;

public class CocheCrudImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Guardando coche...");
    }

    @Override
    public void findAll() {
        System.out.println("Encontrando todos los coches...");

    }

    @Override
    public void delete() {
        System.out.println("Borrando el coche...");

    }
}
