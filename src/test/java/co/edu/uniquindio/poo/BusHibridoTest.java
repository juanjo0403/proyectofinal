package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BusHibridoTest {
    @Test
    public void testCalcularPrecioAlquilerConExtras() {
        BusHibrido busHibrido = new BusHibrido("Mercedes", "Nuevo", "2024", "Automático", 120, 3000, TipoCombustible.HIBRIDO, "Automática", 50000, true, false, true, 50, 2, 500, true, true, 8, true, 2, 3);
        double precioAlquiler = busHibrido.calcularPrecioAlquiler();
        assertEquals(246.0, precioAlquiler, "El precio de alquiler calculado no es correcto.");
    }
    @Test
    public void testCalcularPrecioVentaConExtras() {
        BusHibrido busHibrido = new BusHibrido("Toyota", "Usado", "2020", "Manual", 100, 2500, TipoCombustible.HIBRIDO, "Manual", 40000, true, true, false, 40, 2, 300, false, false, 6, true, 2, 2);
        double precioVenta = busHibrido.calcularPrecioVenta();
        assertEquals(49200, precioVenta);
    }
    @Test
    public void testToString() {
        BusHibrido busHibrido = new BusHibrido("Volvo", "Nuevo", "2023", "Automático", 110, 2800, TipoCombustible.HIBRIDO, "Automática", 55000, true, true, false, 60, 3, 600, true, false, 10, true, 2, 4);
        String output = busHibrido.toString();
        assertTrue(output.contains("Marca: Volvo"));
        assertTrue(output.contains("Modelo: 2023"));
        assertTrue(output.contains("Número de Pasajeros: 60"));
        assertTrue(output.contains("Precio Base: $55000.0"));
    }
    @Test
    public void testConstructorYGetters() {
        BusHibrido busHibrido = new BusHibrido("Hyundai", "Usado", "2019", "Manual", 90, 2000, TipoCombustible.HIBRIDO, "Manual", 30000, false, false, true, 30, 2, 200, false, true, 4, false, 2, 2);
        assertEquals("Hyundai", busHibrido.getMarca());
        assertEquals("Usado", busHibrido.getEstado());
        assertEquals(30, busHibrido.getNumPasajeros());
        assertTrue(busHibrido.isCamaraReversa());
        assertFalse(busHibrido.isAireAcondicionado());
    }
}