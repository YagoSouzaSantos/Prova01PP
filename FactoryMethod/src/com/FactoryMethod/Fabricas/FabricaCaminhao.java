package com.FactoryMethod.Fabricas;

import com.FactoryMethod.ClassesConcretas.Caminhao;
import com.FactoryMethod.Interfaces.ITransporte;

public class FabricaCaminhao extends FabricaAbstrata{
    @Override
    public ITransporte criartransporte() {
        return new Caminhao();
    }
}
