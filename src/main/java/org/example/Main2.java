package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayDesordenado = new ArrayList<Integer>();

        arrayDesordenado.addAll(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

        //obtener el tamaño del array
        int tamaño = arrayDesordenado.size();

        System.out.println(tamaño);

        System.out.println("Fibonacci: "+fibonacci(1));
    }

    public static int[] ordenar(int[] array){

        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                int pequeño = array[j];
                for (int k = j; k < array.length; k++){
                    if (array[k] < pequeño){
                        pequeño = array[i];
                    }
                }
            }
        }
        return array;
    }

    // Recursividad
    // esta recursividad es muy ineficiente dado que su O(n) es de 2^n (exponencial), la mejor forma de hacerlo es con un bucle de crecimiento lineal
    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // fibonacci con bucle, su crecimiento es lineal O(n). Este es el mejor método para hacerlo, no se usa recursividad
    public static int fibonacci2(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}