package Ejercicio5.structure.memento;

public class Memento {
    private ConcreteObject state;

    public Memento (ConcreteObject concreteObject){
        state=concreteObject;
    }

    public ConcreteObject getState() {
        return state;
    }
}