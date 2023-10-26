package org.example.recursividad;

public class Recursividad {
    private int a[];
    private int numMenor;
    private int ultimo;

    public Recursividad(int b[]){
        a = b;
    }

    public int sumador(){
        int n=a.length-1;
        return sumaArreglo(n);
    }

    public int sumaArreglo(int n){
        int suma = 0;

        if(n<0){
            suma=0;
        } else {
            suma = a[n] + sumaArreglo(n-1);
        }

        return suma;
    }

    public int sumadorPar(){
        int n=a.length-1;
        return sumaArregloPar(n);
    }
    public int sumaArregloPar(int n){
        int suma = 0;

        if(n<0){
            suma=0;
        } else {
            if (a[n] % 2 == 0){
                suma = a[n] + sumaArreglo(n-1);
            } else {
                suma = sumaArreglo(n - 1);
            }
        }
        return suma;
    }

    public int sumadorMenoresUltimo(){
        int n=a.length-1;
        ultimo = a[n];
        return sumaArregloMenoresUltimo(n);
    }

    public int sumaArregloMenoresUltimo(int n){
        int suma = 0;

        if(n<0){
            suma=0;
        } else {
            int x = a[n];
            if (x < this.ultimo){
                suma = x + sumaArregloMenoresUltimo(n-1);
            } else {
                suma = sumaArregloMenoresUltimo(n - 1);
            }
        }

        return suma;
    }

    public int calculadorMenor(){
        int n = a.length -1;
        return menor(n);
    }

    public int menor(int n) {

        int menor = a[n];

        if( numMenor == 0){
            numMenor = menor;
        } else if(n>0) {
            menor = menor(n-1);
            if(numMenor > menor){
                numMenor = menor;
            }
        }

        return numMenor;
    }
}
