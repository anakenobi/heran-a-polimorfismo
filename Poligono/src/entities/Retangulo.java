package entities;

public class Retangulo extends Poligono{

    public Retangulo(int base, int altura)
    {
        super(base, altura);
    }

    public int calcularArea (int base, int altura)
    {
        return base * altura;
    }

    @Override
    public int calculaPerimetro() {
        return 2 * (base + altura);
    }
}
