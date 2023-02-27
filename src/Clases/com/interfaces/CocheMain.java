package Clases.com.interfaces;

public class CocheMain {
    public static void main(String[] args) {
        CocheCRUD crud = new CocheCrudImpl();
        crud.save();
        crud.findAll();
        crud.delete();

    }
}
