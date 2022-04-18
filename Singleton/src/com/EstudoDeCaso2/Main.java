package com.EstudoDeCaso2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Database context = Database.getInstance();

        ArrayList<String> db = new ArrayList();
        db.add("Mario, 201712245036, 5 semestre");
        db.add("Kaique Nascimento, 201911240001, 3 semestre");
        db.add("Aderlan Viana, 201911240045, 9 semestre");


        if(context != null)
            db.add("Yago Souza, 201911240036, 5 semestre");


        //LEITURA DOS DADOS DENTRO DO ARRAY
        for (int i= 0; i < 4; i++) {
            if (db.get(i) != null)
                System.out.printf("Posição %d- %s\n", i, db.get(i));
            else{

            }

        }
    }
}
