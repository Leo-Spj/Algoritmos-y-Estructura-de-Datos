package org.example.listasEnlazadas;

public class LinkedList {

    private Nodo head;

    public void insertarInicio(String dato) {

        Nodo nodo = new Nodo(dato);

        if (head == null) {
            head = nodo;
        } else {
            nodo.setApuntador(head);
            head = nodo;
        }
    }

    public void insertarFin(String dato) {

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

    public void eliminaInicio() {

        if (head != null) {
            head = head.getApuntador();
        }
    }

    public void eliminaFin() {

        if (head != null) {
            Nodo temp = head;
            Nodo temp2 = head;
            while (temp.getApuntador() != null) {
                temp2 = temp;
                temp = temp.getApuntador();
            }
            temp2.setApuntador(null);
        }
    }

    public String imprimir() {

        Nodo temp = head;
        String cadena = "";

        while (temp != null) {
            cadena += temp.getDato() + " ";
            temp = temp.getApuntador();
        }

        return cadena;
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

    public void ramdon(int n){
        String cadena = "";

        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 11);

            cadena += num + " ";

            if(num% 2 == 0){
                insertarFin(num + "");
            }

        }
        System.out.println(cadena);
    }

}
