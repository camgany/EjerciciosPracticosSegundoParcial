package Ejercicio7.structure.chainResponsability.structure;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(int amount);
    IHandler next();
}
