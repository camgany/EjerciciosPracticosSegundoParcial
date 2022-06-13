package Ejercicio5.exercise;

public class Desarrollador implements IDesarrollador {

    private String nombre;
    private String ci;

    public Desarrollador(String nombre, String ci) {

        this.nombre = nombre;
        this.ci = ci;

    }


    @Override
    public void update(String msg, Commit commit) {

        System.out.println("MENSAJE PARA: " + nombre  + msg + "; adjuntado con el commit: ");
        System.out.println("Commit: "+commit.getCodigo());

    }
}