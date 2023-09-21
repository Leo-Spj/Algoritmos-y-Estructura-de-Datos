package org.example.listasEnlazadas;

public class Main {

    public static void main(String[] args) {

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        lista.insertarNodexInicio("Leo");
        lista.insertarNodexInicio("Vale");
        lista.insertarNodexInicio("Yvan");
        lista.insertarNodexInicio("Fatima");
        lista.insertarNodexInicio("Ceci");

        System.out.println(lista.recorreLE());

        System.out.println(lista.buscarNombre("Leo"));
    }
}