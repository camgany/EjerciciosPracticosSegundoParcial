package Ejercicio3.exercise;

import java.util.List;

public class Tienda {
    String nombre;
    IStrategy strategy;
    Celular[] celulares;

    public Tienda(String nombre) {
        this.nombre = nombre;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }



    public void execute(List<Celular> celulars, String modelo, int precio){
        if (celulars.size()>5){
            setStrategy(new ConcreteBusqueda2());
            strategy.execute(celulars, modelo, precio);
        }else{
            setStrategy(new ConcreteBusqueda1());
            strategy.execute(celulars, modelo, precio);
        }

    }


}
