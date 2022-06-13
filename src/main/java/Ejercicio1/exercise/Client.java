package Ejercicio1.exercise;

public class Client {
    public static void main(String[] ardssd) {
        Estudiante estudiante = new Estudiante();
        Tutor tutor = new Tutor("Carlos","46457");
        estudiante.addTesis(tutor,new ConcreteObject("La casa", "La casa azul","Revision1"));
        estudiante.addTesis(tutor, new ConcreteObject("La casa","La casa roja", "Revision2"));
        estudiante.addTesis(tutor,new ConcreteObject("La casa", "La casa verde","Revision3"));
        estudiante.addTesis(tutor,new ConcreteObject("La casa", "La casa negra","Revision4"));
        estudiante.addTesis(tutor,new ConcreteObject("La casa", "La casa amarilla","Revision5"));
        estudiante.restore(3);
    }
}
