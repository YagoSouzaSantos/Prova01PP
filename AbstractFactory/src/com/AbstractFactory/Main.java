package com.AbstractFactory;

import com.AbstractFactory.FabricasConcretas.FabricaModerna;
import com.AbstractFactory.FabricasConcretas.FabricaRustica;
import com.AbstractFactory.Interfaces.IFabricaAbstrata;

import java.util.Scanner;

public class Main {
    public static Aplicacao configureApplication(int fabricaSelecionada) {
        Aplicacao app;
        IFabricaAbstrata fabrica;

        if (fabricaSelecionada == 0 ) {
            fabrica = new FabricaModerna();
            app = new Aplicacao(fabrica);
        } else {
            fabrica = new FabricaRustica();
            app = new Aplicacao(fabrica);
        }
        return app;
    }

    public static void main(String[] args) {
        String modelo = "rustico";

        IFabricaAbstrata minhaFabrica;


        Scanner in = new Scanner( System.in );

        System.out.print("Informe 0 para criar moveis modernos e 1 para rusticos: ");
        int fabricaSelecionada = in.nextInt();

        Aplicacao app = configureApplication(fabricaSelecionada);
        app.resultado();



    }
}
