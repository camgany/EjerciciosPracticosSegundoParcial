package Ejercicio5.structure.observer;

public class ConcreteObserver implements IObserver {
    @Override
    public void update(String msg) {
        // colocamos logica basados en el mensaje recibido
        System.out.println("ConcreteObserver tiene una notificacion de un evento");
        System.out.println("MSG: "+msg);

    }
}