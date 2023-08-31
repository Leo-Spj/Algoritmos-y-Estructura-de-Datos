/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.algoritmos.clase03;

import java.util.Arrays;

/**
 *
 * @author lsilvau
 */
public class cOrdenamiento {
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
