package co.edu.uniquindio.poo;
public class CamionHibrido extends VehiculoHibrido {
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean abs;
    private int numEjes;
    private String tipoCamion;

    // Constructor
    public CamionHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
                         double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
                         boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, double capacidadCarga,
                         boolean aireAcondicionado, boolean frenosAire, boolean abs, int numEjes, String tipoCamion) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
              revisionTecnica, enchufable, hibridoLigero);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.numEjes = numEjes;
        this.tipoCamion = tipoCamion;
    }

    // Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    // Método para calcular el precio de alquiler
    @Override
    public double calcularPrecioAlquiler() {
        double precioBase = super.calcularPrecioAlquiler();
        double precioFinal = precioBase;

        // Incremento por capacidad de carga
        if (capacidadCarga > 2000) {
            precioFinal += 100; // Precio adicional si la capacidad de carga es alta
        }

        // Incremento por número de ejes
        if (numEjes > 2) {
            precioFinal += 75; // Precio adicional si tiene más de 2 ejes
        }

        // Características adicionales
        if (aireAcondicionado) {
            precioFinal += 50; // Precio adicional si tiene aire acondicionado
        }
        if (frenosAire) {
            precioFinal += 40; // Precio adicional si tiene frenos de aire
        }
        if (abs) {
            precioFinal += 60; // Precio adicional si tiene sistema ABS
        }

        return precioFinal;
    }

    // Método para calcular el precio de venta
    @Override
    public double calcularPrecioVenta() {
        double precioBase = super.calcularPrecioVenta();
        double precioFinal = precioBase;

        // Ajuste del precio según el estado del camión
        if (estado.equalsIgnoreCase("nuevo")) {
            precioFinal += 10000; // Incremento si el camión es nuevo
        } else if (estado.equalsIgnoreCase("usado")) {
            precioFinal -= 5000; // Descuento si el camión es usado
        }

        // Ajuste por características específicas
        if (capacidadCarga > 3000) {
            precioFinal += 2000; // Precio adicional si la capacidad de carga es muy alta
        }
        if (numEjes > 2) {
            precioFinal += 1500; // Precio adicional por más ejes
        }
        if (aireAcondicionado) {
            precioFinal += 500; // Precio adicional si tiene aire acondicionado
        }
        if (frenosAire) {
            precioFinal += 700; // Precio adicional si tiene frenos de aire
        }
        if (abs) {
            precioFinal += 800; // Precio adicional si tiene sistema ABS
        }

        return precioFinal;
    }

    // Método toString
    @Override
    public String toString() {
        return "CamionHibrido [marca=" + marca + ", capacidadCarga=" + capacidadCarga + ", estado=" + estado
                + ", enchufable=" + enchufable + ", modelo=" + modelo + ", aireAcondicionado=" + aireAcondicionado
                + ", hibridoLigero=" + hibridoLigero + ", cambios=" + cambios + ", frenosAire=" + frenosAire
                + ", velocidadMaxima=" + velocidadMaxima + ", abs=" + abs + ", cilindraje=" + cilindraje + ", numEjes="
                + numEjes + ", tipoCamion=" + tipoCamion + ", tipoCombustible=" + tipoCombustible + ", transmision="
                + transmision + ", precioBase=" + precioBase + ", revisionTecnica=" + revisionTecnica + "]";
    }
}
