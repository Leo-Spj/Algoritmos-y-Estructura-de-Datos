package org.example.algoritmos;

import org.example.algoritmos.Recursividad;

public class MainRecursividad {

    public static void main(String[] args) {

        Recursividad recursividad = new Recursividad();

        System.out.println("Fibonacci Iterativo: "+recursividad.fibIterativo(7));
        System.out.println("Fibonacci Recursivo: "+recursividad.fibRecursivo(7));
    }
}