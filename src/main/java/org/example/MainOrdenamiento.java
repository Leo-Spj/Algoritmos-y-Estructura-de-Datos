package org.example;

import java.util.Arrays;

import org.example.algoritmos.*;

public class MainOrdenamiento {
    public static void main(String[] args) {

        Ordenamiento ordenamiento = new Ordenamiento();
        Busqueda busqueda = new Busqueda();


        int arrayDesordenado[] = ordenamiento.crearArray(30);
        int arrayDesordenado2[] = ordenamiento.crearArray(30);
        int arrayDesordenado3[] = ordenamiento.crearArray(30);
        int arrayDesordenado4[] = ordenamiento.crearArray(30);

        System.out.println("Desordenado:"+Arrays.toString(arrayDesordenado));
        System.out.println("Desordenado 2:"+Arrays.toString(arrayDesordenado2));


        Thread hilo1 = new Thread(new Runnable() {
            public void run() {
                long startTime1 = System.currentTimeMillis();
                    System.out.println("Burbuja:" + Arrays.toString(ordenamiento.deBurbuja(arrayDesordenado))); // para 80000 demora 31456
                long endTime1 = System.currentTimeMillis();
                long elapsedTimeBur = endTime1 - startTime1;
                System.out.println("Burbuja:  "+elapsedTimeBur);
            }
        });


        Thread hilo2 = new Thread(new Runnable() {
            public void run() {
                long startTime2 = System.currentTimeMillis();
                    System.out.println("Seleccion:" + Arrays.toString(ordenamiento.porSelección(arrayDesordenado2))); // para 80000 demora 5663
                long endTime2 = System.currentTimeMillis();
                long elapsedTimeSel = endTime2 - startTime2;
                System.out.println("Seleccion:  "+elapsedTimeSel);
            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            public void run() {
                //usando el sort
                long startTime3 = System.currentTimeMillis();
                    Arrays.sort(arrayDesordenado3); // para 80000 demora 35 ms
                    System.out.println("Sort:" + Arrays.toString(arrayDesordenado3));
                long endTime3 = System.currentTimeMillis();
                long elapsedTimeSort = endTime3 - startTime3;
                System.out.println("Sort:  "+elapsedTimeSort);

            }
        });

        Thread hilo4 = new Thread(new Runnable() {
            public void run() {
                //usando el sort
                long startTime3 = System.currentTimeMillis();
                System.out.println("Busqueda desorden: " + Arrays.toString(arrayDesordenado4));
                System.out.println("Busqueda indice:" +  busqueda.busquedaOrdenada(arrayDesordenado4, 10));
                long endTime3 = System.currentTimeMillis();
                long elapsedTimeSort = endTime3 - startTime3;
                System.out.println("Busqueda tiempo:  "+elapsedTimeSort);

            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}