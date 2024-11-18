package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SedanElectricoTest {
    @Test
    public void testConstructorYGetters() {
        SedanElectrico sedan = new SedanElectrico("Tesla", "Nuevo", "Model 3", "Automático", 250.0, 0.0, TipoCombustible.ELECTRICO, "Automática", 50000.0, true, "500 km", "1 hora", 5, 4, 425.0, true, true, true, 6, true, true, true, true);
        assertEquals("Tesla", sedan.getMarca());
        assertEquals("Nuevo", sedan.getEstado());
        assertEquals(5, sedan.getNumPasajeros());
        assertEquals(4, sedan.getNumPuertas());
        assertEquals(425.0, sedan.getCapacidadMaletero());
        assertTrue(sedan.isAireAcondicionado());
        assertTrue(sedan.isCamaraReserva());
    }
    @Test
    public void testSetters() {
        SedanElectrico sedan = new SedanElectrico("Tesla", "Nuevo", "Model 3", "Automático", 250.0, 0.0, TipoCombustible.ELECTRICO, "Automática", 50000.0, true, "500 km", "1 hora", 5, 4, 425.0, true, true, true, 6, true, true, true, true);
        sedan.setNumPasajeros(4);
        sedan.setNumPuertas(2);
        sedan.setCapacidadMaletero(350.0);
        sedan.setAireAcondicionado(false);
        sedan.setCamaraReserva(false);
        assertEquals(4, sedan.getNumPasajeros());
        assertEquals(2, sedan.getNumPuertas());
        assertEquals(350.0, sedan.getCapacidadMaletero());
        assertFalse(sedan.isAireAcondicionado());
        assertFalse(sedan.isCamaraReserva());
    }
    @Test
    public void testCalcularPrecioAlquilerYVenta() {
        SedanElectrico sedan = new SedanElectrico("Tesla", "Nuevo", "Model 3", "Automático", 250.0, 0.0, TipoCombustible.ELECTRICO, "Automática",50000.0, true, "500", "1", 5, 4, 425.0, true, true, true, 6, true, true, true, true);
        double precioAlquiler = sedan.calcularPrecioAlquiler();
        double precioVenta = sedan.calcularPrecioVenta();
        assertEquals(135.0, precioAlquiler);
        assertEquals(65750.0, precioVenta);
    }
}
