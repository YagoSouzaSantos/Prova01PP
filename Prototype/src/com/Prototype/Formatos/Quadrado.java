package com.Prototype.Formatos;

import com.Prototype.Objeto;

public class Quadrado extends Objeto {
    public int altura, largura;
    public String nome;

    public Quadrado() {

    }

    public Quadrado(Quadrado quadrado){
        this.largura = quadrado.largura;
        this.altura = quadrado.altura;
        this.nome = quadrado.nome;
    }
    @Override
    public Quadrado Clone() {
        return new Quadrado(this);
    }
}
