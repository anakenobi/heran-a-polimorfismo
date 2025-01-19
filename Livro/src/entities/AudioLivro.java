package entities;

public class AudioLivro extends Livro{

    public double tempoDuracao;

    public AudioLivro(String titulo, String autor, double preco, double tempoDuracao)
    {
        super(titulo, autor, preco);
        this.tempoDuracao = tempoDuracao;

    }

    @Override
    public String toString()
    {
        return super.toString() + ", Tempo de Duração: " + tempoDuracao + " horas";
    }


}
