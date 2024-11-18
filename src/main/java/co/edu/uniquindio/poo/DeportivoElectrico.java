package co.edu.uniquindio.poo;
public class DeportivoElectrico extends VehiculoElectrico {
    private int numPasajeros;
    private int numPuertas;
    private int numBolsasAire;
    private int numCaballosFuerza;
    private double tiempoParaAlcanzar100KmH;

    // Constructor
    public DeportivoElectrico(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, String autonomia, String tiempoPromedio, int numPasajeros, int numPuertas,
            int numBolsasAire, int numCaballosFuerza, double tiempoParaAlcanzar100KmH) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, autonomia, tiempoPromedio);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.numCaballosFuerza = numCaballosFuerza;
        this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
    }

    // Getters y Setters
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

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public int getNumCaballosFuerza() {
        return numCaballosFuerza;
    }

    public void setNumCaballosFuerza(int numCaballosFuerza) {
        this.numCaballosFuerza = numCaballosFuerza;
    }

    public double getTiempoParaAlcanzar100KmH() {
        return tiempoParaAlcanzar100KmH;
    }

    public void setTiempoParaAlcanzar100KmH(double tiempoParaAlcanzar100KmH) {
        this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
    }

    // Métodos para calcular el precio de alquiler y venta
    @Override
public double calcularPrecioAlquiler() {
    double precioBase = super.calcularPrecioAlquiler(); // Precio base de la superclase
    double precioFinal = precioBase;

    // Ajuste según la potencia del vehículo (caballos de fuerza)
    if (numCaballosFuerza > 400) {
        precioFinal += 200; // Aumento si el vehículo tiene más de 400 caballos de fuerza
    }

    // Ajuste por rendimiento de aceleración
    if (tiempoParaAlcanzar100KmH < 3.5) {
        precioFinal += 150; // Aumento si el vehículo alcanza los 100 km/h en menos de 3.5 segundos
    }

    return precioFinal;
}

@Override
public double calcularPrecioVenta() {
    double precioBase = super.calcularPrecioVenta(); // Precio base de la superclase
    double precioFinal = precioBase;

    // Ajuste por potencia
    if (numCaballosFuerza > 400) {
        precioFinal += 10000; // Aumento por alta potencia
    }

    // Ajuste por rendimiento
    if (tiempoParaAlcanzar100KmH < 3.5) {
        precioFinal += 5000; // Aumento por rápido tiempo de aceleración
    }

    // Ajuste por estado del vehículo
    if (estado.equalsIgnoreCase("nuevo")) {
        precioFinal += 15000; // Aumento si el vehículo es nuevo
    } else if (estado.equalsIgnoreCase("usado")) {
        precioFinal -= 5000; // Descuento si el vehículo es usado
    }

    return precioFinal;
}


    // Método toString para representar el vehículo
    @Override
    public String toString() {
        return "DeportivoElectrico [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado
                + ", autonomia=" + autonomia + ", modelo=" + modelo + ", numPuertas=" + numPuertas + ", tiempoPromedio="
                + tiempoPromedio + ", cambios=" + cambios + ", numBolsasAire=" + numBolsasAire + ", velocidadMaxima="
                + velocidadMaxima + ", numCaballosFuerza=" + numCaballosFuerza + ", cilindraje=" + cilindraje
                + ", tiempoParaAlcanzar100KmH=" + tiempoParaAlcanzar100KmH + ", tipoCombustible=" + tipoCombustible
                + ", transmision=" + transmision + ", precioBase=" + precioBase + ", revisionTecnica=" + revisionTecnica
                + "]";
    }
}
