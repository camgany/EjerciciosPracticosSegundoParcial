package Ejercicio7.exercise;

public class ConcreteHandler1 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        double a = Prestamo.getInstance().getPrestamo() * 0.25;

        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (amount<a){
            System.out.println("El cajero sse encargara de su pago por el monto de: "+amount+"Bs");
        } else {
            next.criteriaHandler(amount);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
