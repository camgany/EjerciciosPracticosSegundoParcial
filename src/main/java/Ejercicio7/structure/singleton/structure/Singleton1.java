package Ejercicio7.structure.singleton.structure;

import java.util.Date;

public class Singleton1 {
    // 2) atributo del mismo tipo, private, static, debe ser private y estatico
    private static Singleton1 instance;//eso quiere decir mismo tipo y instancia

    // 1) constructor private constructor privado que indica
    private Singleton1(){
        System.out.println("*-*-* Creando mi singleton .....");
        //logic podemos añadir logica
    }

    // 3) method public static - para el acceso global
    public static Singleton1 getInstance(){
        // garantiza que la instancia es unica, se verifica que la instancia es unica
        if (instance== null)
            instance= new Singleton1();
        return instance;//sino se crea uno que ya exista
    }

    public void time(){
        System.out.println("time: "+new Date());
    }
// podemos resetear el singleton a null otra vez
    public void resetSingleton(){
        instance=null;
    }
}
