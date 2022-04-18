package com.AbstractFactory.Interfaces;

public interface IFabricaAbstrata {

    ICadeira criarCadeira();
    IMesa criarMesa();
    ISofa criarSofa();
}
