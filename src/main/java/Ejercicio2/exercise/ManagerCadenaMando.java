package Ejercicio2.exercise;

public class ManagerCadenaMando implements ICadenaMando {

    private ICadenaMando next;

    @Override
    public void setNext(ICadenaMando handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        ConcreteGeneral resp1= new ConcreteGeneral();
        this.setNext(resp1);

        ConcreteTeniente resp2 = new ConcreteTeniente();
        resp1.setNext(resp2);

        ConcreteCoronel resp3 = new ConcreteCoronel();
        resp2.setNext(resp3);

        ConcreteCabo respFinal = new ConcreteCabo();
        resp3.setNext(respFinal);

        this.next.criteriaHandler(orden);
    }

    @Override
    public ICadenaMando next() {
        return next;
    }
}