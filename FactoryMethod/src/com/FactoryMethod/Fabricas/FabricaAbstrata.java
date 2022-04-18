package com.FactoryMethod.Fabricas;

import com.FactoryMethod.Interfaces.ITransporte;

public abstract class FabricaAbstrata {

    public abstract ITransporte criartransporte();

    public void entregaDeObejto(String nome) {
        ITransporte transporte = criartransporte();
        transporte.entrega(nome);
    }
}
