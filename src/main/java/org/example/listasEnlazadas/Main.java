package org.example.listasEnlazadas;

public class Main {

    public static void main(String[] args) {

        LinkedList lista = new LinkedList();
        lista.insertarFin("Fatima");
        lista.insertarFin("Valeria");
        lista.insertarFin("Cecilia");
        lista.insertarFin("Yvan");
        lista.insertarInicio("Prim1");
        lista.insertarInicio("Prim2");
        lista.insertarFin("Carlos");

        lista.eliminaInicio();

        lista.añadirDespuesDelNodo("Cecilia", "XXXXX");

        System.out.println(lista.imprimir());

        System.out.println("----------");

        lista.buscar("Yvan");

//        lista.ramdon(10);
//        System.out.println(lista.imprimir());


//        Prim1 Fatima Valeria Cecilia Yvan Carlos
//        ----------
//                Encontrado
    }
}