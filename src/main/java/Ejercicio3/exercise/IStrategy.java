package Ejercicio3.exercise;

import java.util.List;

public interface IStrategy {
    void execute(List<Celular> celulars, String modelo, int precio);
}