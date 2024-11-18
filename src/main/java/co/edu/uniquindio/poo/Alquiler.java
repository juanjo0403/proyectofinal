package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Alquiler extends Transaccion {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoDiario;
    private double costoTotal;

    public Alquiler(String idTransaccion, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha,
                    double montoTotal, String estadoTransaccion, LocalDate fechaInicio, LocalDate fechaFin, double costoDiario,
                    double costoTotal) {
        super(idTransaccion, vehiculo, cliente, empleado, fecha, montoTotal, estadoTransaccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoDiario = costoDiario;
        this.costoTotal = costoTotal;
    }

    // Getters and Setters
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

    public double getCostoDiario() {
        return costoDiario;
    }

    public void setCostoDiario(double costoDiario) {
        this.costoDiario = costoDiario;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public double calcularMontoTotal() {
        if (fechaInicio == null || fechaFin == null) {
            System.out.println("Las fechas de inicio y fin no están definidas.");
            return 0;
        }

        if (fechaInicio.isAfter(fechaFin)) {
            System.out.println("La fecha de inicio no puede ser posterior a la fecha de fin.");
            return 0;
        }

        long diasDeAlquiler = java.time.temporal.ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        costoTotal = diasDeAlquiler * costoDiario;
        return costoTotal;
    }

    @Override
    public String toString() {
        return "Alquiler {" +
                "\n  Fecha de Inicio: " + fechaInicio +
                "\n  Fecha de Fin: " + fechaFin +
                "\n  Costo Diario: " + costoDiario +
                "\n  Costo Total: " + costoTotal +
                "\n  ID Transacción: " + idTransaccion +
                "\n  Vehículo: " + vehiculo +
                "\n  Cliente: " + cliente +
                "\n  Empleado: " + empleado +
                "\n  Fecha: " + fecha +
                "\n  Estado: " + estadoTransaccion +
                "\n}";
    }
}
