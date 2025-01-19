package entities;

public class Quadrado extends Poligono {

    public Quadrado (int lado)
    {
        super(lado,lado);

    }

    public int calcularArea(int lado)
    {
        return lado * lado;
    }

    @Override
    public int calculaPerimetro() {
        return 4 * base;

    }
}
