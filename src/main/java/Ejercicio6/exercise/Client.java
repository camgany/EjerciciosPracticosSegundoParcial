package Ejercicio6.exercise;

public class Client {
    public static void main(String[]args){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator,"Mario","1233");
        ConcreteColleague1 c2 = new ConcreteColleague1(mediator,"Laura","5653");
        ConcreteColleague1 c3 = new ConcreteColleague1(mediator,"Ricardo","6633");
        ConcreteColleague1 c4 = new ConcreteColleague1(mediator,"Juana","1877");
        mediator.addDesarrollador(c1);
        mediator.addDesarrollador(c2);
        mediator.addDesarrollador(c3);
        mediator.addDesarrollador(c4);

        c1.send("este mensaje es para indicar a todos que se cambio el codigo","GLOBAL",null);
        c1.send("este es un mensaje para indicar un minimo cambio en el diseno","PERSONAL",c4);
        //se ve en salida que le llega el mensaje


    }
}
