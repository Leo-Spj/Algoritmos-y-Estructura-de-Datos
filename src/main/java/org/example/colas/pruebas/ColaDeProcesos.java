package org.example.colas.pruebas;

public class ColaDeProcesos {

    private Proceso cabeza;
    private Proceso cola;
    private int tamaño = 0; // para saber cuantos procesos hay en la cola
    private int procesoMayor = 0; // solo si el tamaño es 0, el ultimo proceso es 0.


    public int getProcesoMayor() {
        return procesoMayor;
    }
    public int determinarUltimoProceso(){
        if (tamaño == 0) {
            procesoMayor = 0;
        } else {
            procesoMayor = procesoMayor + 1;
        }
        return procesoMayor;
    }

    public void agregarProceso(Proceso proceso) {

        if (cabeza == null) {
            cabeza = proceso;
        } else {
            cola.setSiguiente(proceso);
        }
        cola = proceso;
        tamaño++;

        proceso.setNombre(determinarUltimoProceso());

    }

    public void eliminarProceso() {
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
            tamaño--;

            int ultimo = procesoMayor;
            if (ultimo == 0) {
                procesoMayor = 0;
            } else {
                procesoMayor = procesoMayor - 1;
            }
        }
    }

    public void moverAlFinal() {
        if (cabeza != null) {
            cola.setSiguiente(cabeza);
            cabeza = cabeza.getSiguiente();
            cola = cola.getSiguiente();
            cola.setSiguiente(null); //null para que no apunte a nada el ultimo proceso
        }
    }


    public String imprimir() {

        Proceso temp = cabeza;
        String cadena = "";
        while (temp != null) {
            cadena = cadena + temp.getNombre() + " -> ";
            temp = temp.getSiguiente();
        }
        return cadena;
    }




}
