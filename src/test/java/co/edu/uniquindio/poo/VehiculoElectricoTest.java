package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VehiculoElectricoTest {
    @Test
    public void testCalcularPrecioAlquiler() {
        VehiculoElectrico vehiculo = new VehiculoElectrico("Tesla", "Nuevo", "Model S", "Automático", 250.0, 0, TipoCombustible.ELECTRICO, "Automática", 50, true, "400", "1.2");
        assertEquals(135.0, vehiculo.calcularPrecioAlquiler(), 0.1);
    }
    @Test
    public void testCalcularPrecioVenta() {
        VehiculoElectrico vehiculoNuevo = new VehiculoElectrico("Tesla", "Nuevo", "Model 3", "Automático", 230.0, 0, TipoCombustible.ELECTRICO, "Automática", 60000.0, true, "400", "2.0");
        assertEquals(76300.0, vehiculoNuevo.calcularPrecioVenta(), 0.1);
        VehiculoElectrico vehiculoUsado = new VehiculoElectrico("Nissan", "Usado", "Leaf", "Automático", 180.0, 0, TipoCombustible.ELECTRICO, "Automática", 30000.0, false, "200", "3.0");
        assertEquals(31000.0, vehiculoUsado.calcularPrecioVenta(), 0.1);
    }
    @Test
    public void testObtenerAutonomiaYTiempoPromedio() {
        VehiculoElectrico vehiculo = new VehiculoElectrico("BMW", "Nuevo", "i3", "Automático", 160.0, 0, TipoCombustible.ELECTRICO, "Automática", 45000.0, true, "300", "1.5");
        assertEquals("La autonomía del vehiculo eléctrico es: 300km", vehiculo.obtenerAutonomia());
        assertEquals("El tiempo promedio en que demora realizar una carga es: 1.5h", vehiculo.obtenerTiempoPromedio());
    }
}
