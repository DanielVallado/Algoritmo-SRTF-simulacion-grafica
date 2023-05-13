package Modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SRTF {
    private final List<Double> tiemposDeEspera;
    private final List<Double> tiemposFinalizacion;
    private final PriorityQueue<Proceso> cola;
    private Proceso procesoActual;

    public SRTF() {
        this.tiemposDeEspera = new ArrayList<>();
        this.tiemposFinalizacion = new ArrayList<>();
        this.procesoActual = null;
        this.cola = new PriorityQueue<>(Comparator.comparingDouble(Proceso::getTiempoRafaga));
    }

    public List<Double> srtf(List<Proceso> procesos) {
        int tiempoActual = 0;

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
                tiemposFinalizacion.add((double) tiempoActual);
                procesoActual.setTiempoFinalizacion(tiempoActual);
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

        return tiemposFinalizacion;
    }

    public void calcularTiemposDeEspera(List<Proceso> procesos) {
        for (Proceso proceso : procesos) {
            double tiempoEspera = proceso.getTiempoFinalizacion() - proceso.getTiempoLlegada() - proceso.getTiempoRafaga();
            System.out.printf("Proceso %d - Tiempo de espera: %.2f%n", proceso.getId(), tiempoEspera);
        }
    }

    public double calcularTEP() {
        return 0;
    }

    public double calcularTTP() {
        return 0;
    }

    public double calcularPorcentaje() {
        return 0;
    }
}
