package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
public class MotoTest {
   private static final Logger LOG = Logger.getLogger(TransaccionTest.class.getName());
   @Test
   public void testCalcularPrecioAlquilerGasolinaAltaVelocidad(){
    LOG.info("iniciando");
    Moto moto= new Moto("Yamaha", "nuevo", "YZF-R1", "Manual", 180, 1000, TipoCombustible.GASOLINA, "Manual", 50000, true);
    double precioAlquiler= moto.calcularPrecioAlquiler();
    assertEquals(80000.0,precioAlquiler,0.1, "el preciode alquiler debería considerar el tipo de combustible y la velocidad");
    LOG.info("Finalizando");
   }
   @Test
   public void testCalcularPrecioAlquilerElectricaBajaVelocidad(){
    LOG.info("Iniciando");
    Moto moto= new Moto("Harley", "nuevo", "LiveWire", "Automático", 110, 120, TipoCombustible.ELECTRICO, "Automático", 50000, true);
    double precioAlquiler= moto.calcularPrecioAlquiler();
    assertEquals(67500.0, precioAlquiler, 0.1, "El precio de alquiler debería considerar el tipo de combustible y la velocidad.");
    LOG.info("finalizando");
   }
   @Test
   public void testAtributosMoto(){
    LOG.info("Iniciando");
    Moto moto = new Moto("Ducati", "nuevo", "Panigale V4", "Manual", 300, 1100, TipoCombustible.GASOLINA, "Manual", 70000, true);
    assertEquals("Ducati", moto.getMarca(), "La marca de la moto debería ser Ducati");
    assertEquals("nuevo", moto.getEstado(), "El estado de la moto debería ser nuevo");
    assertEquals(300, moto.getVelocidadMaxima(), "La velocidad máxima debería ser 300 km/h");
    assertEquals(1100, moto.getCilindraje(), "El cilindraje debería ser 1100 cc");
    assertEquals(TipoCombustible.GASOLINA, moto.getTipoCombustible(), "El tipo de combustible debería ser gasolina");
    LOG.info("Finalizando");
   }
}
