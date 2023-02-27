package Clases.com;

public class CocheMain {
    public static void main(String[] args) {
        //crear objetos a partir de clases
        Coche coche = new Coche();;
        //instanciando una clase
        Coche coche1 = new Coche("amarillo", "toyota", 20, 15.5);
        //acceder a atributos
        coche1.acelerar(50);
        //imprimir objetos
        System.out.println(coche1);
        //otra forma de editar los valores y de imprimir
        coche1.peso = 20.0;
        System.out.println(coche1.peso);
        //herencia coche electrico
        CocheElectrico electrico = new CocheElectrico();

        electrico.motorElectrico = "Motorr";
        electrico.color = "Red";
        electrico.peso = 20.0;
        electrico.fabricante = "mercedes";
        electrico.velocidad = 21;
        System.out.println(electrico);
        //metodo super, inicializar y imprimir, nos permite reutilizar codigo de una clase fija
        CocheElectrico electrico1 = new CocheElectrico("Red", "Kia", 20, 15.6, "Si");
        System.out.println(electrico1);
        electrico1.acelerar(50);
        System.out.println(electrico1);
    }
}
