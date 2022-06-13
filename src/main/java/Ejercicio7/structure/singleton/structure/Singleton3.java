package Ejercicio7.structure.singleton.structure;

import java.util.Date;

public class Singleton3 {
    //se instancia una vez sin importar cuantas veces lo llamemos
    // 2) attribute del mismo tipo, private, static
    private static Singleton3 instance;

    // 1) constructor private
    private Singleton3(){
        System.out.println("*-*-* Creando mi singleton 3.....");
        //logic
    }

//control de multi hilos
    private synchronized static void  multiThreadControl(){
        if (instance== null)
            instance= new Singleton3();
        //evita que la instancia se genere varias veces
    }


    // 3) method public static - para el acceso global
    //podemos usar aca el syncronized public synchronized static
    public static Singleton3 getInstance(){
        // garantiza que la instancia es unica
        if (instance== null)
            multiThreadControl();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
}
