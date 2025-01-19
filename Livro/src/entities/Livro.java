package entities;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public double getPreco()
    {
        return preco;
    }

    @Override
    public String toString()
    {
        return "[Título: " + titulo + ", Autor: " + autor + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }
}
