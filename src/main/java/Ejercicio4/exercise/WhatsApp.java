package Ejercicio4.exercise;

import java.util.ArrayList;
import java.util.List;

public class WhatsApp implements IComunicacion {

    List<Usuario> profesionalChat = new ArrayList<>();

    public WhatsApp addUsuario(Usuario profesional){
        profesionalChat.add(profesional);
        return this;
    }

    @Override
    public void send(String msg, Persona envio, String tipo, Persona recibir) {
        Usuario emisor = (Usuario) envio;
        if (recibir==null|| !emisor.getCi().equals(recibir.getCi())&& profesionalChat.contains(recibir)){
            if(tipo == "1 a 1") {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Mensaje enviado en Comunicacion 1 a 1");
                System.out.println("De: "+envio.getName());
                recibir.received(msg);
            }else if (tipo == "todos"){
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Mensaje enviado a todos");
                for (Persona p: profesionalChat
                     ) {
                    if (!emisor.getCi().equals(p.getCi())){
                        System.out.println("De: "+envio.getName());
                        p.received(msg);
                    }
                }
            }
        }

    }
}