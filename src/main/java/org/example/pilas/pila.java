package org.example.pilas;

public class pila {

    public int[] pila;
    private int top;
    private int tamaño;

    public pila(int n) {
        this.pila = new int[n];
        this.tamaño = n;
        this.pilaVacia();
    }

    public void pilaVacia() {
        this.top = -1;

    }

    public void insertarElemento(int valor) {
        if (this.top < this.tamaño - 1) {
            ++this.top;
            this.pila[this.top] = valor;
        }

    }

    public void eliminarElemento() {
        if (this.top > -1) {
            --this.top;
        }

    }

    public int acceso() {
        int valor = 0;
        if (this.top > -1) {
            valor = this.pila[this.top];
        }

        return valor;
    }

    public String muestraElementos() {
        String cadena = "";
        if (this.top > -1) {
            for(int i = 0; i <= this.top; ++i) {
                cadena = cadena + this.pila[i] + " ";
            }
        }

        return cadena;
    }

}
