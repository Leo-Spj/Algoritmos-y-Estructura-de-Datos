package org.example.colas;

public class Cola {

    public int cola[];
    private int first, last, tamaño;

    public Cola(int n){
        cola = new int[n];
        colaVacia();
    }

    public void colaVacia() {
        first = -1;
        last = -1;
    }

    public void incertarElemento(int valor){
        if (last < tamaño-1){
            last++;
            cola[last] = valor;

            if (first == -1){
                first++;
            }
        }
    }

    public void eliminarElemento(){
        int valor;
        if(first > -1){
            valor = cola[first];
            first++;
            if(first > last){
                colaVacia();
            }
        }
    }

    public int acceso(){
        int valor = 0;
        if(first > -1) {
            valor = cola[first];

        }
        return valor;
    }

    public String muestraElementos(){
        String cadena = "";
        if (first > -1){
            for (int i = first; i <= last; i++){
                cadena += cola[i] + " ";
            }
        }

        return cadena;
    }

}
