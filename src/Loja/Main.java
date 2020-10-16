package Loja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", 40, 50, "J.K Rowling", "Fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J.R.R Tolkien", "Fantasia", 500);
        Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

        VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("Xbox", 1500, 500, "Microsoft", "One", false);

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        ArrayList<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(ps4);
        videoGames.add(ps4Usado);
        videoGames.add(xbox);

        Loja americanas = new Loja("Americanas", "12345678", livros, videoGames);

        l2.calcularImposto();
        l3.calcularImposto();

        ps4Usado.calcularImposto();
        ps4.calcularImposto();

        americanas.listaLivros();
        americanas.listaVideoGame();
        americanas.calcularPatrimonio();

        System.out.println("-------------------------------------------------------------");
        System.out.println("R$ "+ l2.calcularImposto() + " de imposto sobre o livro Senhor dos Anéis");
        System.out.println("Livro educativo não tem imposto " + l3.getNome());
        System.out.println("Imposto PS4 Slim usado " + ps4Usado.calcularImposto());
        System.out.println("Imposto PS4 Slim " + ps4.calcularImposto());
        System.out.println("------------------------------------------------------------");

        System.out.println("A Lojas Americanas possuí estes livros para venda: ");
        System.out.println("Título: " + l1.getNome() + ", preço: " + l1.getPreco() + ", quantidade " + l1.getQtd() + " em estoque");
        System.out.println("Título: " + l2.getNome() + ", preço: " + l2.getPreco() + ", quantidade " + l2.getQtd() + " em estoque");
        System.out.println("Título: " + l3.getNome() + ", preço: " + l3.getPreco() + ", quantidade " + l3.getQtd() + " em estoque");
        System.out.println("------------------------------------------------------------");

        System.out.println("A Lojas Americanas possuí estes video-games para venda: ");
        System.out.println("Video-game: " + ps4.getNome() + ", preço: " + ps4.getPreco() + ", quantidade " + ps4.getQtd() + " em estoque");
        System.out.println("Video-game " + ps4Usado.getNome() + ", preço: " + ps4Usado.getPreco() + ", quantidade " + ps4Usado.getQtd() + " em estoque");
        System.out.println("Video-game " + xbox.getNome() + ", preço: " + xbox.getPreco() + ", quantidade " + xbox.getQtd() + " em estoque");
    }
}