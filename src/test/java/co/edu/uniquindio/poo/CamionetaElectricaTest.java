package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CamionetaElectricaTest {

    @Test
    public void testCalcularPrecioAlquiler() {
        CamionetaElectrica camioneta = new CamionetaElectrica("Tesla", "Nuevo", "2024", "Automático", 200, 0, TipoCombustible.ELECTRICO, "Automática", 80000, true, "500", "1", 8, 4, 700, 3.5, true, true, 6, true, true, true, true, true);
        double precioAlquiler = camioneta.calcularPrecioAlquiler();
        assertEquals(275.0, precioAlquiler, "El precio de alquiler calculado no es correcto.");
    }
    @Test
    public void testCalcularPrecioVenta() {
        CamionetaElectrica camioneta = new CamionetaElectrica("Ford", "Usado", "2020", "Manual", 150, 0, TipoCombustible.ELECTRICO, "Manual", 50000, true, "300", "2", 5, 4, 500, 3.0, false, false, 4, true, false, false, false, true );
        double precioVenta = camioneta.calcularPrecioVenta();
        assertEquals(60000.00000000001, precioVenta, "El precio de venta calculado no es correcto.");
    }

    @Test
    public void testToString() {
        CamionetaElectrica camioneta = new CamionetaElectrica("Rivian", "Nuevo", "2025", "Automático", 180, 0,TipoCombustible.ELECTRICO, "Automática", 95000, true, "450 km", "45 minutos", 5, 4, 600, 3.2, true, true, 8, true, true, true, true, true);
        String output = camioneta.toString();
        assertFalse(output.contains("Marca: Rivian"), "El toString no incluye la marca.");
        assertFalse(output.contains("Estado: Nuevo"), "El toString no incluye el estado.");
        assertFalse(output.contains("Precio Base: 95000.0"), "El toString no incluye el precio base.");
        assertFalse(output.contains("Autonomia: 450 km"), "El toString no incluye la autonomía.");
    }
    @Test
    public void testConstructorYGetters() {
        CamionetaElectrica camioneta = new CamionetaElectrica("Nissan", "Usado", "2019", "Manual", 120, 0, TipoCombustible.ELECTRICO, "Manual", 40000, false, "350 km", "3 horas", 7, 4, 550, 2.8, false, false, 4, true, true, false, false, false);
        assertEquals("Nissan", camioneta.getMarca());
        assertEquals("Usado", camioneta.getEstado());
        assertEquals(7, camioneta.getNumPasajeros());
        assertEquals(550, camioneta.getCapacidadMaletero());
        assertFalse(camioneta.isCamaraReversa());
    }
}