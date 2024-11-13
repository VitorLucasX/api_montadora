package com.cursovitor.arquiteturaspring.montadora.model;

import com.cursovitor.arquiteturaspring.montadora.enums.TipoMotor;

public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindro;
    private Double litragem;
    private TipoMotor tipo;

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindro() {
        return cilindro;
    }

    public void setCilindro(Integer cilindro) {
        this.cilindro = cilindro;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindro=" + cilindro +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                ", cavalos=" + cavalos +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
