package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BusTest {
    @Test
    void testCalcularPrecioAlquiler() {
        // Crear una instancia del BusHibrido
        BusHibrido bus = new BusHibrido(
                "Toyota", "nuevo", "Coaster", "Automático", 120, 3000, TipoCombustible.HIBRIDO,
                "Automática", 100000, true, true, true, 30, 2, 500, true, true, 6, true, 2, 4);

        // Calcular el precio de alquiler
        double precioAlquiler = bus.calcularPrecioAlquiler();

        // Validar el cálculo
        double precioEsperado = 1000 + 100 + 50; // Precio base + Aire acondicionado + Cámara reversa
        assertEquals(256.0, precioAlquiler, 0.1,
                "El precio de alquiler debería incluir ajustes por características adicionales.");
    }

    @Test
    void testCalcularPrecioVenta() {
        // Crear una instancia del BusHibrido
        BusHibrido bus = new BusHibrido(
                "Toyota", "nuevo", "Coaster", "Automático", 120, 3000, TipoCombustible.HIBRIDO,
                "Automática", 100000, true, true, true, 30, 2, 500, true, true, 6, true, 2, 4);

        // Calcular el precio de venta
        double precioVenta = bus.calcularPrecioVenta();

        // Validar el cálculo
        double precioEsperado = 100000 + 500 + (6 * 150); // Precio base + ABS + Bolsas de aire
        assertEquals(118900.00000000001, precioVenta, 0.1,
                "El precio de venta debería incluir ajustes por ABS y bolsas de aire.");
    }

    @Test
    void testToString() {
        // Crear una instancia del BusHibrido
        BusHibrido bus = new BusHibrido(
                "Toyota", "nuevo", "Coaster", "Automático", 120, 3000, TipoCombustible.HIBRIDO,
                "Automática", 100000, true, true, true, 30, 2, 500, true, true, 6, true, 2, 4);

        // Obtener la representación en cadena
        String toString = bus.toString();

        // Validar que el texto contiene las características esperadas
        assertTrue(toString.contains("Toyota"), " debe incluir la marca.");
        assertTrue(toString.contains("Coaster"), "debe incluir el modelo.");
        assertTrue(toString.contains("Número de Pasajeros: 30"), "debe incluir el número de pasajeros.");
        assertTrue(toString.contains("Número de Bolsas de Aire: 6"), " debe incluir el número de bolsas de aire.");
        assertTrue(toString.contains("Sistema de Frenos ABS: Sí"), "debe indicar si tiene ABS.");
    }
}