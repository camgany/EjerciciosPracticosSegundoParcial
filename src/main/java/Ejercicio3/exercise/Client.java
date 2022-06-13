package Ejercicio3.exercise;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main (String[]args){
        List<Celular> c1 = new ArrayList<>();
        c1.add(new Celular("Mi A1","XIAOMI", "ALTA",1243));
        c1.add(new Celular("S 10","SAMSUNG", "BAJA",1332));
        c1.add(new Celular("IPHONE X","APPLE", "ALTA",2333));
        c1.add(new Celular("P50 Pocket","HUAWEI", "ALTA",5543));
        c1.add(new Celular("NOVA Y70","HUAWEI", "BAJA",1243));
        c1.add(new Celular("IPHONE 9","APPLE", "ALTA",2333));
        Tienda context = new Tienda("a");
        context.execute(c1," ",1243);
        List<Celular> c2 = new ArrayList<>();
        c2.add(new Celular("J7","SAMSUNG", "ALTA",2655));
        c2.add(new Celular("S1","SAMSUNG", "BAJA",1000));
        c2.add(new Celular("IPHONE 5","APPLE", "ALTA",2100));
        c2.add(new Celular("P20","HUAWEI", "ALTA",1330));
        context.execute(c2,"S1",0);
    }

}