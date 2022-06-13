package Ejercicio7.structure.singleton.structure;

import java.util.Date;

public class Singleton2 {
    //atributo del mismo tipo
    //la palabra final no permite sobre escribir valores
    //lo malo es que el final no se puede destruir
    private static final Singleton2 instance= new Singleton2();
    //constructor privado
    private Singleton2(){
        System.out.println("*-*-* Creando mi singleton2 .....");
    }
    //metodo publico estatico
    public static Singleton2 getInstance(){
        return instance;
    }
    public void time(){
        System.out.println("time: "+new Date());
    }
}
