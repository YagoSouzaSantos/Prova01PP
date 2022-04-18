package com.AbstractFactory.FabricasConcretas;

import com.AbstractFactory.Interfaces.ICadeira;
import com.AbstractFactory.Interfaces.IFabricaAbstrata;
import com.AbstractFactory.Interfaces.IMesa;
import com.AbstractFactory.Interfaces.ISofa;
import com.AbstractFactory.Produtos.ProdutosRusticos.CadeiraRustica;
import com.AbstractFactory.Produtos.ProdutosRusticos.MesaRustica;
import com.AbstractFactory.Produtos.ProdutosRusticos.SofaRustico;

public class FabricaRustica implements IFabricaAbstrata {
    @Override
    public ICadeira criarCadeira() {
        return new CadeiraRustica();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaRustica();
    }

    @Override
    public ISofa criarSofa() {
        return new SofaRustico();
    }
}
