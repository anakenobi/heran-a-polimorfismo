import entities.Quadrado;
import entities.Retangulo;
import entities.Triangulo;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10, 20);
        System.out.println("Área do triangulo: " + triangulo.calcularArea(10, 20));
        System.out.println("Perimetro do triangulo: " + triangulo.calculaPerimetro());

        Quadrado quadrado = new Quadrado(20);
        System.out.println("Área quadrado: " + quadrado.calcularArea(20));
        System.out.println("Perimetro do quadrado: " + quadrado.calculaPerimetro());

        Retangulo retangulo = new Retangulo(50, 30);
        System.out.println("Área do retangulo: " + retangulo.calcularArea(50, 30));
        System.out.println("Perimetro do retangulo: " + retangulo.calculaPerimetro());











    }
}