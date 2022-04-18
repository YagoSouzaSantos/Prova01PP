package com.AbstractFactory.Produtos.ProdutosModernos;

import com.AbstractFactory.Interfaces.ICadeira;

public class CadeiraModerna implements ICadeira {

    @Override
    public void resultado() {
        System.out.println("Criando cadeira moderna..........");
    }
}
