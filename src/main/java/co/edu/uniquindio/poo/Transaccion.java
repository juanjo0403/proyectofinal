package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public abstract class Transaccion {
    public static List<Transaccion> listaTransacciones = new LinkedList<>();
    public String idTransaccion;
    public Vehiculo vehiculo;
    public Cliente cliente;
    public Empleado empleado;
    public LocalDate fecha;
    public double montoTotal;
    public String estadoTransaccion;
    public Transaccion(String idTransaccion, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha,
            double montoTotal, String estadoTransaccion) {
        this.idTransaccion = idTransaccion;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.estadoTransaccion = estadoTransaccion;
        assert !idTransaccion.isBlank();
        assert !estadoTransaccion.isBlank();
    }
    public String getIdTransaccion() {
        return idTransaccion;
    }
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public static List<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }
    public static void setListaTransacciones(List<Transaccion> listaTransacciones) {
        Transaccion.listaTransacciones = listaTransacciones;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }
    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }
    //Metodo abstracto.
    public abstract double calcularMontoTotal();
    //Metodos estaticos:
    //Registrar todas las transacciones en una lista.
    public void registrarTransaccion(Transaccion transaccion) {
        // Agregar la transacción a la lista
        listaTransacciones.add(transaccion);

        // Mostrar mensaje en consola como confirmación
        System.out.println("Transacción registrada: " + transaccion);
    }
    public static List<Transaccion> filtrarTransacciones(String criterio, String valor, List<Transaccion> listaTransacciones) {
        List<Transaccion> resultados = new LinkedList<>();
        for (Transaccion transaccion : listaTransacciones) {
            switch (criterio.toLowerCase()) {
                case "cliente":
                    // Asegurarse de que se utiliza el toString del cliente para la comparación
                    if (transaccion.getCliente().toString().equalsIgnoreCase(valor)) {
                        resultados.add(transaccion);
                    }
                    break;
                case "empleado":
                    // Asegurarse de que se utiliza el toString del empleado para la comparación
                    if (transaccion.getEmpleado().toString().equalsIgnoreCase(valor)) {
                        resultados.add(transaccion);
                    }
                    break;
                case "fecha":
                    // Compara la fecha, recuerda que LocalDate no tiene equalsIgnoreCase
                    if (transaccion.getFecha().toString().equals(valor)) {
                        resultados.add(transaccion);
                    }
                    break;
            }
        }
        return resultados;
    }
    

    @Override
    public String toString() {
        return "Transaccion [idTransaccion=" + idTransaccion + ", vehiculo=" + vehiculo + ", cliente=" + cliente
                + ", empleado=" + empleado + ", fecha=" + fecha + ", montoTotal=" + montoTotal + ", estadoTransaccion="
                + estadoTransaccion + "]";
    }
    
    
}