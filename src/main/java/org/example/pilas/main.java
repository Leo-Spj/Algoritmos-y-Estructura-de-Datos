package org.example.pilas;

public class main {
    public static void main(String[] args) {
        int n = 10;
        pila pila = new pila(n);
        pila.insertarElemento(1);
        pila.insertarElemento(4);
        pila.insertarElemento(7);
        pila.insertarElemento(2);


        System.out.println(pila.muestraElementos());
        pila.eliminarElemento();
        pila.eliminarElemento();
        System.out.println(pila.muestraElementos());

        // lexico sintatico semantico

        // codigo intermedio de java: bytecode

    }
}
