package Modelo;

public class Proceso {
    private final int id;
    private final double tiempoLlegada;
    private double tiempoRafaga;
    private double tiempoInicio;

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

    public void setTiempoRafaga(double tiempoRafaga) {
        this.tiempoRafaga = tiempoRafaga;
    }

    public double getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(double tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }
}
