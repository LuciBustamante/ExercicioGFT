package Game;

import java.util.ArrayList;


public class Mago extends Personagem {

    private ArrayList<String> magias = new ArrayList<>();

    public Mago(String nome, int vida, int mana, int inteligencia, int forca, int level, float xp) {
        super(nome, vida, mana, inteligencia, forca, level, xp);
    }

    @Override
    public void lvlUp() {
        this.setMana(this.getMana() + 2);
        this.setInteligencia(this.getInteligencia() + 2);
        this.setForca(this.getForca() + 1);
        this.setLevel(this.getLevel() + 1);
        this.setVida(this.getVida() + 1);
        this.setXp(this.getXp() + 1);
    }

    @Override
    public int attack() {
        return (this.getInteligencia() * this.getLevel()) + (int) Math.random() * 300;
    }

    public void aprenderMagia(String nomeMagia) {
        this.magias.add(nomeMagia);
    }
}
