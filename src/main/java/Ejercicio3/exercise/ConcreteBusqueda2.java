package Ejercicio3.exercise;

import java.util.List;

public class ConcreteBusqueda2 implements IStrategy{
    @Override
    public void execute(List<Celular>celulars,String modelo, int precio) {
        System.out.println("USTED ESTA UTILIZANDO EL ALGORITMO 2");
        boolean encontrado = false;
        int contador = 0;
        while(!encontrado) {
            if (celulars.get(contador).getModelo().equals(modelo) || celulars.get(contador).getPrecio() == precio) {
                System.out.println("El celular que busca es: Modelo- " + celulars.get(contador).getModelo() + " Precio- " +
                        celulars.get(contador).getPrecio() + " Gama- " + celulars.get(contador).getGama() + " Marca- "
                        + celulars.get(contador).getMarca());
                encontrado = true;
            }
        contador++;
        }
    }
}