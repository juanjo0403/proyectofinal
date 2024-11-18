package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeportivoElectricoTest {

    @Test
    void testCalcularPrecioAlquiler() {
        DeportivoElectrico deportivo = new DeportivoElectrico(
                "Tesla", "nuevo", "Modelo S", "Automático", 250, 0, TipoCombustible.ELECTRICO, 
                "Automática", 100000, true, "600", "1", 
                4, 2, 6, 450, 2.9);

        double precioAlquiler = deportivo.calcularPrecioAlquiler();
        assertEquals(485.0, precioAlquiler, 0.1, 
            "El precio de alquiler debería incluir ajustes por potencia y aceleración");
    }

    @Test
    void testCalcularPrecioVentaVehiculoNuevo() {
        DeportivoElectrico deportivo = new DeportivoElectrico(
                "Tesla", "nuevo", "Modelo S", "Automático", 250, 0, TipoCombustible.ELECTRICO, 
                "Automática", 100000, true, "600", "1 hora", 
                4, 2, 6, 450, 2.9);

        double precioVenta = deportivo.calcularPrecioVenta();
        assertEquals(154500.0, precioVenta, 0.1, 
            "El precio de venta debería incluir ajustes por potencia, aceleración y estado nuevo");
    }

    @Test
    void testCalcularPrecioVentaVehiculoUsado() {
        DeportivoElectrico deportivo = new DeportivoElectrico(
                "Tesla", "usado", "Modelo S", "Automático", 250, 0, TipoCombustible.ELECTRICO, 
                "Automática", 100000, true, "600", "1 hora", 
                4, 2, 6, 350, 3.6);

        double precioVenta = deportivo.calcularPrecioVenta();
        assertEquals(115500.00000000001, precioVenta, 0.1, 
            "El precio de venta debería incluir ajustes por estado usado");
    }

    @Test
    void testAtributosEspecificos() {
        DeportivoElectrico deportivo = new DeportivoElectrico(
                "Tesla", "nuevo", "Modelo S", "Automático", 250, 0, TipoCombustible.ELECTRICO, 
                "Automática", 100000, true, "600 km", "1 hora", 
                4, 2, 2, 450, 2.9);

        assertEquals(4, deportivo.getNumPasajeros(), "El número de pasajeros debería ser 4");
        assertEquals(2, deportivo.getNumPuertas(), "El número de puertas debería ser 2");
        assertEquals(2, deportivo.getNumBolsasAire(), "El número de bolsas de aire debería ser 2");
        assertEquals(450, deportivo.getNumCaballosFuerza(), "El número de caballos de fuerza debería ser 450");
        assertEquals(2.9, deportivo.getTiempoParaAlcanzar100KmH(), 
            "El tiempo para alcanzar 100 km/h debería ser 2.9 segundos");
    }
}
