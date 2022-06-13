package Ejercicio6.exercise;

public abstract class Colleague {
    protected Mediator mediator;
    protected String nombre;
    protected String ci;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void send(String msg, String type, Colleague colleague);
    public abstract void received(String msg);
}