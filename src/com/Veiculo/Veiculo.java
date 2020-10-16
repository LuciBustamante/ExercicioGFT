package com.Veiculo;

public class Veiculo {

    private String marca, modelo, placa, cor;
    private double preco;
    private float km;
    private boolean isLigado;
    private int litroCombustivel, velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean getIsLigado() {
        return isLigado;
    }

    public void setIsLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitroCombustivel() {
        return litroCombustivel;
    }

    public void setLitroCombustivel(int litroCombustivel) {
        this.litroCombustivel = litroCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Veiculo(String marca, String modelo, String placa, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.preco = preco;
        this.km = 80;
        this.isLigado = isLigado;
        this.litroCombustivel = litroCombustivel;
        this.velocidade = velocidade;
    }

    public int acelerar(){
        return this.velocidade += 20;
    }

    public double abastecer(int combustivel) {
        if(this.litroCombustivel + combustivel < 60){
            this.litroCombustivel += combustivel;
        }
        return this.litroCombustivel;
    }

    public float frear() {
        if(this.velocidade > 0) {
            this.velocidade -= Math.min(this.velocidade, 20);
        }
        return this.velocidade;
    }

    public String pintar(String novaCor) {
        this.cor = novaCor;
        return cor;
    }

    public boolean ligar() {
        if(!this.isLigado){
            this.isLigado = true;
        }
        return this.isLigado;
    }

    public boolean desligar() {
        if(this.velocidade == 0){
            this.isLigado = false;
        }
        return this.isLigado;
    }

}

