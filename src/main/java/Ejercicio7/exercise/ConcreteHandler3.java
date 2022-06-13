package Ejercicio7.exercise;

public class ConcreteHandler3 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        double a = Prestamo.getInstance().getPrestamo() * 0.50;

        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (amount>a && amount < Prestamo.getInstance().getPrestamo()){
            System.out.println("El supervisor se encargara de su pago por el monto de: "+amount+"Bs");
            System.out.println("Desea conocer los nuevos tipos de prestamos?");
        } else {
            next.criteriaHandler(amount);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
