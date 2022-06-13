package Ejercicio7.exercise;

public class ConcreteHandler4 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (amount == Prestamo.getInstance().getPrestamo()){
            System.out.println("El encargado de prestamos esta le entraga todo sus documentos");
            System.out.println("Nombre: "+persona.getNombre());
            System.out.println("CI: "+persona.getCi());
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}