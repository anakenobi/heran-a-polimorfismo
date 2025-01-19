import entities.AudioLivro;
import entities.EBook;
import entities.Livro;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.forLanguageTag("pt-BR"));

    int quantidade;
    String titulo;
    double preco;
    String autor;
    int tipo;
    double precoTotal;

    System.out.println("Digite a quantidade de livros: ");
    quantidade = sc.nextInt();
    sc.nextLine();

    Livro [] livros = new Livro[quantidade];

    for(int i = 0; i < quantidade; i++)
    {
        System.out.println("Livro " + (i + 1) + ":");
        System.out.println("Digite o tipo do livro: 1 - Livro físico 2 - EBook 3 - AudioBook");
        tipo = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do titulo: ");
        titulo = sc.nextLine();

        System.out.println("Autor " + (i + 1) + ":");
        System.out.println("Digite o nome do autor: ");
        autor = sc.nextLine();

        System.out.println("Preço " + (i + 1) + ":");
        System.out.println("Digite o preço do livro: ");
        preco = sc.nextDouble();


        switch (tipo) {
            case 1: // livro fisico
                livros[i] = new Livro(titulo, autor, preco);
                break;
            case 2: // EBook
                System.out.print("Tamanho do arquivo (em MB): ");
                double tamanhoDoArquivo = sc.nextDouble();
                livros[i] = new EBook(titulo, autor, preco, tamanhoDoArquivo);
                break;
            case 3: // Audiobook
                System.out.print("Tempo de duração (em horas): ");
                double tempoDeDuracao = sc.nextDouble();
                livros[i] = new AudioLivro(titulo, autor, preco, tempoDeDuracao);
                break;
            default:
                System.out.println("Tipo inválido! Livro será cadastrado como um livro comum.");
                livros[i] = new Livro(titulo, autor, preco);
                break;
        }
    }

    precoTotal = 0;
    for(Livro livro : livros)
    {
        System.out.println(livro);
        precoTotal += livro.getPreco();
    }

    System.out.printf("\nPreço total da coleção: R$ %.2f\n", precoTotal);


    }
}