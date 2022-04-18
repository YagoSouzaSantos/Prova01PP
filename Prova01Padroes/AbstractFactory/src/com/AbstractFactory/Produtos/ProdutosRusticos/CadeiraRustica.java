package com.AbstractFactory.Produtos.ProdutosRusticos;

import com.AbstractFactory.Interfaces.ICadeira;

public class CadeiraRustica implements ICadeira {
    @Override
    public void resultado() {
        System.out.println("Criando cadeira rustica..........");
    }
}
