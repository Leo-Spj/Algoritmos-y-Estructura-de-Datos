package org.example.algoritmos;

public class Ordenamiento {

    // Metodo que crea un array de tamaño n y lo llena con numeros aleatorios entre 0 y 100
    public int[] crearArray(int n){
        int array[] = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }

    public int[] deBurbuja(int[] array){
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

    public int[] porSelección(int[] array){
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
