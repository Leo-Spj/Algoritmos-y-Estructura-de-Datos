package org.example.listasEnlazadas;

public class LinkedList {

    private Nodo head;

    public void insertar(String dato) {

        Nodo nodo = new Nodo(dato);

        if (head == null) {
            head = nodo;
        } else {

            Nodo temp = head;

            while (temp.getApuntador() != null) {
                temp = temp.getApuntador();
            }
            temp.setApuntador(nodo);
        }
    }

    public void imprimir() {

        Nodo temp = head;

        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getApuntador();
        }
    }

    public void buscar(String dato){

        Nodo temp = head;

        while (temp != null) {
            if(temp.getDato().equals(dato)){
                System.out.println("Encontrado");
                break;
            }
            temp = temp.getApuntador();
        }

        if (temp == null){
            System.out.println("No encontrado");
        }
    }

}
