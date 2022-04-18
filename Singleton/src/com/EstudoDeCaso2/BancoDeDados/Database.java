package com.EstudoDeCaso2;

import java.util.ArrayList;

public class Database {

    private static Database database = null;


    private Database(){
        System.out.println("Conexão com banco de dados ativa!");
    }

    public static Database getInstance(){

        if (database == null){
            database = new Database();
        }

        return database;
    }


}
