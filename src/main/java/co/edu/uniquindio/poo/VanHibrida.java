package co.edu.uniquindio.poo;
public class VanHibrida extends VehiculoHibrido {
    private int numPasajeros;
    private int numPuertas;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean abs;
    
    public VanHibrida(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, int numPasajeros, int numPuertas,
            double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire,
            boolean abs) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, enchufable, hibridoLigero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
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
    @Override
    public String toString() {
        return "VanHibrida [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado + ", enchufable="
                + enchufable + ", numPuertas=" + numPuertas + ", modelo=" + modelo + ", hibridoLigero=" + hibridoLigero
                + ", capacidadMaletero=" + capacidadMaletero + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", aireAcondicionado=" + aireAcondicionado + ", cilindraje=" + cilindraje
                + ", camaraReversa=" + camaraReversa + ", tipoCombustible=" + tipoCombustible + ", numBolsasAire="
                + numBolsasAire + ", transmision=" + transmision + ", abs=" + abs + ", precioBase=" + precioBase
                + ", revisionTecnica=" + revisionTecnica + "]";
    }
    
    
    
}
