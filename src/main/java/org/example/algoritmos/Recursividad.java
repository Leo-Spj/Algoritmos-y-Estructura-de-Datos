package org.example.algoritmos;

public class Recursividad {

    // esta recursividad es muy ineficiente dado que su O(n) es de 2^n (exponencial), la mejor forma de hacerlo es con un bucle de crecimiento lineal
    public int fibRecursivo(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return fibRecursivo(n-1) + fibRecursivo(n-2);
        }
    }

    // fibonacci con bucle, su crecimiento es lineal O(n). Este es el mejor método para hacerlo, no se usa recursividad
    public int fibIterativo(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
