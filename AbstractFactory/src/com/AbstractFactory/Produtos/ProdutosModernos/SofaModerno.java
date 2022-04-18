package com.AbstractFactory.Produtos.ProdutosModernos;

import com.AbstractFactory.Interfaces.ISofa;

public class SofaModerno implements ISofa {
    @Override
    public void resultado() {
        System.out.println("Criando sofa moderno.......");
    }
}
