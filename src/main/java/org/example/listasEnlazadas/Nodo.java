package org.example.listasEnlazadas;

public class Nodo {

    private String dato;
    private Nodo Apuntador;

    Nodo(String dato){
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getApuntador() {
        return Apuntador;
    }

    public void setApuntador(Nodo next) {
        Apuntador = next;
    }

}
