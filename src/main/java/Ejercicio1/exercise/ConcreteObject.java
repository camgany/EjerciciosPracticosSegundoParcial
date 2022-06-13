package Ejercicio1.exercise;

public class ConcreteObject {
    //tesis
    private String contenido;
    private String state;
    private String nombre;


    public ConcreteObject(String nombre, String contenido, String state) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.state = state;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showInfo() {

        System.out.println("state  : "+state );
        System.out.println("--------------------"+nombre+"--------------------");
        System.out.println("Contenido : "+contenido);
    }
}