package Ejercicio1.exercise;

public class Originator {
    private ConcreteObject state;

    public void setMemento(ConcreteObject state){
        this.state=state;
    }

    public Memento createMemento(){
        return  new Memento(state);
    }

    public ConcreteObject restoreMemento(Memento m){
        this.state= m.getState();
        return this.state;
    }

}