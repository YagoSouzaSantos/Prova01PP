package com.AbstractFactory.Produtos.ProdutosModernos;

import com.AbstractFactory.Interfaces.IMesa;

public class MesaModerna implements IMesa {
    @Override
    public void resultado() {
        System.out.println("Criando mesa moderna.......");
    }
}
