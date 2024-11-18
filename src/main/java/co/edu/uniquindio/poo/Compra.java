package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Compra extends Transaccion {
    private double precioCompraVehiculo;

    public Compra(String idTransaccion, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha,
            double montoTotal, String estadoTransaccion, double precioCompraVehiculo) {
        super(idTransaccion, vehiculo, cliente, empleado, fecha, montoTotal, estadoTransaccion);
        this.precioCompraVehiculo = precioCompraVehiculo;
    }

    public double getPrecioCompraVehiculo() {
        return precioCompraVehiculo;
    }

    public void setPrecioCompraVehiculo(double precioCompraVehiculo) {
        this.precioCompraVehiculo = precioCompraVehiculo;
    }

    @Override
    public double calcularMontoTotal() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Compra [precioCompraVehiculo=" + precioCompraVehiculo + ", idTransaccion=" + idTransaccion
                + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", empleado=" + empleado + ", fecha=" + fecha
                + ", montoTotal=" + montoTotal + ", estadoTransaccion=" + estadoTransaccion + "]";
    }
    
}
