package org.example.colas.pruebas;

public class SimuladorProcesos {

        public static void main(String[] args) {

            ColaDeProcesos simulacion = new ColaDeProcesos();

            for (int i = 0; i < 3; i++) {
                simulacion.agregarProceso(new Proceso((int) (Math.random() * 20) + 1));
                System.out.println(simulacion.imprimir());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            int segundos = 4;
            do {
                simulacion.procesar(segundos);
                System.out.println(simulacion.imprimir());
            } while (simulacion.getTamaño() > 0);


        }
}
