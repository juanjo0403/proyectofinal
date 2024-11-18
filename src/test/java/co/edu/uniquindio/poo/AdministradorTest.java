package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class AdministradorTest {
    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());
    @Test
    public void datosCompletosAdministrador() {
        LOG.info("Iniciando test datos completos Administrador");
        Administrador administrador= new Administrador("Carlos Pérez", "A123", "3001234567", "carlos@admin.com", "admin", "admin_usuario", "12345", true, LocalDate.of(2020, 1, 1), 5000000, "¿Cuál es tu mascota?", "Fluffy");
        assertEquals("Carlos Pérez", administrador.getNombre());
        LOG.info("datosCompletosAdministrador");
    }
    @Test
    public void datosVacios(){
        LOG.info("Iniciando test datosVacios");
        Administrador administrador= new Administrador("Carlos Pérez", "A123", "3001234567", "carlos@admin.com", "admin", "admin_usuario", "12345", true, LocalDate.of(2020, 1, 1), 5000000, "¿Cuál es tu mascota?", "Fluffy");
        assertThrows(Throwable.class, ()-> new Administrador(" ", " ", " ", " ", " ", " ", " ", false, null, 0, " ", " "));
        LOG.info("Finalizando Test datosVacios");
    }
}
