package Ejercicio3.exercise;

import java.util.List;

public class ConcreteBusqueda1 implements IStrategy{
    @Override
    public void execute(List<Celular> celulars, String modelo, int precio) {
        System.out.println("USTED ESTA UTILIZANDO EL ALGORITMO 1");
        for (int x = 0; x < celulars.size(); x++) {
            Celular p = celulars.get(x);
            if (p.getModelo().equals(modelo) || p.getPrecio()==precio) {
                System.out.println("El celular que busca es: Modelo- "+p.getModelo()+" Precio- "+
                        p.getPrecio()+" Gama- "+p.getGama()+" Marca- "+p.getMarca());
                break;
            }
        }

    }
}