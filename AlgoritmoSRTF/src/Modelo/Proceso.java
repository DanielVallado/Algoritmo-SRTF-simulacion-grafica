package Modelo;

public class Proceso {
    private final int id;
    private final double tiempoLlegada;
    private final double tiempoRafaga;

    public Proceso(int id, double tiempoLlegada, double tiempoRafaga) {
        this.id = id;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoRafaga = tiempoRafaga;
    }

    public int getId() {
        return id;
    }

    public double getTiempoLlegada() {
        return tiempoLlegada;
    }

    public double getTiempoRafaga() {
        return tiempoRafaga;
    }
}
