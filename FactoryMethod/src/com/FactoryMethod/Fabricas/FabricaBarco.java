package com.FactoryMethod.Fabricas;

import com.FactoryMethod.ClassesConcretas.Barco;
import com.FactoryMethod.Interfaces.ITransporte;

public class FabricaBarco extends FabricaAbstrata{
    @Override
    public ITransporte criartransporte() {
        return new Barco();
    }
}
