package entities;

public class EBook extends Livro {

    public double tamanhoDoArquivo;

    public EBook(String titulo, String autor, double preco, double tamanhoDoArquivo)
    {
        super(titulo, autor, preco);
        this.tamanhoDoArquivo = tamanhoDoArquivo;

    }

    @Override
    public String toString()
    {
        return super.toString() + ", Tamanho do Arquivo: " + tamanhoDoArquivo + " MB";
    }


}
