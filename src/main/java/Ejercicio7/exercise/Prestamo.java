package Ejercicio7.exercise;

public class Prestamo {
    private static Prestamo instance;
    private int prestamo;
    private Prestamo(){
        prestamo = 100;
        System.out.println("El prestamo es: "+prestamo);
    }
    public static Prestamo getInstance(){
        if(instance == null)
            instance = new Prestamo();
        return instance;
    }
    public int getPrestamo() {
        return prestamo;
    }

}
