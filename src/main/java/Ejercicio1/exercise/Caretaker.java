package Ejercicio1.exercise;

import java.util.ArrayList;
import java.util.List;

//Lo que va a contener everything
public class Caretaker {
    // objeto que almacena momentos/stados ---> LIST
    private List<Memento> stateList = new ArrayList<>();

    public void addMemento(Memento m){
        stateList.add(m);
    }

    // forma de obtener objetos de nuestro almacenador de datos ---> LIST
    public Memento getMemento(int position){
        return stateList.get(position-1);
    }


}