package Loja;

import java.util.ArrayList;

public class Loja {
    private String nome, cnpj;
    private ArrayList<Livro> livros = new ArrayList();
    private ArrayList<VideoGame> videoGames = new ArrayList();

    public Loja(String nome, String cnpj, ArrayList<Livro> livros, ArrayList<VideoGame> videoGame) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGame;
    }


    public Loja() {

    }

    public void listaLivros() {
        if(this.livros.isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("--- Lista de Livros ---");
            this.livros.forEach((livro) -> System.out.println(livro.getNome()));
        }
    }

    public void listaVideoGame() {
        if(this.videoGames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque.");
        } else {
            System.out.println("--- Lista de Video-Games ---");
            this.videoGames.forEach((videoGame) -> System.out.println(videoGame.getNome()));
        }

    }

    public double calcularPatrimonio() {
        double total = 0;
        for (var i = 0; i < this.livros.size(); i++) {
            total += this.livros.get(i).getPreco();
        }
        for (var i = 0; i < this.videoGames.size(); i++) {
            total += this.videoGames.get(i).getPreco();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<VideoGame> getVideoGame() {
        return videoGames;
    }

    public void setVideoGame(ArrayList<VideoGame> videoGame) {
        this.videoGames = videoGame;
    }
}
