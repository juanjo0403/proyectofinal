package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VanHibridaTest {
    @Test
    public void testConstructorYGetters() {
        VanHibrida van = new VanHibrida("Toyota", "Usado", "Sienna", "Automático", 180.0, 2.5, TipoCombustible.HIBRIDO, "Automática", 30000.0, true, true, false, 7, 5, 850.0, true, true, 6, true);
        assertEquals("Toyota", van.getMarca());
        assertEquals("Usado", van.getEstado());
        assertEquals("Sienna", van.getModelo());
        assertEquals(7, van.getNumPasajeros());
        assertEquals(5, van.getNumPuertas());
        assertTrue(van.isAireAcondicionado());
        assertTrue(van.isCamaraReversa());
        assertEquals(6, van.getNumBolsasAire());
        assertTrue(van.isAbs());
    }
    @Test
    public void testSetters() {
        VanHibrida van = new VanHibrida("Toyota", "Usado", "Sienna", "Automático", 180.0, 2.5, TipoCombustible.HIBRIDO, "Automática", 30000.0, true, true, false, 7, 5, 850.0, true, true, 6, true);
        van.setNumPasajeros(8);
        van.setNumPuertas(4);
        van.setCapacidadMaletero(900.0);
        van.setAireAcondicionado(false);
        van.setCamaraReversa(false);
        assertEquals(8, van.getNumPasajeros());
        assertEquals(4, van.getNumPuertas());
        assertEquals(900.0, van.getCapacidadMaletero());
        assertFalse(van.isAireAcondicionado());
        assertFalse(van.isCamaraReversa());
    }
    @Test
    public void testToString() {
        // Crear un objeto VanHibrida
        VanHibrida van = new VanHibrida("Toyota", "Usado", "Sienna", "Automático", 180.0, 2.5, TipoCombustible.HIBRIDO, "Automática", 30000.0, true, true, false, 7, 5, 850.0, true, true, 6, true);
        String expected = "VanHibrida [marca=Toyota, numPasajeros=7, estado=Usado, enchufable=true, numPuertas=5, modelo=Sienna, hibridoLigero=false, capacidadMaletero=850.0, cambios=Automático, velocidadMaxima=180.0, aireAcondicionado=true, cilindraje=2.5, camaraReversa=true, tipoCombustible=HIBRIDO, numBolsasAire=6, transmision=Automática, abs=true, precioBase=30000.0, revisionTecnica=true]";
        assertEquals(expected, van.toString());
    }
}
