package co.edu.uniquindio.poo;
public class PickUpHibrido extends VehiculoHibrido {
    private int numPasajeros;
    private int numPuertas;
    private boolean aireAcondicionado;
    private boolean camaraRevera;
    private int numBolsasAire;
    private boolean abs;
    private boolean cuatroXCuatro;
    private double capacidadCajaCarga;

    public PickUpHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, int numPasajeros, int numPuertas,
            boolean aireAcondicionado, boolean camaraRevera, int numBolsasAire, boolean abs, boolean cuatroXCuatro,
            double capacidadCajaCarga) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, enchufable, hibridoLigero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraRevera = camaraRevera;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.cuatroXCuatro = cuatroXCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public double calcularPrecioAlquiler() {
        // Precio base del alquiler considerando características del vehículo
        double precioAlquilerBase = getPrecioBase();

        // Ajustes por características específicas
        double ajustePorPasajeros = (numPasajeros > 4) ? 0.15 : 0.10; // Más pasajeros, más caro
        double ajustePorCuatroXCuatro = (cuatroXCuatro) ? 0.20 : 0.10; // 4x4 aumenta el precio
        double ajustePorAireAcondicionado = (aireAcondicionado) ? 0.10 : 0.05; // Aire acondicionado aumenta el precio
        double ajustePorCamaraReversa = (camaraRevera) ? 0.05 : 0.02; // Cámara de reversa tiene un ajuste menor
        double ajustePorBolsasAire = (numBolsasAire > 4) ? 0.15 : 0.05; // Más bolsas de aire, más caro
        double ajustePorCapacidadCarga = (capacidadCajaCarga > 1000) ? 0.25 : 0.15; // Capacidad de carga mayor a 1000kg

        // Calcular precio de alquiler total
        double precioAlquiler = precioAlquilerBase + (precioAlquilerBase * ajustePorPasajeros)
                                + (precioAlquilerBase * ajustePorCuatroXCuatro)
                                + (precioAlquilerBase * ajustePorAireAcondicionado)
                                + (precioAlquilerBase * ajustePorCamaraReversa)
                                + (precioAlquilerBase * ajustePorBolsasAire)
                                + (precioAlquilerBase * ajustePorCapacidadCarga);

        return precioAlquiler;
    }

    @Override
    public double calcularPrecioVenta() {
        // Precio base de la venta considerando características del vehículo
        double precioVentaBase = getPrecioBase();

        // Ajustes por características específicas
        double ajustePorPasajeros = (numPasajeros > 4) ? 0.20 : 0.15; // Más pasajeros, más caro
        double ajustePorCuatroXCuatro = (cuatroXCuatro) ? 0.25 : 0.15; // 4x4 incrementa el precio
        double ajustePorAireAcondicionado = (aireAcondicionado) ? 0.15 : 0.10; // Aire acondicionado tiene mayor impacto en el precio de venta
        double ajustePorCamaraReversa = (camaraRevera) ? 0.10 : 0.05; // Cámara de reversa tiene menor impacto
        double ajustePorBolsasAire = (numBolsasAire > 4) ? 0.20 : 0.10; // Más bolsas de aire aumentan el precio
        double ajustePorCapacidadCarga = (capacidadCajaCarga > 1000) ? 0.30 : 0.20; // Vehículos con gran capacidad de carga tienen un precio más alto

        // Calcular precio de venta total
        double precioVenta = precioVentaBase + (precioVentaBase * ajustePorPasajeros)
                            + (precioVentaBase * ajustePorCuatroXCuatro)
                            + (precioVentaBase * ajustePorAireAcondicionado)
                            + (precioVentaBase * ajustePorCamaraReversa)
                            + (precioVentaBase * ajustePorBolsasAire)
                            + (precioVentaBase * ajustePorCapacidadCarga);

        return precioVenta;
    }

    @Override
    public String toString() {
        return "PickUpHibrido [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado
                + ", enchufable=" + enchufable + ", numPuertas=" + numPuertas + ", modelo=" + modelo
                + ", hibridoLigero=" + hibridoLigero + ", cambios=" + cambios + ", aireAcondicionado="
                + aireAcondicionado + ", velocidadMaxima=" + velocidadMaxima + ", camaraRevera=" + camaraRevera
                + ", cilindraje=" + cilindraje + ", numBolsasAire=" + numBolsasAire + ", tipoCombustible="
                + tipoCombustible + ", abs=" + abs + ", cuatroXCuatro=" + cuatroXCuatro + ", transmision=" + transmision
                + ", capacidadCajaCarga=" + capacidadCajaCarga + ", precioBase=" + precioBase + ", revisionTecnica="
                + revisionTecnica + "]";
    }
}