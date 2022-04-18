package com.AbstractFactory.Produtos.ProdutosRusticos;

import com.AbstractFactory.Interfaces.ISofa;

public class SofaRustico implements ISofa {
    @Override
    public void resultado() {
        System.out.println("Criando sofa rustico..........");
    }
}
