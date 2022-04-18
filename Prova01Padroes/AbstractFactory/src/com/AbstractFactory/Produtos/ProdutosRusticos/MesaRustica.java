package com.AbstractFactory.Produtos.ProdutosRusticos;

import com.AbstractFactory.Interfaces.IMesa;

public class MesaRustica implements IMesa {
    @Override
    public void resultado() {
        System.out.println("Criando mesa rustica..........");
    }
}
