package org.example.listasEnlazadas;

public class ListaEnlazadaSimple {
    private Node inicio, nuevo, p;

    public void insertarNodexInicio(String nombre){
        nuevo = new Node(nombre);

        if(inicio == null){
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public String recorreLE(){
        String cadena = "";
        p = inicio;
        while (p != null){
            cadena += p.getNombre() + " ";
            p = p.getSiguiente();
        }

        return cadena;
    }

    public String buscarNombre(String nombre){

        p = inicio;
        while (p != null){
            if(p.getNombre().equals(nombre)){
                return "El nombre " + nombre + " se encuentra en la lista";
            }
            p = p.getSiguiente();
        }

        return "El nombre " + nombre + " no se encuentra en la lista";

    }


}
