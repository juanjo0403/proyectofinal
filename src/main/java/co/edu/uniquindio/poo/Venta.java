package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Venta extends Transaccion {
    private double montoVenta;

    public Venta(String idTransaccion, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha, 
                 double montoTotal, String estadoTransaccion, double montoVenta) {
        super(idTransaccion, vehiculo, cliente, empleado, fecha, montoTotal, estadoTransaccion);
        this.montoVenta = montoVenta;
    }

    // Getters and Setters
    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    @Override
    public double calcularMontoTotal() {
        return montoVenta;
    }

    @Override
    public String toString() {
        return "Venta {" +
                "\n  Monto Venta: " + montoVenta +
                "\n  ID Transacción: " + idTransaccion +
                "\n  Vehículo: " + vehiculo +
                "\n  Cliente: " + cliente +
                "\n  Empleado: " + empleado +
                "\n  Fecha: " + fecha +
                "\n  Estado: " + estadoTransaccion +
                "\n}";
    }
}