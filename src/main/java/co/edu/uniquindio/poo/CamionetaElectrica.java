package co.edu.uniquindio.poo;
public class CamionetaElectrica extends VehiculoElectrico {
    
    // Atributos de la clase
    private int numPasajeros;
    private int numPuertas;
    private double capacidadMaletero;
    private double aireAcondicionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private int numBolsasAire;
    private boolean abs;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean permanenciaCarril;
    private boolean cuatroXCuatro;
    
    // Constructor
    public CamionetaElectrica(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
                              double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
                              boolean revisionTecnica, String autonomia, String tiempoPromedio, int numPasajeros,
                              int numPuertas, double capacidadMaletero, double aireAcondicionado, boolean camaraReversa,
                              boolean velocidadCrucero, int numBolsasAire, boolean abs, boolean sensoresColision,
                              boolean sensorTraficoCruzado, boolean permanenciaCarril, boolean cuatroXCuatro) {
        
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
              revisionTecnica, autonomia, tiempoPromedio);
        
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.permanenciaCarril = permanenciaCarril;
        this.cuatroXCuatro = cuatroXCuatro;
    }
    
    // Métodos Getters y Setters
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

    public double getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(double aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isPermanenciaCarril() {
        return permanenciaCarril;
    }

    public void setPermanenciaCarril(boolean permanenciaCarril) {
        this.permanenciaCarril = permanenciaCarril;
    }

    public boolean isCuatroXCuatro() {
        return cuatroXCuatro;
    }

    public void setCuatroXCuatro(boolean cuatroXCuatro) {
        this.cuatroXCuatro = cuatroXCuatro;
    }

    @Override
    public String toString() {
        return "CamionetaElectrica [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado
                + ", autonomia=" + autonomia + ", modelo=" + modelo + ", numPuertas=" + numPuertas + ", tiempoPromedio="
                + tiempoPromedio + ", cambios=" + cambios + ", capacidadMaletero=" + capacidadMaletero
                + ", velocidadMaxima=" + velocidadMaxima + ", aireAcondicionado=" + aireAcondicionado + ", cilindraje="
                + cilindraje + ", camaraReversa=" + camaraReversa + ", tipoCombustible=" + tipoCombustible
                + ", velocidadCrucero=" + velocidadCrucero + ", transmision=" + transmision + ", numBolsasAire="
                + numBolsasAire + ", precioBase=" + precioBase + ", Abs=" + abs + ", revisionTecnica=" + revisionTecnica
                + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", permanenciaCarril=" + permanenciaCarril + ", cuatroXCuatro=" + cuatroXCuatro + "]";
    }


    @Override
public double calcularPrecioAlquiler() {
    double precioBase = super.calcularPrecioAlquiler(); // Precio base de la superclase
    double precioFinal = precioBase;

    // Lógica de ajuste para los diferentes atributos
    if (numPasajeros > 7) {
        precioFinal += 100; // Aumento si la camioneta tiene más de 7 pasajeros
    }

    if (capacidadMaletero > 600) {
        precioFinal += 40; // Aumento por maletero grande
    }

    return precioFinal;
}

@Override
public double calcularPrecioVenta() {
    double precioBase = super.calcularPrecioVenta(); // Precio base de la superclase
    double precioFinal = precioBase;

    // Ajuste por características adicionales
    if (cuatroXCuatro) {
        precioFinal += 5000; // Aumento por tracción 4x4
    }

    if (abs) {
        precioFinal += 1000; // Aumento por sistema ABS
    }

    // Ajuste por estado del vehículo
    if (estado.equalsIgnoreCase("nuevo")) {
        precioFinal += 7000; // Aumento si el vehículo es nuevo
    } else if (estado.equalsIgnoreCase("usado")) {
        precioFinal -= 3000; // Descuento si el vehículo es usado
    }

    return precioFinal;
}

    



}    