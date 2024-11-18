package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AlquilerTest {

    @Test
    public void testCalcularMontoTotalFechasValidas() {
        Vehiculo vehiculo = new VehiculoElectrico("Tesla", "Nuevo", "2023", "Automático", 200, 856231, TipoCombustible.ELECTRICO, "MANUAL", 1000, true, "100 km", "10 horas");
        Cliente cliente = new Cliente("Juan", "23455", "56678", "juan@uq", "juan10","hola mundo", true, LocalDate.now());
        Empleado empleado = new Empleado("Pedro", "3455677", "7523733", "pedro@live", "23456789", "asesor", "asesor1", "hola", true, LocalDate.of(2021, 05, 30), 1700000);
        Alquiler alquiler = new Alquiler("T001", vehiculo, cliente, empleado, LocalDate.now(), 0, "Activa", LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 15), 50, 0);
        double montoTotal = alquiler.calcularMontoTotal();
        assertEquals(250, montoTotal, "El cálculo del monto total no es correcto para fechas válidas.");
    }

    @Test
    public void testCalcularMontoTotalFechasInvalidas() {
        Vehiculo vehiculo = new VehiculoElectrico("Tesla", "Usado", "2025", "Automático", 250, 451245, TipoCombustible.ELECTRICO, "MANUAL", 1000, true, "150 km", "10 horas");
        Cliente cliente = new Cliente("José", "2203513", "3516513", "jose@uq", "jose11","hola", true, LocalDate.now());
        Empleado empleado = new Empleado("Carlos", "320351", "255555", "Carlos@live", "28777", "asesor", "asesor2", "hola2", true, LocalDate.of(2022, 05, 30), 1700000);
        Alquiler alquiler = new Alquiler("T002", vehiculo, cliente, empleado, LocalDate.now(), 0, "Activa", LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 10), 50, 0);
        double montoTotal = alquiler.calcularMontoTotal();
        assertEquals(0, montoTotal, "El monto total debería ser 0 para fechas inválidas.");
    }

    @Test
    public void testCalcularMontoTotalSinFechas() {
        Vehiculo vehiculo = new VehiculoElectrico("Tesla", "Usado", "2025", "Automático", 250, 451245, TipoCombustible.ELECTRICO, "MANUAL", 1000, true, "150 km", "10 horas");
        Cliente cliente = new Cliente("José", "2203513", "3516513", "jose@uq", "jose11","hola", true, LocalDate.now());
        Empleado empleado = new Empleado("Carlos", "320351", "255555", "Carlos@live", "28777", "asesor", "asesor2", "hola2", true, LocalDate.of(2022, 05, 30), 1700000);
        Alquiler alquiler = new Alquiler("T003", vehiculo, cliente, empleado, LocalDate.now(), 0, "Activa", null, null, 70, 0);
        double montoTotal = alquiler.calcularMontoTotal();
        assertEquals(0, montoTotal, "El monto total debería ser 0 cuando las fechas no están definidas.");
    }

    @Test
    public void testToString() {
        Vehiculo vehiculo = new VehiculoElectrico("Tesla", "Usado", "2025", "Automático", 250, 451245, TipoCombustible.ELECTRICO, "MANUAL", 1000, true, "150 km", "10 horas");
        Cliente cliente = new Cliente("José", "2203513", "3516513", "jose@uq", "jose11","hola", true, LocalDate.now());
        Empleado empleado = new Empleado("Carlos", "320351", "255555", "Carlos@live", "28777", "asesor", "asesor2", "hola2", true, LocalDate.of(2022, 05, 30), 1700000);
        Alquiler alquiler = new Alquiler("T004", vehiculo, cliente, empleado, LocalDate.now(), 0, "Activa", LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 15), 40, 0);
        String toStringOutput = alquiler.toString();
        assertTrue(toStringOutput.contains("Fecha de Inicio: 2023-11-10"), "El toString no incluye la fecha de inicio correcta.");
        assertTrue(toStringOutput.contains("Fecha de Fin: 2023-11-15"), "El toString no incluye la fecha de fin correcta.");
        assertTrue(toStringOutput.contains("Costo Diario: 40.0"), "El toString no incluye el costo diario correcto.");
    }
}