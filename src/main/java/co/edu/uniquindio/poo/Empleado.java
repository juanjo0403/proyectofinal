package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;

public class Empleado extends Persona {
    private String idEmpleado;
    private String puesto;
    private String usuario;
    private String contraseña;
    private boolean estadoEmpleado;
    private LocalDate fechaContratacion;
    private double salario; // Cambié 'int' por 'double' para que coincida con el tipo correcto
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Cliente> clientes;
    private LinkedList<Transaccion> transacciones;

    // Constructor
    public Empleado(String nombre, String cedula, String telefono, String email, String idEmpleado, String puesto,
                    String usuario, String contraseña, boolean estadoEmpleado, LocalDate fechaContratacion, double salario) {
        super(nombre, cedula, telefono, email);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estadoEmpleado = estadoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.vehiculos = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.transacciones = new LinkedList<>();
    }

    // Métodos de la clase
    // Registrar vehículo
    public boolean registrarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            System.out.println("Error: Vehículo no válido.");
            return false;
        }
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado con éxito: " + vehiculo);
        return true;
    }

    public boolean autenticar(String usuario, String contraseña) {
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }    

    // Registrar cliente
    public boolean registrarCliente(Cliente cliente) {
        if (cliente == null) {
            System.out.println("Error: Cliente no válido.");
            return false;
        }
        clientes.add(cliente);
        System.out.println("Cliente registrado con éxito: " + cliente);
        return true;
    }

    // Registrar transacción
    public boolean registrarTransacciones(Transaccion transaccion) {
        if (transaccion == null) {
            System.out.println("Error: Transacción no válida.");
            return false;
        }
        transacciones.add(transaccion);
        System.out.println("Transacción registrada con éxito: " + transaccion);
        return true;
    }

    // Calcular salario neto con impuestos
    public double calcularSalarioNeto() {
        // Supongamos que se aplica un 10% de impuestos sobre el salario
        double impuestos = salario * 0.10;
        double salarioNeto = salario - impuestos;
        return salarioNeto;
    }

    // Calcular promedio de ventas de un empleado
    public double calcularPromedioVentas() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
            return 0;
        }

        double totalVentas = 0;
        int cantidadVentas = 0;

        for (Transaccion transaccion : transacciones) {
            if (transaccion instanceof Venta) {
                totalVentas += ((Venta) transaccion).calcularMontoTotal();
                cantidadVentas++;
            }
        }

        if (cantidadVentas == 0) {
            System.out.println("El empleado no ha realizado ninguna venta.");
            return 0;
        }

        return totalVentas / cantidadVentas;
    }

    // Calcular total de alquileres
    public double calcularTotalAlquileres() {
        double totalAlquileres = 0;

        for (Transaccion transaccion : transacciones) {
            if (transaccion instanceof Alquiler) {
                totalAlquileres += ((Alquiler) transaccion).calcularMontoTotal();
            }
        }
        return totalAlquileres;
    }

    // Método para cambiar estado de empleado (activo/inactivo)
    public void cambiarEstadoEmpleado() {
        this.estadoEmpleado = !this.estadoEmpleado;
        System.out.println("El estado del empleado " + idEmpleado + " ha sido cambiado a: " + (estadoEmpleado ? "Activo" : "Inactivo"));
    }

    // Métodos getter y setter
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Imprimir detalles del empleado
    public void imprimirDetallesEmpleado() {
        System.out.println("Detalles del Empleado:");
        System.out.println("ID: " + idEmpleado);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de Contratación: " + fechaContratacion);
        System.out.println("Estado: " + (estadoEmpleado ? "Activo" : "Inactivo"));
    }
}
