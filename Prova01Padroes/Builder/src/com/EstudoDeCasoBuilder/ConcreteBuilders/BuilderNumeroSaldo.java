package com.EstudoDeCasoBuilder.ConcreteBuilders;

import com.EstudoDeCasoBuilder.Interfaces.IBuilder;

public class BuilderNumeroSaldo implements IBuilder {
    @Override
    public void buildNumeroConta() {
        System.out.println("Numero da Conta Criado");
    }

    @Override
    public void buildSaldo() {
        System.out.println("Saldo da Conta Adicionado");
    }

    @Override
    public void buildNomeCliente() {

    }

    @Override
    public void buildNomeTitular() {

    }
}
