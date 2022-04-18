package com.Prototype;

import com.Prototype.Formatos.Circulo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circulo> listaDeObjetos = new ArrayList<Circulo>();

        Circulo circulo = new Circulo();
        circulo.altura = 10;
        circulo.largura = 15;
        circulo.nome = "Circulo";
        listaDeObjetos.add(circulo);

        Circulo meuClone = circulo.Clone();
        meuClone.nome = "CloneCirculo";
        listaDeObjetos.add(meuClone);

        for (int i = 0; i < 2; i++){
            if(listaDeObjetos.get(i) != null)
                System.out.println( listaDeObjetos.get(i).nome + ", Altura: " +
                                    listaDeObjetos.get(i).altura + " Largura: " +
                                    listaDeObjetos.get(i).largura);
            else {

            }
        }






    }
}
