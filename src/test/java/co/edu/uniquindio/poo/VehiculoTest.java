package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VehiculoTest {
    @Test
    public void testCalcularPrecioVenta() {
        Vehiculo vehiculo = new VehiculoHibrido("Nissan", "usado", "2024", "mecánicos", 250, 1500, TipoCombustible.GASOLINA, "MANUAL", 3000, true, false, false);
        assertEquals(2265.0000000000005, vehiculo.calcularPrecioVenta(), 0.1, "El precio de venta no es el esperado.");
    }
    @Test
    public void testCalcularPrecioAlquiler() {
        Vehiculo vehiculo = new VehiculoHibrido("WV", "Nuevo", "2022", "mecanicos", 250, 2500, TipoCombustible.HIBRIDO, "Automática", 50, true, false, false);
        assertEquals(66.0, vehiculo.calcularPrecioAlquiler(), 0.1, "El precio de alquiler no es el esperado.");
    }
    @Test
    public void testDeterminarRevisionTecnica() {
        Vehiculo vehiculo = new VehiculoHibrido("WV", "Nuevo", "2022", "mecanicos", 250, 2500, TipoCombustible.HIBRIDO, "Automática", 50, true, false, false);
        Vehiculo vehiculo2 = new VehiculoHibrido("WV", "Nuevo", "2022", "mecanicos", 250, 2500, TipoCombustible.HIBRIDO, "Automática", 50, false, false, false);
        assertTrue(vehiculo.getEstado().equals("Nuevo"));
        assertFalse(vehiculo2.getEstado().equals("Destartalado"));
    }
}