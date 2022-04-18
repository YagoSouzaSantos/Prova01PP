package com.AbstractFactory.FabricasConcretas;

import com.AbstractFactory.Interfaces.ICadeira;
import com.AbstractFactory.Interfaces.IFabricaAbstrata;
import com.AbstractFactory.Interfaces.IMesa;
import com.AbstractFactory.Interfaces.ISofa;
import com.AbstractFactory.Produtos.ProdutosModernos.CadeiraModerna;
import com.AbstractFactory.Produtos.ProdutosModernos.MesaModerna;
import com.AbstractFactory.Produtos.ProdutosModernos.SofaModerno;

public class FabricaModerna implements IFabricaAbstrata {
    @Override
    public ICadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public ISofa criarSofa() {
        return new SofaModerno();
    }
}
