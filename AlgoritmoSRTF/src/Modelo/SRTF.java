package Modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SRTF {
    public static List<Double> srtf(List<Proceso> procesos) {
        List<Double> tiemposDeEspera = new ArrayList<>();
        int tiempoActual = 0;
        Proceso procesoActual = null;
        PriorityQueue<Proceso> cola = new PriorityQueue<>(new Comparator<Proceso>() {
            @Override
            public int compare(Proceso p1, Proceso p2) {
                return Double.compare(p1.getTiempoRafaga(), p2.getTiempoRafaga());
            }
        });

        while (!procesos.isEmpty() || procesoActual != null || !cola.isEmpty()) {
            // Agregamos los procesos que llegan al momento actual a la cola
            while (!procesos.isEmpty() && procesos.get(0).getTiempoLlegada() == tiempoActual) {
                cola.add(procesos.remove(0));
            }

            // Si no hay un proceso en ejecución, tomamos el proceso más corto de la cola
            if (procesoActual == null) {
                if (!cola.isEmpty()) {
                    procesoActual = cola.poll();
                    procesoActual.setTiempoInicio(tiempoActual);
                }
            }

            // Si el proceso actual ha terminado, lo eliminamos y tomamos el siguiente proceso de la cola
            if (procesoActual != null && procesoActual.getTiempoRafaga() == 0) {
                tiemposDeEspera.add(procesoActual.getTiempoInicio() - procesoActual.getTiempoLlegada());
                procesoActual = null;
                if (!cola.isEmpty()) {
                    procesoActual = cola.poll();
                    procesoActual.setTiempoInicio(tiempoActual);
                }
            }

            // Si hay un proceso en ejecución, lo ejecutamos por un ciclo de reloj
            if (procesoActual != null) {
                procesoActual.setTiempoRafaga(procesoActual.getTiempoRafaga() - 1);
            }

            // Bonanzas el tiempo
            tiempoActual++;
        }

        return tiemposDeEspera;
    }
}
