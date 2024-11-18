package co.edu.uniquindio.poo;
public class VehiculoHibrido extends Vehiculo implements IHibrido {

    public boolean enchufable;
    public boolean hibridoLigero;

    public VehiculoHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica);
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }

    @Override
    public double calcularPrecioAlquiler() {
        double precioBase = super.calcularPrecioAlquiler(); // Precio base de la superclase
        double precioFinal = precioBase;

        // Incremento por tipo de híbrido
        if (enchufable) {
            precioFinal += 40; // Si es enchufable, se incrementa el precio de alquiler
        } else if (hibridoLigero) {
            precioFinal += 30; // Si es híbrido ligero, también se incrementa el precio
        }

        return precioFinal;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioBase = super.calcularPrecioVenta(); // Precio base de la superclase
        double precioFinal = precioBase;

        // Ajuste por estado del vehículo
        if (estado.equalsIgnoreCase("nuevo")) {
            precioFinal += 2500; // Incremento si el vehículo es nuevo
        } else if (estado.equalsIgnoreCase("usado")) {
            precioFinal -= 1200; // Descuento si el vehículo es usado
        }

        // Ajuste por características híbridas
        if (enchufable) {
            precioFinal += 5000; // Si el vehículo es enchufable, incrementamos el precio
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + "]";
    }

    public String determinarEnchufableHibridoLigero() {
        if (enchufable) {
            return "El vehículo es enchufable.";
        } else if (hibridoLigero) {
            return "El vehículo no es enchufable, pero es híbrido ligero.";
        } else {
            return "El vehículo no es enchufable ni híbrido ligero.";
        }
    }
}
