package com.cursovitor.arquiteturaspring.montadora.model;

import com.cursovitor.arquiteturaspring.montadora.enums.Montadora;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;

    // se eu quero herdar uma outra classe criada (no caso o motor), eu preciso criar um construtor pra ele!
    // OBS: Isso nao acontece com ENUM
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if(chave.getMontadora() != this.montadora) {
            return new CarroStatus("Nao é possivel iniciar o carro com esta chave!");
        }
        return new CarroStatus("Carro ligado. Rodando com o motor " + motor);
    }
}
