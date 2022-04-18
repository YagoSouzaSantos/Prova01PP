package com.AbstractFactory;

import com.AbstractFactory.Interfaces.ICadeira;
import com.AbstractFactory.Interfaces.IFabricaAbstrata;
import com.AbstractFactory.Interfaces.IMesa;
import com.AbstractFactory.Interfaces.ISofa;

public class Aplicacao {

    private ICadeira cadeira;
    private IMesa mesa;
    private ISofa sofa;

    public Aplicacao(IFabricaAbstrata fabrica) {
        cadeira = fabrica.criarCadeira();
        mesa = fabrica.criarMesa();
        sofa = fabrica.criarSofa();
    }

    public void resultado() {
        cadeira.resultado();
        mesa.resultado();
        sofa.resultado();
    }
}
