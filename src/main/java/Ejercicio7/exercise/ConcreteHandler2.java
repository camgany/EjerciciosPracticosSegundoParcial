package Ejercicio7.exercise;

public class ConcreteHandler2 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        double a = Prestamo.getInstance().getPrestamo() * 0.25;
        double b = Prestamo.getInstance().getPrestamo() * 0.50;

        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (amount>= a && amount <= b){
            System.out.println("El agente de credito se encargara de su pago por el monto de: "+amount+"Bs");
            System.out.println("Desea refinanciar su prestamo?");
        } else {
            next.criteriaHandler(amount);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}