package com.FactoryMethod.ClassesConcretas;

import com.FactoryMethod.Interfaces.ITransporte;

public class Barco implements ITransporte {
    @Override
    public void entrega(String nome) {
        System.out.println("Criado novo Barco.......com MUITO AMOR para " + nome);
    }
}
