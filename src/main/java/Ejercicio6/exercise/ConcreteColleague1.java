package Ejercicio6.exercise;


public class ConcreteColleague1 extends Colleague {

   public ConcreteColleague1(Mediator mediator, String nombre, String ci){
       super(mediator);
       this.ci = ci;
       this.nombre = nombre;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void send(String msg, String type, Colleague colleague) {
       mediator.send(msg, this, type, colleague);

    }

    @Override
    public void received(String msg) {
        System.out.println("PARA: " +getNombre());
        System.out.println("- MENSAJE: "+msg);
    }
}
