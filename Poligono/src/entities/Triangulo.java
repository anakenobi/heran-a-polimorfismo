package entities;

public class Triangulo  extends Poligono{

    public Triangulo(int base, int altura)
    {
        super(base, altura);
    }

    public int calcularArea(int base, int altura)
    {
        return  (base * altura) / 2;

    }

    @Override
    public int calculaPerimetro() {
        return 3 * base;
    }
}
