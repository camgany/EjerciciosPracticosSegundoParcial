package Ejercicio2.exercise;

public class ConcreteTeniente implements ICadenaMando {
    private ICadenaMando next;
    @Override
    public void setNext(ICadenaMando handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (orden == "Disciplina"){
            System.out.println("El teniente impondra disciplina!");
        } else {
            next.criteriaHandler(orden);
        }

    }

    @Override
    public ICadenaMando next() {
        return next;
    }
}