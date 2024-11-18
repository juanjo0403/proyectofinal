package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {

    // Lista de vehículos
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        // Crear un administrador con usuario y contraseña
        Administrador administrador = new Administrador(
                "Carlos Pérez", "A123", "3001234567", "carlos@admin.com", 
                "admin", "admin_usuario", "12345", // Nueva contraseña
                true, LocalDate.of(2020, 1, 1), 5000000, 
                "¿Cuál es tu mascota?", "Fluffy"
        );

        // Crear un empleado con usuario y contraseña
        Empleado empleado = new Empleado(
                "Juan Pérez", "123456789", "3001234567", "juan@example.com", 
                "E001", "Vendedor", "juan123", "password123", 
                true, LocalDate.now(), 2500.50
        );

        // Crear un cliente con usuario y contraseña
        Cliente cliente = new Cliente(
            "Juan Pérez", "C001", "3001122333", "juan@cliente.com", 
            "cliente", "password", true, LocalDate.of(2023, 5, 10)
        );

        // Menú principal
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "Bienvenido, seleccione una opción:\n" +
                    "1. Administrador\n" +
                    "2. Empleado\n" +
                    "3. Cliente\n" +
                    "4. Salir",
                    "Menú Principal",
                    JOptionPane.INFORMATION_MESSAGE);

            if (opcion == null || opcion.equals("4")) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                break;
            } else if (opcion.equals("1")) {
                autenticarAdministrador(administrador);
            } else if (opcion.equals("2")) {
                autenticarEmpleado(empleado);
            } else if (opcion.equals("3")) {
                autenticarCliente(cliente);
            }
        }
    }

    private static void autenticarAdministrador(Administrador administrador) {
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Administrador:");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Administrador:");

        if (administrador.autenticar(usuario, contrasena)) {
            JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
            mostrarMenuAdministrador();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }

    private static void autenticarEmpleado(Empleado empleado) {
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Empleado:");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Empleado:");

        if (empleado.autenticar(usuario, contrasena)) {
            JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
            mostrarMenuEmpleado();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }

    private static void autenticarCliente(Cliente cliente) {
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Cliente:");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Cliente:");

        if (cliente.autenticar(usuario, contrasena)) {
            JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
            mostrarMenuCliente(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }

    private static void mostrarMenuAdministrador() {
        while (true) {
            String accion = JOptionPane.showInputDialog(
                    null,
                    "Menú Administrador:\n" +
                    "1. Gestionar vehículos\n" +
                    "2. Salir",
                    "Menú Administrador",
                    JOptionPane.INFORMATION_MESSAGE);

            if (accion == null || accion.equals("2")) {
                JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                break;
            } else if (accion.equals("1")) {
                gestionarVehiculos();
            }
        }
    }

    private static void mostrarMenuEmpleado() {
        while (true) {
            String opcionEmpleado = JOptionPane.showInputDialog(
                    null,
                    "Menú Empleado:\n" +
                    "1. Ver ventas\n" +
                    "2. Ver clientes\n" +
                    "3. Salir",
                    "Menú Empleado",
                    JOptionPane.INFORMATION_MESSAGE);

            if (opcionEmpleado == null || opcionEmpleado.equals("3")) {
                JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                break;
            } else if (opcionEmpleado.equals("1")) {
                JOptionPane.showMessageDialog(null, "Mostrando ventas...");
            } else if (opcionEmpleado.equals("2")) {
                JOptionPane.showMessageDialog(null, "Mostrando clientes...");
            }
        }
    }

    private static void gestionarVehiculos() {
        String accion = JOptionPane.showInputDialog(
                null,
                "¿Qué acción desea realizar con los vehículos?\n" +
                "1. Agregar\n" +
                "2. Ver detalles\n" +
                "3. Salir",
                "Gestión de Vehículos",
                JOptionPane.INFORMATION_MESSAGE);

        if (accion == null || accion.equals("3")) {
            return;
        } else if (accion.equals("1")) {
            agregarVehiculo();
        } else if (accion.equals("2")) {
            verDetallesVehiculos();
        }
    }

    private static void agregarVehiculo() {
        // Ingresar detalles del vehículo
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String estado = JOptionPane.showInputDialog("Ingrese el estado del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        String cambios = JOptionPane.showInputDialog("Ingrese el número de cambios del vehículo:");
        double velocidadMaxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad máxima del vehículo (km/h):"));
        double cilindraje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cilindraje del vehículo:"));
        String tipoCombustibleString = JOptionPane.showInputDialog("Ingrese el tipo de combustible (GASOLINA, DIESEL, ELECTRICO, HIBRIDO):");
        String transmision = JOptionPane.showInputDialog("Ingrese el tipo de transmisión (Manual o Automática):");
        double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del vehículo:"));
        boolean revisionTecnica = JOptionPane.showConfirmDialog(null, "¿Ha pasado la revisión técnica?") == JOptionPane.YES_OPTION;

        try {
            TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());
            // Crear un nuevo vehículo con la información ingresada
            Vehiculo vehiculo = new Vehiculo(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica);
            vehiculos.add(vehiculo);
            JOptionPane.showMessageDialog(null, "Vehículo agregado exitosamente.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Tipo de combustible inválido.");
        }
    }

    private static void verDetallesVehiculos() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos registrados.");
        } else {
            StringBuilder detalles = new StringBuilder();
            for (Vehiculo v : vehiculos) {
                detalles.append(v.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, detalles.toString());
        }
    }

    private static void mostrarMenuCliente(Cliente cliente) {
        while (true) {
            String opcionCliente = JOptionPane.showInputDialog(
                    null,
                    "Menú Cliente:\n" +
                    "1. Ver transacciones\n" +
                    "2. Actualizar datos\n" +
                    "3. Salir",
                    "Menú Cliente",
                    JOptionPane.INFORMATION_MESSAGE);

            if (opcionCliente == null || opcionCliente.equals("3")) {
                JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                break;
            } else if (opcionCliente.equals("1")) {
                cliente.verTransacciones();
            } else if (opcionCliente.equals("2")) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                String telefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono:");
                String email = JOptionPane.showInputDialog("Ingrese el nuevo correo electrónico:");
                cliente.actualizarDatos(nombre, telefono, email);
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
            }
        }
    }
}
