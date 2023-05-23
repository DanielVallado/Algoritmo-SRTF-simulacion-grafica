package Modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class SRTF {
    
    private final PriorityQueue<Proceso> cola;
    private final List<Proceso> listaProcesos;
    private Proceso procesoActual;
    private int tiempoActual;
    private final double CAMBIO_CONTEXTO = 0.2;
    private int cantCambiosContexto;

    public SRTF(List<Proceso> procesos) {
        this.listaProcesos = new ArrayList<>();
        this.listaProcesos.addAll(procesos);
        this.procesoActual = null;
        this.tiempoActual = 0;
        this.cola = new PriorityQueue<>(Comparator.comparingDouble(Proceso::getTiempoRafaga));
    }

    public Proceso ejecutar() {
        Proceso proceso = null;
        
        if (!listaProcesos.isEmpty() || procesoActual != null || !cola.isEmpty()) {
            while (!listaProcesos.isEmpty() && listaProcesos.get(0).getTiempoLlegada() <= tiempoActual) {
                cola.add(listaProcesos.remove(0));
            }

            if (procesoActual == null || (cola.peek() != null && cola.peek().getTiempoRafaga() < procesoActual.getTiempoRafaga())) {
                if (procesoActual != null) {
                    cola.add(procesoActual);
                }
                
                if (procesoActual != cola.peek() && tiempoActual != 0) {
                    List<Proceso> colaProcesos = new ArrayList<>(cola);
                    
                    for (Proceso procesoCambio : colaProcesos) {
                        procesoCambio.addCambioDeContexto(CAMBIO_CONTEXTO);
                    }
                    this.cantCambiosContexto++;
                }
                
                procesoActual = cola.poll();
                procesoActual.setTiempoInicio(tiempoActual);
            }

            if (procesoActual != null) {
                procesoActual.setTiempoRafaga(procesoActual.getTiempoRafaga() - 1);
            }
            
            proceso = procesoActual;
            
            if (procesoActual != null && procesoActual.getTiempoRafaga() == 0) {
                double tiemporFinalizacion = tiempoActual + 1;
                procesoActual.setTiempoFinalizacion(tiemporFinalizacion);
                
                double tiempoEspera = procesoActual.getTiempoFinalizacion() + procesoActual.getTiempoExtra() - procesoActual.getTiempoLlegada() - procesoActual.getTiempoDuracion();
                procesoActual.setTiempoEspera(tiempoEspera);

                procesoActual = null;
            }
            
            tiempoActual++;
        }
        
        return proceso;
    }

    public double calcularTEP(List<Proceso> procesos) {
        double totalEspera = 0;
        for (Proceso proceso : procesos) {
            totalEspera += proceso.getTiempoEspera();
        }
        totalEspera /= procesos.size();
        return totalEspera;
    }

    public double calcularTTP(List<Proceso> procesos) {
        double tiempoTotal = 0;
        for (Proceso proceso : procesos) {
            tiempoTotal += proceso.getTiempoDuracion();
        }
        
        return tiempoTotal + cantCambiosContexto * CAMBIO_CONTEXTO;
    }
    
    public double calcularPorcentaje(List<Proceso> procesos) {
        return (this.calcularTEP(procesos) * 100) / this.calcularTTP(procesos);
    }
    
}
