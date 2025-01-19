package entities;

public class Poligono {

   public int base;
   public int altura;

   public Poligono(int base, int altura)
   {
       this.base = base;
       this.altura = altura;
   }

   public int calculaPerimetro()
   {
       return 2 * (base + altura);
   }

}
