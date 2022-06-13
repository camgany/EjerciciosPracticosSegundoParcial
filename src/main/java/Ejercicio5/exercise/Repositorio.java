package Ejercicio5.exercise;

import java.util.*;

public class Repositorio implements IRepositorio {

    private Map<String, Commit> almacenamientoDeCommits = new HashMap<>();

    private List<IDesarrollador> desarrolladores = new ArrayList<>();

    public void createCodeVersion(String commitIdentifier, Commit commit) {

        almacenamientoDeCommits.put(commitIdentifier, commit);

    }

    public Commit getCommit(String commitIdentifier) {

        return almacenamientoDeCommits.get(commitIdentifier);

    }

    @Override
    public void attach(IDesarrollador desarrollador) {

        desarrolladores.add(desarrollador);

    }

    @Override
    public void dettach(IDesarrollador desarrollador) {

        desarrolladores.remove(desarrollador);

    }


    @Override
    public void notifyDesarrolladores(Commit commit) {

        for(IDesarrollador desarrollador: desarrolladores) {

            desarrollador.update("Commit Recuperado!", commit);
        }

    }
}
