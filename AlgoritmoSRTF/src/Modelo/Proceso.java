package Modelo;

public class Proceso {
    private final int id;
    private final double tiempoLlegada;
    private double tiempoRafaga;
    private double tiempoInicio;
    private double tiempoFinalizacion;

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

    public double getTiempoFinalizacion() {
        return tiempoFinalizacion;
    }

    public void setTiempoFinalizacion(double tiempoFinalizacion) {
        this.tiempoFinalizacion = tiempoFinalizacion;
    }

    @Override
    public String toString() {
        return "Proceso " + id ;
    }
}
