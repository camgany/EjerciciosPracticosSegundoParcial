package Ejercicio6.structure;

public class ConcreteMediator implements Mediator{

    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;
    //necesitamos uqe los objetos se instancien desde afuera

    public ConcreteMediator setUser1(ConcreteColleague1 user1) {
        this.user1 = user1;
        return this;
    }

    public ConcreteMediator setUser2(ConcreteColleague2 user2) {
        this.user2 = user2;
        return this;
    }
    //aca va a cambiar la logica
    //aca es donde va a cambiar la logica
    //decimos quienes reciben o dan mensajes
    @Override
    public void send(String msg, Colleague colleague) {
        //quienes reciben mensajes y quienes mandan mensajes, podemos poner un if case
        //un mapa,
        if (colleague == user1)
            user2.received(msg);
        else
            user1.received(msg);
    }
}
