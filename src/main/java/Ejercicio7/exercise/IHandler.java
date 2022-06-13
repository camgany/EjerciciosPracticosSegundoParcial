package Ejercicio7.exercise;

public interface IHandler {
    Persona persona = new Persona("","");
    void setNext(IHandler handler);
    void criteriaHandler(int amount);
    IHandler next();
}
