package com.Prototype;

import java.awt.*;
import java.text.Format;

public abstract class Objeto {
    int altura, largura;
    String nome;

    public Objeto(){};

    public Objeto(Objeto objeto){
        this.altura = objeto.altura;
        this.largura = objeto.largura;
        this.nome = objeto.nome;
    }

    public abstract Objeto Clone();

}
