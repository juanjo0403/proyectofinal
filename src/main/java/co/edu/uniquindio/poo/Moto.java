package co.edu.uniquindio.poo;
public class Moto extends Vehiculo {

    public Moto(String marca, String estado, String modelo, String cambios, double velocidadMaxima, double cilindraje,
            TipoCombustible tipoCombustible, String transmision, double precioBase, boolean revisionTecnica) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica);
    }

    @Override
    public double calcularPrecioAlquiler() {
        // Cálculo del precio de alquiler considerando el tipo de combustible y la velocidad máxima
        double precioAlquilerBase = getPrecioBase();
        double ajustePorCombustible = (getTipoCombustible() == TipoCombustible.GASOLINA) ? 0.15 : 0.10; // Gasolina más cara
        double ajustePorVelocidad = (getVelocidadMaxima() > 120) ? 0.20 : 0.10; // Velocidades más altas incrementan el precio
        double ajustePorCilindraje = (getCilindraje() > 500) ? 0.25 : 0.15; // Cilindrajes mayores aumentan el alquiler

        double precioAlquiler = precioAlquilerBase + (precioAlquilerBase * ajustePorCombustible) 
                                    + (precioAlquilerBase * ajustePorVelocidad)
                                    + (precioAlquilerBase * ajustePorCilindraje);

        return precioAlquiler;
    }

    @Override
    public double calcularPrecioVenta() {
        // Cálculo del precio de venta considerando el cilindraje y la velocidad máxima
        double precioVentaBase = getPrecioBase();
        double ajustePorCilindraje = (getCilindraje() > 500) ? 0.30 : 0.15; // Cilindrajes más altos aumentan el precio
        double ajustePorVelocidad = (getVelocidadMaxima() > 120) ? 0.25 : 0.10; // Velocidades más altas aumentan el precio
        double ajustePorTipoCombustible = (getTipoCombustible() == TipoCombustible.GASOLINA) ? 0.20 : 0.10; // Gasolina más cara

        double precioVenta = precioVentaBase + (precioVentaBase * ajustePorCilindraje)
                                + (precioVentaBase * ajustePorVelocidad)
                                + (precioVentaBase * ajustePorTipoCombustible);

        return precioVenta;
    }
}
