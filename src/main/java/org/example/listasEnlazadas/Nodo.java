package org.example.listasEnlazadas;

public class Nodo {

    private String dato;
    private Nodo apuntador;

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
        return apuntador;
    }

    public void setApuntador(Nodo next) {
        apuntador = next;
    }

}
