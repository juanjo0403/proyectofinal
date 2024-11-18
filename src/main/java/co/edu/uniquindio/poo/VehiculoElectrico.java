package co.edu.uniquindio.poo;
public class VehiculoElectrico extends Vehiculo implements IElectrico {
    public String autonomia;
    public String tiempoPromedio;

    public VehiculoElectrico(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, String autonomia, String tiempoPromedio) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica);
        this.autonomia = autonomia;
        this.tiempoPromedio = tiempoPromedio;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(String tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    @Override
    public String toString() {
        return super.toString() + " VehiculoElectrico [autonomia=" + autonomia + ", tiempoPromedio=" + tiempoPromedio + "]";
    }

    @Override
    public double calcularPrecioAlquiler() {
        double precioBase = super.calcularPrecioAlquiler(); // Precio base de la superclase
        double precioFinal = precioBase;

        // Incremento por autonomía
        if (Integer.parseInt(autonomia) > 300) { // Suponemos que la autonomía se expresa en km
            precioFinal += 50; // Si la autonomía es mayor a 300 km, sumamos un adicional
        }

        // Incremento por tiempo de carga
        if (Double.parseDouble(tiempoPromedio) < 1.5) { // Tiempo promedio en horas
            precioFinal += 30; // Si el tiempo de carga es menor a 1.5 horas, sumamos un adicional
        }

        return precioFinal;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioBase = super.calcularPrecioVenta(); // Precio base de la superclase
        double precioFinal = precioBase;

        // Ajuste por estado del vehículo
        if (estado.equalsIgnoreCase("nuevo")) {
            precioFinal += 3000; // Incremento si el vehículo es nuevo
        } else if (estado.equalsIgnoreCase("usado")) {
            precioFinal -= 1000; // Descuento si el vehículo es usado
        }

        // Ajuste por autonomía
        precioFinal += Integer.parseInt(autonomia) * 10; // Cada km de autonomía suma un valor al precio

        return precioFinal;
    }

    @Override
    public String obtenerAutonomia() {
        return "La autonomía del vehiculo eléctrico es: " + autonomia + "km";
    }

    @Override
    public String obtenerTiempoPromedio() {
        return "El tiempo promedio en que demora realizar una carga es: " + tiempoPromedio + "h";
    }
}
