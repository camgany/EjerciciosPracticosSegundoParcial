package Ejercicio5.exercise;

public class Client {

    public static void main(String[] args) {

        Git git = new Git();
        Repositorio repositorio = new Repositorio();
        Desarrollador d1 = new Desarrollador("Mario Rodriguez","3452");
        Desarrollador d2 = new Desarrollador("Manu Rios","6543");
        Desarrollador d3 = new Desarrollador("Juana Montero","4566");
        repositorio.attach(d1);
        repositorio.attach(d2);
        repositorio.attach(d3);

        Codigo codigo;
        codigo = new Codigo("Hi");
        git.setCodigo(codigo);
        repositorio.createCodeVersion("Primer commit", git.createCodeVersion());
        codigo = new Codigo("Hello World");
        git.setCodigo(codigo);
        repositorio.createCodeVersion("Segundo commit", git.createCodeVersion());
        codigo = new Codigo("Hello from Lambda");
        git.setCodigo(codigo);
        repositorio.createCodeVersion("Tercer commit", git.createCodeVersion());
        codigo = new Codigo("Hello from Dynamo DB");
        git.setCodigo(codigo);
        repositorio.createCodeVersion("Cuarto commit", git.createCodeVersion());
        codigo = new Codigo("Hello from Java");
        git.setCodigo(codigo);
        repositorio.createCodeVersion("Quinto commit", git.createCodeVersion());
        codigo.showInfo();
        codigo = git.restoreCode(repositorio.getCommit("Primer commit"), repositorio);

        codigo.showInfo();

        repositorio.dettach(d1);
        repositorio.dettach(d2);
        repositorio.dettach(d3);


        codigo = git.restoreCode(repositorio.getCommit("Quinto commit"), repositorio);

        codigo.showInfo();

    }

}