package com.FactoryMethod.ClassesConcretas;

import com.FactoryMethod.Interfaces.ITransporte;

public class Caminhao implements ITransporte {
    @Override
    public void entrega(String nome) {
        System.out.println("Criado novo caminhao com MUITO AMOR para " + nome);
    }
}
