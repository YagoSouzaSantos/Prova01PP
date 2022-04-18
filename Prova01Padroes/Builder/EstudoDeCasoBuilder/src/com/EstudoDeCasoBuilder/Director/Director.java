package com.EstudoDeCasoBuilder.Director;

import com.EstudoDeCasoBuilder.Interfaces.IBuilder;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder){
        this.builder = builder;
    };


    public int make(int tipo){

        if(tipo == 0){
            builder.buildNumeroConta();
            builder.buildSaldo();
        }else if(tipo == 1){
            builder.buildNomeCliente();
            builder.buildNumeroConta();
        }else if(tipo == 2){
            builder.buildNumeroConta();
            builder.buildNomeTitular();
        }else if(tipo == 3){
            builder.buildNumeroConta();
            builder.buildNomeTitular();
            builder.buildSaldo();
        }
        return tipo;
    }

}
