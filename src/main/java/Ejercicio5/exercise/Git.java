package Ejercicio5.exercise;

public class Git {

    private Codigo codigo;

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Commit createCodeVersion() {

        return new Commit(codigo);

    }

    public Codigo restoreCode(Commit commit, IRepositorio repositorio) {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("-------------------------REGRESANDO COMMIT---------------------------");
        this.codigo = commit.getCodigo();
        repositorio.notifyDesarrolladores(commit);
        return this.codigo;

    }
}
