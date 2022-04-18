package com.Prototype.Formatos;

import com.Prototype.Objeto;

public class Circulo extends Objeto {
    public int largura, altura;
    public String nome;

    public Circulo(){}

    public Circulo(Circulo circulo) {
        this.largura = circulo.largura;
        this.altura = circulo.altura;
        this.nome = circulo.nome;
    }

    @Override
    public Circulo Clone() {
        return new Circulo(this);
    }
}
