package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    private static final Logger LOG = Logger.getLogger(ClienteTest.class.getName());
    @Test
    public void datosCompletosCliente(){
        LOG.info("Iniciando test datos completos Cliente");
        Cliente cliente= new Cliente("Juan Pérez", "C001", "3001122333", "juan@cliente.com", "cliente", "password", true, LocalDate.of(2023, 5, 10));
        assertEquals("Juan Pérez", cliente.getNombre());
        assertEquals("cliente", cliente.getUsuario());
        assertTrue(cliente.isActivo());
        LOG.info("datosCompletosCliente");
    }
    @Test
    public void testAutenticacionIncorrecta(){
        LOG.info("Iniciando Autentificación Incorrecta");
        Cliente cliente = new Cliente("Pedro Gomez", "876543210", "3102345678", "pedro@example.com", "pedro789", "contraseña789", true, LocalDate.of(2023, 2, 5));
        assertFalse(cliente.autenticar("pedro123", "contraseña123"));
        LOG.info("Finalizando Autentificación Incorrecta");
    }
}
