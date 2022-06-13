package Ejercicio6.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();
    //necesitamos uqe los objetos se instancien desde afuera

    public void addDesarrollador(Colleague colleague){
        colleagues.add(colleague);
    }


    @Override
    public void send(String msg, Colleague colleagueEnviador, String type, Colleague colleagueRecibidor) {
        if(!colleagueEnviador.equals(colleagueRecibidor)){
            if(type == "GLOBAL") {
                System.out.println("---------------------------USTED ENVIO UN MENSAJE GLOBAL---------------------------------");
                for (Colleague colleage : colleagues
                ) {
                    if (!colleage.equals(colleagueEnviador)) {
                        System.out.println("DE: "+colleagueEnviador.nombre);
                        colleage.received(msg);
                    }
                }
            }else if (type == "PERSONAL" && colleagues.contains(colleagueRecibidor)){
                System.out.println("---------------------------USTED ENVIO UN MENSAJE PERSONAL---------------------------------");
                System.out.println("DE: "+colleagueEnviador.nombre);
                colleagueRecibidor.received(msg);
            }
        }
    }
    //aca va a cambiar la logica
    //aca es donde va a cambiar la logica
    //decimos quienes reciben o dan mensajes

}
