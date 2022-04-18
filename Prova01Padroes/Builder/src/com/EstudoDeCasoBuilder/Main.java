package com.EstudoDeCasoBuilder;

import com.EstudoDeCasoBuilder.ConcreteBuilders.BuilderNumeroSaldo;
import com.EstudoDeCasoBuilder.Director.Director;
import com.EstudoDeCasoBuilder.Interfaces.IBuilder;

public class Main {

    public static void main(String[] args) {
	IBuilder builder = new BuilderNumeroSaldo();
    Director director = new Director(builder);
    director.make(0);

    }
}
