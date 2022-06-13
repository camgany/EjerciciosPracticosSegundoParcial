package Ejercicio2.exercise;

public class ConcreteCoronel implements ICadenaMando {
    private ICadenaMando next;
    @Override
    public void setNext(ICadenaMando handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (orden == "Desbloqueo" || orden == "Manifestaciones"){
            System.out.println("El coronel organizara el desbloqueo de la manifestacion!");
        } else {
            next.criteriaHandler(orden);
        }

    }

    @Override
    public ICadenaMando next() {
        return next;
    }
}
