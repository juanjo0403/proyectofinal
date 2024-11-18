package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class EmpleadoTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());
    @Test
    public void testListasDeVehiculosYClientes(){
        LOG.info("iniciando");
        Empleado empleado1 = new Empleado("juan", "100588", "30245683", "juanj@uq", "123568", "asistente", "juan4568", "04030", true, LocalDate.now(), 1900000);
        empleado1.registrarCliente(new Cliente("Ana", "122333", "30245879", "ana@uqvirtual", "Ana08", "34554", true, LocalDate.now()));
        empleado1.registrarVehiculo(new VehiculoElectrico("Tesla", "nuevo", "2024", "automático", 200, 8000, TipoCombustible.ELECTRICO, "eléctrica",800000000, true, "400","10 horas"));
        assertEquals(1, empleado1.getVehiculos().size());
        assertEquals(1,empleado1.getClientes().size());
        LOG.info("finalizando test");
    }
}
