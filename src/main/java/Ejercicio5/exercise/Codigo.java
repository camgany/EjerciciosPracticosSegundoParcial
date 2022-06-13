package Ejercicio5.exercise;

public class Codigo {

    private String cotenido;

    public Codigo(String contenidoCodigo) {

        this.cotenido = contenidoCodigo;

    }

    public String getCotenido() {
        return cotenido;
    }

    public void setCotenido(String cotenido) {
        this.cotenido = cotenido;
    }

    public void showInfo() {

        System.out.println("Codigo: ");
        System.out.println("Ultimas lineas de codigo: " + cotenido);


    }

}