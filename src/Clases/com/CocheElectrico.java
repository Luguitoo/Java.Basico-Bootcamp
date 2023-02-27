package Clases.com;
//herencia con extends
public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }
    //metodo super, nos permite inicializar el constructor anterior de la clase
    public CocheElectrico(String color, String fabricante, Integer velocidad, Double peso, String motorElectrico) {
        super(color, fabricante, velocidad, peso);
        this.motorElectrico = motorElectrico;
    }

    @Override //el override se asegura que el metodo exista en la super clase para sobrescribirla
    public void acelerar(Integer cantidad) {
        Integer cantidadajustada = cantidad * 2;
        super.acelerar(cantidadajustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", velocidad=" + velocidad +
                ", peso=" + peso +
                '}';
    }
}
