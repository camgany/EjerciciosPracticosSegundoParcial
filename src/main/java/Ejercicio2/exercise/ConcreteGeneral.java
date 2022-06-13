package Ejercicio2.exercise;

import java.util.Random;

public class ConcreteGeneral implements ICadenaMando {
    private ICadenaMando next;
    private int a = new Random().nextInt(30);

    @Override
    public void setNext(ICadenaMando handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (orden == "Entrevista"){
            System.out.println("Su cita con el general esta agendada. Tiene el turno "+ a);
        } else {
            next.criteriaHandler(orden);
        }

    }

    @Override
    public ICadenaMando next() {
        return next;
    }
}
