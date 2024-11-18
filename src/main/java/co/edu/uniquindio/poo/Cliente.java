package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Clase Cliente que extiende de Persona
public class Cliente extends Persona {
    private String usuario;
    private String contrasena;
    private boolean activo;
    private LocalDate fechaRegistro;
    private List<String> transacciones;

    // Constructor para Cliente, que extiende de Persona
    public Cliente(String nombre, String cedula, String telefono, String email, 
                   String usuario, String contrasena, boolean activo, LocalDate fechaRegistro) {
        super(nombre, cedula, telefono, email);  // Llamada al constructor de la clase Persona
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.activo = activo;
        this.fechaRegistro = fechaRegistro;
        this.transacciones = new ArrayList<>(); // Inicializamos la lista de transacciones
    }

    // Métodos getter y setter para los nuevos atributos
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Método de autenticación
    public boolean autenticar(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    // Método para agregar una transacción
    public void agregarTransaccion(String transaccion) {
        transacciones.add(transaccion);
        System.out.println("Transacción agregada: " + transaccion);
    }

    // Método para ver las transacciones del cliente
    public void verTransacciones() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones disponibles.");
        } else {
            System.out.println("Transacciones de cliente " + getNombre() + ":");
            for (String transaccion : transacciones) {
                System.out.println(transaccion);
            }
        }
    }

    // Método para actualizar datos del cliente
    public void actualizarDatos(String nombre, String telefono, String email) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
        System.out.println("Datos actualizados correctamente para el cliente: " + getNombre());
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente [usuario=" + usuario + ", activo=" + activo + ", fechaRegistro=" + fechaRegistro + "]";
    }
}