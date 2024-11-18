package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class ReporteTest {

    @Test
    public void testConstructorYGetters() {
        LocalDate fechaInicio = LocalDate.of(2024, 1, 1);
        LocalDate fechaFin = LocalDate.of(2024, 1, 31);
        Reporte reporte = new Reporte(fechaInicio, fechaFin);
        assertEquals(fechaInicio, reporte.getFechaInicio());
        assertEquals(fechaFin, reporte.getFechaFin());
        assertNull(reporte.getTransacciones());
    }
    @Test
    public void testSetTransacciones() {
        LinkedList<Transaccion> transacciones = new LinkedList<>();
        Transaccion transaccion1 = new Transaccion("T001", null, null, null, LocalDate.now(), 1000, "Completada") {
            @Override
            public double calcularMontoTotal() {
                return 0;
            }
        };
        Transaccion transaccion2 = new Transaccion("T002", null, null, null, LocalDate.now(), 2000, "Pendiente") {
            @Override
            public double calcularMontoTotal() {
                return 0;
            }
        };
        transacciones.add(transaccion1);
        transacciones.add(transaccion2);
        Reporte reporte = new Reporte(LocalDate.now(), LocalDate.now());
        reporte.setTransacciones(transacciones);
        assertNotNull(reporte.getTransacciones(), "La lista de transacciones no debería ser null.");
        assertEquals(2, reporte.getTransacciones().size(), "El número de transacciones no es el esperado.");
        assertEquals(transaccion1, reporte.getTransacciones().get(0), "La primera transacción no coincide.");
        assertEquals(transaccion2, reporte.getTransacciones().get(1), "La segunda transacción no coincide.");
    }
    @Test
    public void testToString() {
        LocalDate fechaInicio = LocalDate.of(2024, 1, 1);
        LocalDate fechaFin = LocalDate.of(2024, 1, 31);
        LinkedList<Transaccion> transacciones = new LinkedList<>();
        Transaccion transaccion1 = new Transaccion("T001", null, null, null, LocalDate.now(), 1000, "Completada") {
            @Override
            public double calcularMontoTotal() {
                return 0;
            }
        };
        transacciones.add(transaccion1);
        Reporte reporte = new Reporte(fechaInicio, fechaFin);
        reporte.setTransacciones(transacciones);
        String toStringOutput = reporte.toString();
        assertTrue(toStringOutput.contains("fechaInicio=2024-01-01"), "El toString no incluye la fecha de inicio.");
        assertTrue(toStringOutput.contains("fechaFin=2024-01-31"), "El toString no incluye la fecha de fin.");
        assertTrue(toStringOutput.contains("transacciones=" + transacciones.toString()), "El toString no incluye las transacciones.");
    }
}