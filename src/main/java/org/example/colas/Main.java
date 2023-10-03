package org.example.colas;

public class Main {

    public static void main(String[] args) {
    int n = 10;

    Cola cola = new Cola(n);

    cola.incertarElemento(1);
    cola.incertarElemento(4);
    cola.incertarElemento(7);
    cola.incertarElemento(2);

    System.out.println(cola.cola[3]);
    System.out.println(cola.muestraElementos());



    }
}
