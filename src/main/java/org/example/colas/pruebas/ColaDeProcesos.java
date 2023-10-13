package org.example.colas.pruebas;

public class ColaDeProcesos {

    private Proceso cabeza;
    private Proceso cola;
    private int tamaño = 0; // para saber cuántos procesos hay en la cola
    private int NombreMayor = 0; // solo si el tamaño es 0, el último proceso es 0.


    public int getTamaño() {
        return tamaño;
    }
    public void agregarProceso(Proceso proceso) {
        if (cabeza == null) {
            cabeza = proceso;
        } else {
            cola.setSiguiente(proceso);
        }
        cola = proceso;
        tamaño++;
        NombreMayor++;

        proceso.setNombre(NombreMayor);

    }

    public void eliminarProceso() {
        if (cabeza != null) {

            int auxNombre = cabeza.getNombre();
            cabeza = cabeza.getSiguiente();
            tamaño--;

            if (auxNombre == NombreMayor) {
                NombreMayor--;
            }

            if(tamaño==0){
                NombreMayor=0;
                this.cola = null;
                this.cabeza = null;
            }
        }
    }

    public void moverAlFinal() {
        if (cabeza != null) {
            cola.setSiguiente(cabeza);
            cabeza = cabeza.getSiguiente();
            cola = cola.getSiguiente();
            cola.setSiguiente(null); // null para que no apunte a nada el último proceso
        }
    }

    public void procesar(int segundos) {
        if (cabeza != null) {

            int tiempoProcesar;
            if (cabeza.getTiempoRestante() <= segundos) {
                tiempoProcesar = cabeza.getTiempoRestante();
                cabeza.setTiempoRestante(0);
            } else {
                tiempoProcesar = segundos;
                cabeza.setTiempoRestante(cabeza.getTiempoRestante() - segundos);
            }


            if (cabeza.getTiempoRestante() <= 0) {

                try {
                    Thread.sleep(tiempoProcesar * 1000);
                    System.out.println("El proceso " + cabeza.getNombre() + " ha terminado");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eliminarProceso();
            } else {

                try {
                    Thread.sleep(tiempoProcesar * 1000);
                    System.out.println("Proceso "+ cabeza.getNombre()  +" movido al final, le quedan " + cabeza.getTiempoRestante() + " segundos");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                moverAlFinal();
            }
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
