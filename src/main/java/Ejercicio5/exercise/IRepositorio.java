package Ejercicio5.exercise;

public interface IRepositorio {
    void attach(IDesarrollador desarrollador);

    void dettach(IDesarrollador desarrollador);


    void notifyDesarrolladores(Commit commit);

}
