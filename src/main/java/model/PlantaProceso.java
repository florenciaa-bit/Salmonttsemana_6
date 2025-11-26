package model;

public class PlantaProceso extends UnidadOperativo{
    private int capacidadProceso;

    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    public int getCapacidadProceso() {
        return capacidadProceso;
    }

    public void setCapacidadProceso(int capacidadProceso) {
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public String toString() {
        return "PlantaProceso{" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                ", capacidadProceso=" + capacidadProceso +
                '}';
    }
}
