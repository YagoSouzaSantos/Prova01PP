package com.FactoryMethod;

import com.FactoryMethod.Fabricas.FabricaAbstrata;
import com.FactoryMethod.Fabricas.FabricaBarco;
import com.FactoryMethod.Fabricas.FabricaCaminhao;

public class Main {

    public static void main(String[] args) {
        FabricaAbstrata minhaFabrica;
        String escolha = "Caminhao";
        String nome = "Amanda";


        if (escolha == "barco")
            minhaFabrica = new FabricaBarco();
        else
            minhaFabrica = new FabricaCaminhao();

        minhaFabrica.criartransporte();
        minhaFabrica.entregaDeObejto(nome);

    }
}
