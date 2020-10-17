package Pessoa;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa("João", 15);
        Pessoa pessoa1 = new Pessoa("Leandro", 21);
        Pessoa pessoa2 = new Pessoa("Paulo", 17);
        Pessoa pessoa3 = new Pessoa("Jessica", 18);

        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        Pessoa maiorPessoa = pessoas.get(0);
        for(int i = 0; i < pessoas.size(); i++) {
            if(pessoas.get(i).getIdade() > maiorPessoa.getIdade()) {
                maiorPessoa = pessoas.get(i);
            }
        }
        System.out.println("A maior idade é: " + maiorPessoa.getIdade());
        System.out.println("Nome da pessoa mais velha: " + maiorPessoa.getNome());


        // Questão 05
        System.out.println("_____Lista Antes da Exclusão ____");
        for(Pessoa p : pessoas){
            System.out.println(p.getNome());
        }
        System.out.println("____Lista após Exclusão____");
        for(int i = 0; i < pessoas.size(); i++){
            Pessoa p = pessoas.get(i);
            if(p.getIdade() < 18) {
                pessoas.remove(p);
            }
        }
        for(Pessoa p : pessoas){
            System.out.println(p.getNome());
        }

        // Exercicio 06
        System.out.println("__Consulta__");
        var idade = 0;
        for(int i = 0; i < pessoas.size(); i++){
            if(pessoas.get(i).getNome().equals("Jessica")) {
                idade = pessoas.get(i).getIdade();
            }
        }
        System.out.println("Nome existe na lista. Pessoa possuí " + idade + " anos");
    }
}

