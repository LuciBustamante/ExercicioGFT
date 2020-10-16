package Game;

public abstract class Personagem {
    private String nome;
    private int vida, mana, inteligencia, forca, level;
    private float xp;

    public abstract void lvlUp();
    public abstract int attack();

    public Personagem(String nome, int vida, int mana, int inteligencia, int forca, int level, float xp) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
        this.xp = xp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }
}
