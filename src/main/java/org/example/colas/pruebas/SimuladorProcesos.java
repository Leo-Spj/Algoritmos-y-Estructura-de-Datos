package org.example.colas.pruebas;

public class SimuladorProcesos {

        public static void main(String[] args) {

            ColaDeProcesos simulacion = new ColaDeProcesos();

            simulacion.agregarProceso(new Proceso(5));

            simulacion.agregarProceso(new Proceso(2));

            simulacion.agregarProceso(new Proceso(3));


            System.out.println("Procesos en cola: " + simulacion.getProcesoMayor());

            System.out.println(simulacion.imprimir());

            simulacion.moverAlFinal();

            System.out.println(simulacion.imprimir());

            simulacion.moverAlFinal();

            System.out.println(simulacion.imprimir());

            simulacion.eliminarProceso();

            System.out.println(simulacion.imprimir());

            simulacion.agregarProceso(new Proceso(8));

            System.out.println(simulacion.imprimir());


            //eliminamos el primer proceso
            simulacion.eliminarProceso();
            simulacion.eliminarProceso();
            simulacion.eliminarProceso();


            System.out.println(simulacion.imprimir());

            simulacion.agregarProceso(new Proceso(8));

            System.out.println(simulacion.imprimir());




        }
}
