package org.example.listasEnlazadas;

public class Node {
    String nombre;
    Node siguiente;

    public Node(String nombre) {
        this.nombre = nombre;
    }

    public Node(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}
