package Ejercicio4.exercise;

public class Usuario extends Persona {

    public Usuario(IComunicacion canalComunication) {
        super(canalComunication);
    }

    @Override
    public void send(String msg, String tipo, Persona persona) {
        canalComunication.send(msg,this,tipo, persona);
    }

    @Override
    public void received(String msg) {
        System.out.println("Para: "+getName());
        System.out.println("Mensaje: "+msg);
    }
}