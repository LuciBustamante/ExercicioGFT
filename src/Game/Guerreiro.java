package Game;

import java.util.ArrayList;


public class Guerreiro extends Personagem {

    private ArrayList<String> habilidades = new ArrayList<>();


    public Guerreiro(String nome, int vida, int mana, int inteligencia, int forca, int level, float xp) {
        super(nome, vida, mana, inteligencia, forca, level, xp);
    }

    @Override
    public void lvlUp() {
        this.setMana(this.getMana() + 1);
        this.setInteligencia(this.getInteligencia() + 1);
        this.setForca(this.getForca() + 2);
        this.setLevel(this.getLevel() + 1);
        this.setVida(this.getVida() + 2);
        this.setXp(this.getXp() + 1);
    }

    @Override
    public int attack() {
        return (this.getForca() * this.getLevel()) + (int) Math.random() * 300;
    }

    public void aprenderHabilidade(String tipoHab) {
        this.habilidades.add(tipoHab);
    }
}