package org.example.listasEnlazadas;

public class Nodo {

    private String dato;
    private Nodo nextApuntador;

    Nodo(String dato){
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getNextApuntador() {
        return nextApuntador;
    }

    public void setNextApuntador(Nodo next) {
        nextApuntador = next;
    }

}
