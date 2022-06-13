package Ejercicio1.exercise;

public class Estudiante {
    private String nombre;
    private String ci;
    private ConcreteObject concreteObject;
    private Caretaker caretaker = new Caretaker();
    private Originator originator = new Originator();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void addTesis(Tutor tutor,ConcreteObject concreteObject){
        concreteObject = concreteObject;
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento());

    }

    public void restore(int position){
        concreteObject= originator.restoreMemento(caretaker.getMemento(position));
        System.out.println("*************VALORES ACTUALES ********************");
        concreteObject.showInfo();
    }
}
