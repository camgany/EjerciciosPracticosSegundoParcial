package Ejercicio6.exercise;

public interface Mediator {
    void send(String msg, Colleague colleagueEnviador, String type, Colleague colleagueRecibidor);
}