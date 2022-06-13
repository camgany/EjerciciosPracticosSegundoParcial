package Ejercicio2.exercise;

public interface ICadenaMando {

    void setNext(ICadenaMando handler);
    void criteriaHandler(String orden);
    ICadenaMando next();

}
