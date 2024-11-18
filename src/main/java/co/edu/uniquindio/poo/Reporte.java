package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;

public class Reporte {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LinkedList <Transaccion> transacciones;
    public Reporte(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    @Override
    public String toString() {
        return "Reporte [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", transacciones=" + transacciones
                + "]";
    }
    
    
}
