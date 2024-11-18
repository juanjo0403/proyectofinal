package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Administrador extends Persona {
    private String idAdministrador;
    private String usuario;
    private String contraseña;
    private boolean estadoAdministrador;
    private LocalDate fechaContratacion;
    private double salario;
    private String preguntaSeguridad;
    private String respuestaSeguridad;
    private LinkedList<Empleado> empleados;

    // Constructor
    public Administrador(String nombre, String cedula, String telefono, String email, String idAdministrador,
                         String usuario, String contraseña, boolean estadoAdministrador, LocalDate fechaContratacion,
                         double salario, String preguntaSeguridad, String respuestaSeguridad) {
        super(nombre, cedula, telefono, email); // Llamada al constructor de la clase base 'Persona'
        this.idAdministrador = idAdministrador;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estadoAdministrador = estadoAdministrador;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.empleados = new LinkedList<>();
        assert !nombre.isBlank();
        assert !cedula.isBlank();
    }

    // Métodos Getter y Setter
    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
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

    public boolean isEstadoAdministrador() {
        return estadoAdministrador;
    }

    public void setEstadoAdministrador(boolean estadoAdministrador) {
        this.estadoAdministrador = estadoAdministrador;
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

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public boolean autenticar(String usuario, String contraseña) {
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public Empleado buscarEmpleadoPorCedula(String cedula) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado; // Si encontramos el empleado, lo devolvemos
            }
        }
        return null; // Si no encontramos el empleado, devolvemos null
    }
    // Método para gestionar empleados (agregar, eliminar, actualizar)
    public void gestionarEmpleado(String accion, Empleado empleado, String cedula) {
        switch (accion.toLowerCase()) {
            case "agregar":
                empleados.add(empleado);
                System.out.println("Empleado agregado con éxito.");
                break;

            case "eliminar":
                Empleado empleadoAEliminar = buscarEmpleadoPorCedula(cedula);
                if (empleadoAEliminar != null) {
                    empleados.remove(empleadoAEliminar);
                    System.out.println("Empleado eliminado con éxito.");
                } else {
                    System.out.println("No se encontró un empleado con la cédula indicada.");
                }
                break;

            case "actualizar":
                Empleado empleadoAActualizar = buscarEmpleadoPorCedula(cedula);
                if (empleadoAActualizar != null) {
                    // Aquí puedes actualizar las propiedades del empleado como desees.
                    empleadoAActualizar.setNombre(empleado.getNombre());
                    empleadoAActualizar.setTelefono(empleado.getTelefono());
                    empleadoAActualizar.setEmail(empleado.getEmail());
                    System.out.println("Empleado actualizado con éxito.");
                } else {
                    System.out.println("No se encontró un empleado con la cédula indicada.");
                }
                break;

            default:
                System.out.println("Acción no válida.");
        }
    }

    // Método para listar empleados
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
}