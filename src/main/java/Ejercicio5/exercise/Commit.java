package Ejercicio5.exercise;

import java.util.Random;

public class Commit {

    private Codigo state;

    public Commit(Codigo codigo) {

        state = codigo;

    }


    public Codigo getCodigo() {

        return state;

    }

}