package com.cursovitor.arquiteturaspring.montadora.model;

import com.cursovitor.arquiteturaspring.montadora.enums.Montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    // Como a classe Carro tem um constructor que é o Motor, aqui preciso criar ele também!
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
