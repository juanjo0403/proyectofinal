package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class VentaTest {
    private static final Logger LOG = Logger.getLogger(VentaTest.class.getName());
    @Test
    public void testVentaCompletada(){
        LOG.info("iniciando Test");
        Venta venta1 = new Venta("7889", null, null, null, LocalDate.now(), 8000000, "Completada",8000000);
        assertTrue(venta1.getEstadoTransaccion().equals("Completada"));
        LOG.info("Finalizando Test");
    }
    @Test
    public void testToString(){
        Venta venta2 = new Venta("7569", null, null, null, LocalDate.now(), 0.0, "Cancelada", 0.0);
        String expectedString= "Venta {\n Monto Venta: 0.0\n ID Transacción: 7569\n Vehículo: null\n Cliente: null\n Empleado: null\n Fecha: " + LocalDate.now() + "\n Estado: Cancelada\n}";
        assertEquals(expectedString, venta2.toString());
    }
}
