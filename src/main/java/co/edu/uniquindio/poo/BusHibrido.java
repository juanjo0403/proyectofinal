package co.edu.uniquindio.poo;
public class BusHibrido extends VehiculoHibrido {
    private int numPasajeros;
    private int numPuertas;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean abs;
    private int numEjes;
    private int numSalidasEmergencia;
    
    public BusHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, int numPasajeros, int numPuertas,
            double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean abs,
            int numEjes, int numSalidasEmergencia) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, enchufable, hibridoLigero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
    }
    
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
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

    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }

    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
    }

    @Override
public double calcularPrecioAlquiler() {
    double precioBaseAlquiler = super.calcularPrecioAlquiler();
    // Ejemplo: incremento por características adicionales
    if (aireAcondicionado) {
        precioBaseAlquiler += 100; // Incremento si tiene aire acondicionado
    }
    if (camaraReversa) {
        precioBaseAlquiler += 50;  // Incremento si tiene cámara de reversa
    }
    return precioBaseAlquiler;
}

@Override
public double calcularPrecioVenta() {
    double precioBaseVenta = super.calcularPrecioVenta();
    // Ejemplo: ajuste del precio según características del bus
    if (abs) {
        precioBaseVenta += 500;  // Incremento por ABS
    }
    precioBaseVenta += numBolsasAire * 150; // Cada bolsa de aire incrementa el precio
    return precioBaseVenta;
}
@Override
public String toString() {
    return "Bus Híbrido {" +
           "\n  Marca: " + marca +
           "\n  Modelo: " + modelo +
           "\n  Estado: " + estado +
           "\n  Número de Pasajeros: " + numPasajeros +
           "\n  Número de Puertas: " + numPuertas +
           "\n  Capacidad del Maletero: " + capacidadMaletero + " litros" +
           "\n  Aire Acondicionado: " + (aireAcondicionado ? "Sí" : "No") +
           "\n  Cámara de Reversa: " + (camaraReversa ? "Sí" : "No") +
           "\n  Número de Bolsas de Aire: " + numBolsasAire +
           "\n  Sistema de Frenos ABS: " + (abs ? "Sí" : "No") +
           "\n  Número de Ejes: " + numEjes +
           "\n  Número de Salidas de Emergencia: " + numSalidasEmergencia +
           "\n  Enchufable: " + (enchufable ? "Sí" : "No") +
           "\n  Híbrido Ligero: " + (hibridoLigero ? "Sí" : "No") +
           "\n  Tipo de Combustible: " + tipoCombustible +
           "\n  Velocidad Máxima: " + velocidadMaxima + " km/h" +
           "\n  Cilindraje: " + cilindraje + " cc" +
           "\n  Cambios: " + cambios +
           "\n  Transmisión: " + transmision +
           "\n  Precio Base: $" + precioBase +
           "\n  Revisión Técnica: " + (revisionTecnica ? "Sí" : "No") +
           "\n}";
}

    
    
}
