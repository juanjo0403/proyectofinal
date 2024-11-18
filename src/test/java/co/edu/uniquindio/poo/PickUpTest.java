package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PickUpTest {
    @Test
    public void testCalcularPrecioAlquiler() {
        PickUpHibrido pickUp = new PickUpHibrido( "Toyota", "Nuevo", "2023", "Automático", 180.0, 2.5, TipoCombustible.HIBRIDO, "Automática", 100_000.0, true, true, false, 5, 4, true, true, 6, true, true, 1200);
        double precioEsperado = 100_000.0 
            + (100_000.0 * 0.15) // Por pasajeros > 4
            + (100_000.0 * 0.20) // Por 4x4
            + (100_000.0 * 0.10) // Por aire acondicionado
            + (100_000.0 * 0.05) // Por cámara reversa
            + (100_000.0 * 0.15) // Por bolsas de aire > 4
            + (100_000.0 * 0.25); // Por capacidad carga > 1000

        // Verificar que el método calcula correctamente
        assertEquals(precioEsperado, pickUp.calcularPrecioAlquiler(), 0.01);
    }

    @Test
    public void testCalcularPrecioVenta() {
        // Crear una instancia del vehículo
        PickUpHibrido pickUp = new PickUpHibrido(
            "Toyota", "Nuevo", "2023", "Automático", 180.0, 2.5, TipoCombustible.HIBRIDO, 
            "Automática", 120_000.0, true, true, false, 
            4, 4, false, true, 3, true, false, 900
        );

        // Calcular el precio esperado manualmente
        double precioEsperado = 120_000.0 
            + (120_000.0 * 0.15) // Por pasajeros <= 4
            + (120_000.0 * 0.15) // Por no ser 4x4
            + (120_000.0 * 0.10) // Por aire acondicionado falso
            + (120_000.0 * 0.05) // Por cámara reversa verdadera
            + (120_000.0 * 0.10) // Por bolsas de aire <= 4
            + (120_000.0 * 0.20); // Por capacidad carga <= 1000

        // Verificar que el método calcula correctamente
        assertEquals(216000.0, pickUp.calcularPrecioVenta(), 0.01);
    }
 }
