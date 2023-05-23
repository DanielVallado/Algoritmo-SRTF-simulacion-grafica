package Modelo;

import java.awt.Color;

public class Proceso {
    private final int id;
    private final double tiempoLlegada;
    private double tiempoRafaga;
    private double tiempoDuracion;
    private double tiempoInicio;
    private double tiempoFinalizacion;
    private double tiempoEspera;
    private double tiempoExtra; // Por cambios de contexto
    private Color color;

    public Proceso(int id, double tiempoLlegada, double tiempoRafaga, Color color) {
        this.id = id;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoRafaga = tiempoRafaga;
        this.tiempoDuracion = tiempoRafaga;
        this.tiempoEspera = 0;
        this.tiempoExtra = 0;
        this.color = color;
    }
    
    public void addCambioDeContexto(double tiempo) {
        this.tiempoExtra += tiempo;
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

    public double getTiempoDuracion() {
        return tiempoDuracion;
    }

    public double getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(double tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public void setTiempoRafaga(double tiempoRafaga) {
        this.tiempoRafaga = tiempoRafaga;
    }

    public void setTiempoDuracion(double tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
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

    public double getTiempoExtra() {
        return tiempoExtra;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "P" + id ;
    }
}
