package org.example.algoritmos;

import java.util.Arrays;

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

    public static class MainOrdenamiento {
        public static void main(String[] args) {

            Ordenamiento ordenamiento = new Ordenamiento();
            Busqueda busqueda = new Busqueda();


            int arrayDesordenado[] = ordenamiento.crearArray(30);
            int arrayDesordenado2[] = ordenamiento.crearArray(30);
            int arrayDesordenado3[] = ordenamiento.crearArray(30);
            int arrayDesordenado4[] = ordenamiento.crearArray(30);

            System.out.println("Desordenado:"+ Arrays.toString(arrayDesordenado));
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

    /**
     *
     * @author lsilvau
     */
    public static class cOrdenamiento {
        private int arreglo[];
        public cOrdenamiento(int n){
            arreglo = new int[n];
        }
        public void llenaArreglo(){
            int indMayor=arreglo.length-1;
            for (int i = 0; i <= indMayor; i++) {
                arreglo[i]=(int)(Math.random()*(50-5+1)+5);
            }
        }
        public String toString(){
            return Arrays.toString(arreglo);
        }
        public void burbuja_Intercambio(){
            int indMayor=arreglo.length-1; boolean ordenado=false;
            int temp;
            while(ordenado == false){
                ordenado= true;
                for (int i = 0; i < indMayor; i++) {
                    if(arreglo[i]> arreglo[i+1]){
                        temp=arreglo[i]; arreglo[i]=arreglo[i+1];
                        arreglo[i+1]= temp; ordenado= false;
                    }
                }
            }
        }
        public void insercion(){
            int indMayor=arreglo.length-1; int temp,ind=0;
            for (int i = 0; i <= indMayor; i++) {
                temp=arreglo[i];ind=i;
                for (int j = i-1; j >0; j--) {
                    if(temp< arreglo[j]){
                        arreglo[j+1]=arreglo[j];
                        ind= j-1;
                    }
                }
                arreglo[ind]=temp;
            }
        }
    }
}
