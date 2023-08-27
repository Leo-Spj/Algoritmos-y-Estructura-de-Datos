package org.example;

import java.util.Arrays;

import org.example.algoritmos.Ordenamiento;

public class MainOrdenamiento {
    public static void main(String[] args) {

        Ordenamiento ordenamiento = new Ordenamiento();

        int arrayDesordenado[] = ordenamiento.crearArray(50000);

        System.out.println("Desordenado:"+Arrays.toString(arrayDesordenado));

        Thread hilo1 = new Thread(new Runnable() {
            public void run() {
                long startTime1 = System.currentTimeMillis();
                    System.out.println("Burbuja:" + Arrays.toString(ordenamiento.deBurbuja(arrayDesordenado)));
                long endTime1 = System.currentTimeMillis();
                long elapsedTimeBur = endTime1 - startTime1;
                System.out.println("Burbuja:  "+elapsedTimeBur);
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            public void run() {
                long startTime2 = System.currentTimeMillis();
                    System.out.println("Seleccion:" + Arrays.toString(ordenamiento.porSelección(arrayDesordenado)));
                long endTime2 = System.currentTimeMillis();
                long elapsedTimeSel = endTime2 - startTime2;
                System.out.println("Seleccion:  "+elapsedTimeSel);
            }
        });

        hilo1.start();
        hilo2.start();

    }
}