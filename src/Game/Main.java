package Game;

import java.util.ArrayList;

public class Main {

    private static int soma = 0;

    public static void main(String[] args) {

        Mago m1 = new Mago("Erick", 34, 5,6, 5, 6, 5);
        Mago m2 = new Mago("DR", 20, 2,8, 2, 4, 1);
        Guerreiro g1 = new Guerreiro("Pedro", 32, 2,3, 7, 5, 4);

        ArrayList<Mago> magos = new ArrayList<>();
        magos.add(m1);
        magos.add(m2);

        ArrayList<Guerreiro> guerreiros = new ArrayList<>();
        guerreiros.add(g1);

        Main.soma = guerreiros.size() + magos.size();

        m1.aprenderMagia("invisibilidade");
        g1.aprenderHabilidade("Arco");

        m1.lvlUp();
        m1.attack();

        g1.lvlUp();
        g1.attack();

        System.out.println(">>>>> Quantidade se personagens: " + soma);
        System.out.println("---- Guerreiros ---");
        System.out.println("Nome: " + g1.getNome() + "/ Vida: " + g1.getVida() + "/ Mana: " + g1.getMana()
                + "/ Inteligencia: " + g1.getInteligencia() + "/ Forca: " + g1.getForca()
                + "/ Level: " + g1.getLevel() + "/ XP: " + g1.getXp());
        System.out.println("---- Magos ---");
        System.out.println("Nome: " + m1.getNome() + "/ Vida: " + m1.getVida() + "/ Mana: " + m1.getMana()
                + "/ Inteligencia: " + m1.getInteligencia() + "/ Forca: " + m1.getForca()
                + "/ Level: " + m1.getLevel() + "/ XP: " + m1.getXp());
        System.out.println("Nome: " + m2.getNome() + "/ Vida: " + m2.getVida() + "/ Mana: " + m2.getMana()
                + "/ Inteligencia: " + m2.getInteligencia() + "/ Forca: " + m2.getForca()
                + "/ Level: " + m2.getLevel() + "/ XP: " + m2.getXp());
    }
}
