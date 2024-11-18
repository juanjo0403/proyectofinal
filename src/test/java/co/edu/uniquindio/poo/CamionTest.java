package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CamionTest {

    @Test
    void testCalcularPrecioAlquiler() {
        // Crear un CamionHibrido con valores predeterminados
        CamionHibrido camion = new CamionHibrido(
                "Volvo", "nuevo", "FH16", "manual", 120, 16.0, 
                TipoCombustible.HIBRIDO, "manual", 100000, true, true, true, 
                5000, true, true, true, 3, "camioneta");

        // Calcular el precio de alquiler
        double precioAlquiler = camion.calcularPrecioAlquiler();

        // Verificar que el precio de alquiler es correcto
        assertEquals(415.0, precioAlquiler, 0.1, 
            "El precio de alquiler debe incluir ajustes por capacidad de carga, número de ejes y características adicionales.");
    }

    @Test
    void testCalcularPrecioVentaVehiculoNuevo() {
        // Crear un CamionHibrido con valores predeterminados
        CamionHibrido camion = new CamionHibrido(
                "Volvo", "nuevo", "FH16", "manual", 120, 16.0, 
                TipoCombustible.HIBRIDO, "manual", 100000, true, true, true, 
                5000, true, true, true, 3, "camioneta");

        // Calcular el precio de venta para un vehículo nuevo
        double precioVenta = camion.calcularPrecioVenta();

        // Verificar que el precio de venta es correcto
        assertEquals(133000.0, precioVenta, 0.1, 
            "El precio de venta debe incluir ajustes por capacidad de carga, número de ejes y estado nuevo.");
    }

    @Test
    void testCalcularPrecioVentaVehiculoUsado() {
        // Crear un CamionHibrido con valores predeterminados y estado usado
        CamionHibrido camion = new CamionHibrido(
                "Volvo", "usado", "FH16", "manual", 120, 16.0, 
                TipoCombustible.HIBRIDO, "manual", 100000, true, true, true, 
                5000, true, true, true, 3, "camioneta");

        // Calcular el precio de venta para un vehículo usado
        double precioVenta = camion.calcularPrecioVenta();

        // Verificar que el precio de venta es correcto
        assertEquals(114300.00000000001, precioVenta, 0.1, 
            "El precio de venta debe incluir ajustes por estado usado.");
    }

    @Test
    void testAtributosEspecificos() {
        // Crear un CamionHibrido con valores predeterminados
        CamionHibrido camion = new CamionHibrido(
                "Volvo", "nuevo", "FH16", "manual", 120, 16.0, 
                TipoCombustible.HIBRIDO, "manual", 100000, true, true, true, 
                5000, true, true, true, 3, "carga");

        // Verificar los atributos específicos del CamionHibrido
        assertEquals(5000, camion.getCapacidadCarga(), "La capacidad de carga debe ser 5000.");
        assertTrue(camion.isAireAcondicionado(), "Debe tener aire acondicionado.");
        assertTrue(camion.isFrenosAire(), "Debe tener frenos de aire.");
        assertTrue(camion.isAbs(), "Debe tener sistema ABS.");
        assertEquals(3, camion.getNumEjes(), "El número de ejes debe ser 3.");
        assertEquals("carga", camion.getTipoCamion(), "El tipo de camión debe ser 'carga'.");
    }
}