package co.edu.uniquindio.poo;
public abstract class Vehiculo {
    public String marca;
    public String estado;
    public String modelo;
    public String cambios;
    public double velocidadMaxima;
    public double cilindraje;
    public TipoCombustible tipoCombustible;
    public String transmision;
    public double precioBase;
    public boolean revisionTecnica;

    // Constructor
    public Vehiculo(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
                    double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase, boolean revisionTecnica) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.precioBase = precioBase;
        this.revisionTecnica = revisionTecnica;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", estado=" + estado + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", tipoCombustible=" 
                + tipoCombustible + ", transmision=" + transmision + ", precioBase=" + precioBase + ", revisionTecnica=" 
                + revisionTecnica + "]";
    }

    // Método para calcular el precio de venta
    public double calcularPrecioVenta() {
        double precioVenta = this.precioBase;

        // Si el vehículo ha pasado la revisión técnica, aumentar el precio un 10%
        if (this.revisionTecnica) {
            precioVenta *= 1.10; // Aumento del 10% si pasó la revisión
        }

        // Si la velocidad máxima es superior a 200 km/h, aumentar el precio un 5%
        if (this.velocidadMaxima > 200) {
            precioVenta *= 1.05; // Aumento del 5% por velocidad
        }

        return precioVenta;
    }

    // Método para calcular el precio de alquiler
    public double calcularPrecioAlquiler() {
        double precioAlquiler = 50; // Precio base para el alquiler

        // Si el cilindraje es superior a 2000, aumentar el alquiler un 20%
        if (this.cilindraje > 2000) {
            precioAlquiler *= 1.20; // Aumento del 20% si el cilindraje es alto
        }

        // Si la transmisión es automática, aumentar el alquiler un 10%
        if (this.transmision.equalsIgnoreCase("Automática")) {
            precioAlquiler *= 1.10; // Aumento del 10% por transmisión automática
        }

        return precioAlquiler;
    }

    // Método para determinar si el vehículo ha pasado la revisión técnica
    public boolean determinarRevisionTecnica() {
        return this.revisionTecnica; // Retorna true si ha pasado la revisión, false si no
    }
}
