package com.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Corsa", "EUR0026", "Verde", 15000);

        v1.ligar();
        v1.acelerar();
        v1.abastecer(10);
        v1.frear();
        v1.pintar("Branco");
        v1.desligar();


        System.out.println("Marca: " + v1.getMarca() + "\nModelo: " + v1.getModelo() + "\nPlaca: " + v1.getPlaca() +
                "\nCor: " + v1.getCor() + "\nPreço: " + v1.getPreco() + "\nStatus: " + v1.getIsLigado() +
                "\nQuilometragem: " + v1.getKm() + "\nCombustivel(L): " + v1.getLitroCombustivel() + "\nVelocidade:" + v1.getVelocidade());

    }
}
