package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayDesordenado = new int[80000];
        for(int i = 0; i < arrayDesordenado.length; i++){
            arrayDesordenado[i] = (int) (Math.random()*100);
        }
        System.out.println("Desordenado:"+Arrays.toString(arrayDesordenado));

        Thread hilo1 = new Thread(new Runnable() {
            public void run() {
                long startTime1 = System.currentTimeMillis();
                    System.out.println("Ordenado1:" + Arrays.toString(ordenar1(arrayDesordenado)));
                long endTime1 = System.currentTimeMillis();
                long elapsedTime1 = endTime1 - startTime1;
                System.out.println("Tiempo 1:  "+elapsedTime1);
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            public void run() {
                long startTime2 = System.currentTimeMillis();
                    System.out.println("Ordenado2:" + Arrays.toString(ordenar2(arrayDesordenado)));
                long endTime2 = System.currentTimeMillis();
                long elapsedTime2 = endTime2 - startTime2;
                System.out.println("Tiempo 2:  "+elapsedTime2);
            }
        });

        hilo1.start();
        hilo2.start();
    }

    public static int[] ordenar1(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++ ){
                if(array[j+1] < array[j] ){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        return array;
    }

    public static int[] ordenar2(int[] array){
        int aux;
        int indice;
        for (int i = 0; i < array.length; i++){
            indice = i;
            int pequeño = array[i];
            for (int j = i; j < array.length; j++){
                if (array[j] < pequeño){
                    pequeño = array[j];
                    indice = j;
                }
            }
            aux = array[i];
            array[i] = array[indice];
            array[indice] = aux;
        }
        return array;
    }
}