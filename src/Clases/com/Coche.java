package Clases.com;

public class Coche {
    //atributos, color, peso, matricula
    String color;
    String fabricante;
    Integer velocidad = 0;
    Double peso;

    //constructores, se inicializa a la clase Coche
    public Coche(){

    }

    public Coche(String color, String fabricante, Integer velocidad, Double peso){
        this.color = color;
        this.fabricante = fabricante;
        this.velocidad = velocidad;
        this.peso = peso;
    }
    //comportamientos
    public void acelerar(Integer cantidad){
        this.velocidad += cantidad;
    }
    //click derecho to string te genera un metodo para imprimir la clase
    @Override
    //el override se asegura que el metodo exista en la super clase
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", velocidad=" + velocidad +
                ", peso=" + peso +
                '}';
    }
}
