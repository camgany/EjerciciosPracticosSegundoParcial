package Ejercicio2.exercise;

public class ConcreteCabo implements ICadenaMando {
    private ICadenaMando next;
    @Override
    public void setNext(ICadenaMando handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (orden == "Limpieza"){
            System.out.println("El cabo se encargara de la limpieza del cuartel!");
        }

    }

    @Override
    public ICadenaMando next() {
        return next;
    }
}