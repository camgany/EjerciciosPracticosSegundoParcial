package Ejercicio4.exercise;

public abstract class Persona {
    protected IComunicacion canalComunication;
    private String ci;
    private String name;
    public Persona(IComunicacion canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }



    public abstract void send(String msg, String tipo, Persona persona);
    public abstract void received(String msg);
}